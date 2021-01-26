import java.util.Scanner;
public class PrimaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        double saldoiniziale = 1000;
        double tasso = 0;
        double saldofinale = 0;
        System.out.println("Inserisci il tasso da applicare");
        tasso = input.nextDouble();
       
        if( (tasso>0) && (saldoiniziale>0)) 
        {
        	System.out.print("Sono nel IF");
        	//saldofinale = saldoiniziale + saldoiniziale*tasso;
       
        if (tasso >= 0.50) {
        	saldofinale = saldoiniziale + saldoiniziale + saldoiniziale*tasso + 100;
        }//fine if
        	
        else {
        	saldofinale = saldoiniziale + saldoiniziale*tasso;
        }//end else
        System.out.println ("Il saldo finale e:" + saldofinale);
        }
        else
        {
        	System.out.println("Sono nell'ELSE");
        	System.out.print("Errore nel Tasso");
	}
	System.out.print("Fine");
	
	//altrocodice

	