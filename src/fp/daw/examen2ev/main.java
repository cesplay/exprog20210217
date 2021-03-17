package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehiculo[]vehiculos=new vehiculo[4];
		
		vehiculos[0]=new coche(5,"a");
		vehiculos[1]=new microbus(2,"b");
		vehiculos[2]=new furgoneta(4,"a");
		vehiculos[3]=new camion(2,"a");
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduceel numero de dias");
		int dias=teclado.nextInt();
		
		for(int i=0;i<=vehiculos.length-1;i++) {
		 if(vehiculos[i] instanceof coche) {
			 coche aux=(coche) vehiculos[i];
			 System.out.println(aux.getPrecioAlquiler(dias));
		 }
		 if(vehiculos[i] instanceof furgoneta) {
			 furgoneta aux=(furgoneta) vehiculos[i];
			 System.out.println(aux.getPrecioAlquiler(dias));
		 }
		 if(vehiculos[i] instanceof camion) {
			 camion aux=(camion) vehiculos[i];
			 System.out.println(aux.getPrecioAlquiler(dias));
		 }
		 if(vehiculos[i] instanceof microbus) {
			 microbus aux=(microbus) vehiculos[i];
			 System.out.println(aux.getPrecioAlquiler(dias));
		 }
		}
		
		
	}

}
