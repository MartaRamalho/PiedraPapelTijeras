package Juego;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		menu();
		while(true) {
			int opc = opcion();
			switch(opc) {
				case 1:
					System.out.println("\nIntroduzca su jugada:\n"
							+ "1.Piedra\n"
							+ "2.Papel\n"
							+ "3.Tijeras");	
					jugadaJugador();
					menu();
					break;	
				case 0:
					System.out.println("Cerrando programa.");
					System.exit(0);
					break;
				default:
					System.out.println("\nIntroducir opción válida\n");
					menu();
			}
		}
		
	}

	private static int opcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();	
	}

	private static void jugadaJugador() {
		int opc = opcion();
		int jugada = jugadaPrograma();
		switch(opc) {
		case 1:
			if(jugada==1) {
				System.out.println("Empate. El ordenador ha jugado piedra.\n");
			}
			if(jugada==2) {
				System.out.println("Derrota. El ordenador ha jugado papel.\n");
			}
			if(jugada==3) {
				System.out.println("Victoria. El ordenador ha jugado tijeras.\n");
			}	
			break;		
		case 2:	
			if(jugada==1) {
				System.out.println("Victoria. El ordenador ha jugado piedra.\n");
			}
			if(jugada==2) {
				System.out.println("Empate. El ordenador ha jugado papel.\n");
			}
			if(jugada==3) {
				System.out.println("Derrota. El ordenador ha jugado tijeras.\n");
			}	
			break;	
		case 3:	
			if(jugada==1) {
				System.out.println("Derrota. El ordenador ha jugado piedra.\n");
			}
			if(jugada==2) {
				System.out.println("Victoria. El ordenador ha jugado papel.\n");
			}
			if(jugada==3) {
				System.out.println("Empate. El ordenador ha jugado tijeras.\n");
			}	
			break;	
		default:
			if(jugada==1) {
				System.out.println("Jugada inválida. El ordenador había jugado piedra.\n");
			}
			if(jugada==2) {
				System.out.println("Jugada inválida. El ordenador había jugado papel.\n");
			}
			if(jugada==3) {
				System.out.println("Jugada inválida. El ordenador había jugado tijeras.\n");
			}	
		}
	}
	
	private static int jugadaPrograma() {
		Random rand = new Random();
		return rand.nextInt(3 - 1 + 1) + 1;		
	}
	
	private static void menu() {
		System.out.println("PIEDRA PAPEL TIJERAS\n"
				+ "1.Jugar\n"
				+ "0.Salir");
	}

}
