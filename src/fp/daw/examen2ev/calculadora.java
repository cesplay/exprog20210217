package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.println("calculadora >");
		while(!(linea=in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.println("calcukladora >");
		}
		in.readLine();
	}
	static void calcular(String linea) throws Exception {
		Scanner s=new Scanner(linea);
		String[]valores=linea.split("\\s");
		double resultado=0;
		try {
			double numero1=Double.parseDouble(valores[0]);
			double numero2=Double.parseDouble(valores[2]);
			switch(valores[1]) {
				case "+":
					resultado=numero1+numero2;
					break;
				case "-":
					resultado=numero1-numero2;
					break;
				case "*":
					resultado=numero1*numero2;
					break;
				case "/":
					resultado=numero1/numero2;
					break;	
				default:
					throw new Exception();
					
			}
			System.out.println(resultado);
		}catch(NumberFormatException e) {
			System.err.println("expresion incorrecta");
		}catch(IOException e) {
			System.err.println("expresion incorrecta");
		}
		
		s.close();
	}
}
