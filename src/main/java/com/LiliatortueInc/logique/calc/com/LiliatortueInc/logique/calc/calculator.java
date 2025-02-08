package com.LiliatortueInc.logique.calc;

import java.util.Stack;

// un genre dinterface elle fait le calcule en postfix
public class calculator {
	private String str;
	public calculator(String str) {
		postfixParser parser= new postfixParser();
		parser.InfixToPostfix(str);	
		this.str=parser.getPostfix();
	}
	
	public int calculate() {
		Stack<Integer> calcul= new Stack<>();
		for(Character ch : str.toCharArray()) {
			if(Character.isDigit(ch)){
				calcul.push(ch-'0');
			}
			else {
				 	int b = calcul.pop(); 
		            int a = calcul.pop(); 

		            switch (ch) {
		            case '+': calcul.push(a + b); break;  
	                case '-': calcul.push(a - b); break;  
	                case '*': calcul.push(a * b); break;  
	                case '/': calcul.push(a / b); break;  
				}
			}
			
		}
		return calcul.pop();
	}

}
