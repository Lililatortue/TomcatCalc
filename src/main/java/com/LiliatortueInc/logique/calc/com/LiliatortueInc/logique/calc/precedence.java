package com.LiliatortueInc.logique.calc;

public  class precedence{
	
	public static int chPrecedence(char ch){
		switch(ch) {
		case '+':case'-':return 1;
		case '*':case'/':return 2;	
		default: return 0;
		}
	}
	
}