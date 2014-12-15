package modelo;

import java.util.Random;

public class Dado {
	private int Contador,contador2,contador3,contador4,contador5,contador6;
	private int cara;
	private int testAleatorio[] = { 0, 1, 2, 3, 4, 5, 6};
	private String imprimir;

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6)+1;
		return cara;
	}
	public void realizarTest(int numerotiradas){
		
		Random random = new Random();
		numerotiradas= random.nextInt();
		if(testAleatorio[1]==1)
			Contador++;
		else if(testAleatorio[2]==2)
			contador2++;
		else if(testAleatorio[3]==3)
			contador3++;
		else if(testAleatorio[4]==4)
			contador4++;
		else if(testAleatorio[5]==5)
			contador5++;
		else if(testAleatorio[6]==6)
			contador6++;
			
		}
			

	public int getContador2() {
		return contador2;
	}

	public void setContador2(int contador2) {
		this.contador2 = contador2;
	}

	public int getContador3() {
		return contador3;
	}

	public void setContador3(int contador3) {
		this.contador3 = contador3;
	}

	public int getContador4() {
		return contador4;
	}

	public void setContador4(int contador4) {
		this.contador4 = contador4;
	}

	public int getContador5() {
		return contador5;
	}

	public void setContador5(int contador5) {
		this.contador5 = contador5;
	}

	public int getContador6() {
		return contador6;
	}

	public void setContador6(int contador6) {
		this.contador6 = contador6;
	}

	public int getContador() {
		return Contador;
	}

	public void setContador(int Contador) {
		this.Contador = Contador;
	}
}