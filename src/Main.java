import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baraja mibaraja = new Baraja();
		
		Scanner sc = new Scanner(System.in);
		int opcion = 1;
		
		while(opcion != 0){
			System.out.println("Introduzca una opci�n:");
			System.out.println("1) Barajar");
			System.out.println("2) Dar Carta");
			System.out.println("3) Mostrar mont�n");
			System.out.println("4) Mostrar baraja");
			System.out.println("5) Jugar carta m�s alta");
			System.out.println("0) Salir");
			opcion = sc.nextInt();
			
			switch(opcion){
				
			case 1:
				mibaraja.barajar();
				System.out.println(mibaraja.toString());
				break;
				
			case 2:
				System.out.println(mibaraja.siguienteCarta().toString());
				break;
				
			case 3:
				mibaraja.cartasMonton();
				break;
				
			case 4:
				mibaraja.mostrarBaraja();
				break;
				
			case 5:
				System.out.println("Vamos a jugar a la carta m�s alta!!! Cu�ntos vais a jugar??");
				int jugadores = sc.nextInt();
				
				mibaraja.barajar();
				
				int mayor = 0;
				String palo = "";
				int jugador = 0;
				
				for(int i=0; i<jugadores; i++){
					Carta nuevacarta = mibaraja.siguienteCarta();
					System.out.println(nuevacarta.toString());
					if(nuevacarta.getNumero() > mayor){
					
						mayor = nuevacarta.getNumero();
						palo = nuevacarta.getPalo();
						jugador = i;
					}
				}
				
				System.out.println("la carta mayor es la del jugador n�: " +jugador + " que es " + mayor + " " + palo);
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("Opcion no v�lida!!!");
				break;
				
				
			}
			
		}
	}

}
