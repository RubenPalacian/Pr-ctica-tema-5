
import java.util.Scanner;

public class practicatema5 {

	public static void main(String[] args) {		
		System.out.println("Juego de adivinar un numero");
		System.out.println("---------------------------");

		int numero=(int)(Math.random()*100);
		System.out.println("El número aleatorio es: "+numero);
		System.out.println("Indica un numero entre el 0 y el 100");
		int entrada;
		int contador=0;		
		do {
			entrada=obtenerValor();
			if(entrada>numero) {
				System.out.println("El numero es menor");
			}else if(entrada<numero) {
				System.out.println("El numero es mayor");
			}
			contador++;
		} while(entrada!=numero);
		System.out.println("Has avariguado el numero en " + contador + " intentos.");
	}
	public static int obtenerValor() {
		Scanner sc=new Scanner(System.in);
		int valor=0;		
		while(true){		
				System.out.print("Indica el numero: ");
				valor=sc.nextInt();			
				if(valor<0 || valor>100) {
					System.out.println("El numero tiene que estar entre el 0 y el 100");
				}
				else{				
					break;
				}
		}
		return valor;
	}
}
