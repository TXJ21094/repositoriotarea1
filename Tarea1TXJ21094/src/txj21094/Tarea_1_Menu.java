package txj21094;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tarea_1_Menu {

	public static void main(String[] args) {		
		int num;
		String cadena = new String();		
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("\nMENU DE OPCIONES: \n"
					+ "--------------------------- \n");
			System.out.println("Presione 1: Muestra compara dos números \n"
					+ "Presione 2: Muestra caracter incluido en cadena \n"
					+ "Presione 3: Muestra vocal aleatoria \n"
					+ "Presione 4: Muestra fecha/hora actual \n"
					+ "Presione 0: Termina programa ");
			System.out.println("---------------------------");
			System.out.print("Introduce una opción:");
			num = sc.nextInt();
			cadena = sc.nextLine();
			System.out.println();

			switch(num) {
			
			case 0:
				
				System.out.println("Programa finalizado");
				break;

			case 1:
				int num1,num2;
				System.out.print("Introdoce número entero 1: ");
				num1 = sc.nextInt();
				System.out.print("Introduce número entero 2: ");
				num2 = sc.nextInt();
				System.out.println();
				
				if(num1 == num2) {
					System.out.println("el primer número indicado '" + num1 + "' es igual que el segundo '"+ num2 + "'\n");				
				}
				else{					
					if(num2 > num1) {
						System.out.println("El segundo número indicado '" + num2 + "' es mayor que el primero '"+ num1 + "'\n");
						}
						else {
							System.out.println("El primer número indicado '" + num1 + "' es mayor que segundo '"+ num2 + "'\n");
						}
				}
				break;
			
			case 2:
				int longitud;
				char caracter;
				
				do {
					System.out.print("introduce una cadena de más de 1 caracter: ");
					cadena = sc.nextLine();
					longitud = cadena.length();
				}while(longitud < 2);
				
				System.out.print("introduce un caracter: ");
				caracter = sc.next().charAt(0);
				System.out.println();
				String caracter_s = String.valueOf(caracter);
				boolean contenido = false;
				for(int i=0; i<=(longitud)-1; i++) {
					String letra = String.valueOf(cadena.charAt(i));
					if(caracter_s.equals(letra)) {
						contenido = true;	
					}				
				}	if(contenido) {
					System.out.println("El caracter introducido: "+caracter+" está dentro de la cadena: " + cadena);	
					
				}else {
					System.out.println("El caracter introducido: "+caracter+" no está dentro de la cadena: " + cadena);
				}
						break;
		
			case 3:
			
				char[] vocales = {'a', 'e', 'i', 'o', 'u'};		
				int vocal = (int)(Math.random() * ((4 - 0) + 1)) + 0;
				System.out.println("Vocal generada automáticamente: "+ vocales[vocal]);
				break;
								
			case 4:
				
				LocalDateTime horaActual = LocalDateTime.now();
				System.out.println("Fecha y Hora actual : "+ horaActual.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")));
				break;
			
			default:
				
				System.out.println("Número incorrecto, introduce una opción válida \n \n");
				sc.close();
			}
		
		}while(num !=0);		

	}

}
