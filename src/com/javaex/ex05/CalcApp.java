package com.javaex.ex05;

import java.io.IOException;
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
        while (true) {

    		System.out.print(">>");
    		String numLine = sc.nextLine();

            if (numLine.equals("/q")) {
                System.out.println("종료합니다.");
                break;
            }
        
            String temp[] = numLine.split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[2]);
            char op = temp[1].charAt(0);
        
        
			switch (op){
				case '+':
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(">>"+add.calculate());
					break;
				case '-':
					Sub sub= new Sub();
					sub.setValue(a, b);
					System.out.println(">>"+sub.calculate());
					break;
	
				case '*':
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(">>"+mul.calculate());
				break;
							
				case '/':
					Div div = new Div();
					div.setValue(a, b);
					try {
							System.out.println(">>"+div.calculate());
					} catch(ArithmeticException e) {
						System.out.println("분모가 0");
					}
				break;
				default:
					System.out.println("알수없는 연산자");

				}	
        }
		sc.close();
    }
}
