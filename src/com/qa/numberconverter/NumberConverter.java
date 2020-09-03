package com.qa.numberconverter;

public class NumberConverter {
	
	public void convert(int number) {
		int th, h, t, u;
		th = number / 1000;
		h = (number - (th * 1000)) / 100;
		t = (number - (th * 1000) - (h * 100)) / 10;
		u = (number - (th * 1000) - (h * 100) - (t * 10));
		
		
		if(th > 0) {
			number(th); System.out.print(" thousand ");
		}
		if(h > 0) {
			number(h); System.out.print(" hundred ");
		}
		if(t > 1) {
			number(t * 10);
		}
		if (t == 1) {
			number((t * 10) + u);
		}
		else if (u > 0) {
			number(u);
		}
		
	}
	
	public void number(int number) {
		
		switch(number) {
			case 1: System.out.print("one");break;
			case 2: System.out.print("two");break;
			case 3: System.out.print("tree");break;
			case 4: System.out.print("four");break;
			case 5: System.out.print("five");break;
			case 6: System.out.print("six");break;
			case 7: System.out.print("seven");break;
			case 8: System.out.print("eight");break;
			case 9: System.out.print("nine");break;
			case 10: System.out.print("ten");break;
			case 11: System.out.print("eleven");break;
			case 12: System.out.print("twelve");break;
			case 13: System.out.print("thirteen");break;
			case 14: System.out.print("fourteen");break;
			case 15: System.out.print("fifteen");break;
			case 16: System.out.print("sixteen");break;
			case 17: System.out.print("seventeen");break;
			case 18: System.out.print("eighteen");break;
			case 19: System.out.print("nineteen");break;
			case 20: System.out.print("twenty");break;
			case 30: System.out.print("thirty");break;
			case 40: System.out.print("fourty");break;
			case 50: System.out.print("fifty");break;
			case 60: System.out.print("sixty");break;
			case 70: System.out.print("seventy");break;
			case 80: System.out.print("eighty");break;
			case 90: System.out.print("ninety");break;
			default: System.out.print("");break;
		}
	}
	
}
