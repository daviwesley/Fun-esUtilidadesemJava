package br.davi.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws ParseException { 
	 
	      try {
	         Teste.receba();
	      } catch (ParseException e) { 
	    	  System.out.println("Data Inválida");
	    	  Teste.receba();
	         
	      }
	}
	
	public static void receba() throws ParseException{
		  SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Eample: 12-25-2103");
	      System.out.print("Enter date: ");
	      String str = sc.nextLine();
		  Date date = sdf.parse(str); 
		 
         sdf = new SimpleDateFormat("d/mm/yyyy");
         System.out.println("Date: " + sdf.format(date));
	}

}
