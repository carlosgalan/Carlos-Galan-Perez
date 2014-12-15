package examen;

import graphics.Rectangle;

import java.util.Scanner;

public class E_03 {

	public static void main(String[] args) {
		Rectangle cuadrado;
		int lado=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Dame el lado del cuadrado ([100,200]):");
		while(true) {
			lado=in.nextInt();
			if(lado<100||lado>200){
				System.out.println("Introduzca un numero entre los valores determinados:");
			}
			else{
				cuadrado=new Rectangle(0,0,lado,lado);
				break;
			}
		}
		
		

	}

}
