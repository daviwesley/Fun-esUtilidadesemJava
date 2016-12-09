package br.davi.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner input = new Scanner(System.in);
		double deposito=0;
		System.out.print("Entre com um valor double");
		deposito = Double.parseDouble(input.nextLine());
		System.out.println(deposito);
		*/
		  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Eample: 12-25-2103");
	      System.out.print("Enter date: ");
	      String str = sc.nextLine();
	 
	      try {
	         Date date = sdf.parse(str); 
	 
	         sdf = new SimpleDateFormat("d/MMM/yyyy");
	         System.out.println("Date: " + sdf.format(date));
	      } catch (ParseException e) { 
	         System.out.println("Entre com uma data válida");
	      }
	}

}
