import java.util.Scanner;
public class ex06nc {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner ( System.in );
		
		String frase = "", letra = "";
		
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		System.out.print("Entre com uma letra: ");
		letra = leiaStr.nextLine();
		
		for ( int i = 0 ; i < frase.length() ; i++ ) {
			
			if ( ("" + frase.charAt ( i )).equalsIgnoreCase ( letra ) ) {
				
				contador++;
			}
		}
		
		System.out.println ( "Quantidade de \'" + letra + "\': " + contador );
		leiaStr.close();
    }
}
