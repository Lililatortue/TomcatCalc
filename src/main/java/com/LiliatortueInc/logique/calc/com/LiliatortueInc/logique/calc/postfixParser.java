package com.LiliatortueInc.logique.calc;
import java.util.Stack;
import com.LiliatortueInc.logique.calc.precedence;

public class postfixParser {
	
	private Stack<Character> stack;
	private StringBuilder PostfixStr;
	public postfixParser() {
		stack=new Stack<Character>();
		PostfixStr=new StringBuilder();
	}
	//transformer en postfix assume que la formule est bonne
	public void InfixToPostfix(String str) 
	{
		
		PostfixStr.setLength(0);
    	stack.clear();
    	
		for(char ch : str.toCharArray()){
			if(Character.isDigit(ch)) {
				PostfixStr.append(ch);
			}
			else if(ch=='+'||ch=='-'||ch=='/'||ch=='*') {
				
					while((!stack.empty()) && precedenceCheck(ch)) {
						PostfixStr.append(stack.pop());
					}
				
				stack.push(ch);
			}
		}
		
		while(!stack.empty()) {
			PostfixStr.append(stack.pop());
		}

	}
	
	private Boolean precedenceCheck(char ch)  {
		if (stack.isEmpty()) return false;
			char buffer=stack.peek();
			 return precedence.chPrecedence(buffer) >= precedence.chPrecedence(ch);
	}
	//output
	public String getPostfix() {
		return this.PostfixStr.toString();
	}
	
}
