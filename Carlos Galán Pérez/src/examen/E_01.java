package examen;

import java.util.Scanner;

public class E_01 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,negativos=0,positivos=0;
		
		
		System.out.println("numeros a leer: ");
		
		n=in.nextInt();
		
		System.out.println("Escribe " + n + " numeros: ");
		int i,a=0;
		
		for(i=0;i<n;i++){
			a=in.nextInt();
			
		
			if(a<0){
				negativos++;
				
			}
			else{
				
				positivos++;
				
			}
		}
		System.out.println("numeros positivos= " + positivos);
		System.out.println("numeros negativos= " + negativos);
		System.out.println("La media: " + ((a+a)/2));
	}

}
