import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws ParseException { 
	     int a = 0;
		 do{
			 try {
				 
		         Teste.receba();
		         a=0;
		      } catch (ParseException e) { 
		    	  System.out.println("Data Inválida");
		    	  a=1;
		      }
		 }while(a != 0);	      
	}
	
	public static void receba() throws ParseException{
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/20yy");
		 sdf.setLenient(false);
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Example: 12/05/2016");
	      System.out.print("Digite a data: ");
	      String str = sc.nextLine();
		  Date date = sdf.parse(str); 
	      //sdf = new SimpleDateFormat("dd/mm/yyyy");
          
          System.out.println("Date: " + sdf.format(date));
	}
}
