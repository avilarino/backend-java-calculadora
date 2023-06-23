package Calculin;

public class Calculin {
	
	int sumar = 0;
	int restar = 0;
	int multi = 0;
	double dividir = 0;
	
	
	Calculin(){
		
	}	
	
	
	public int sumar(int numero1, int numero2) {
		sumar = numero1 + numero2;
		return sumar;
	}
	
	public int restar(int numero1, int numero2) {
		restar = numero1 - numero2;
		return restar;
	}
	
	public int multiplicar(int numero1, int numero2) {
		multi = numero1 * numero2;
		return multi;
	}
	
	public double dividir(int numero1, int numero2) {
		if(numero2 == 0) {
			System.out.print("no se puede dividir");
		} else {
			dividir = numero1 / numero2;
		}
		return dividir;
	}
	
}
