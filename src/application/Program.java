package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtc;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Produtc produtc = new Produtc(name, price);
		
		
		
		
		System.out.println();
		System.out.println("product data: " + produtc);
           
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
	    int quantity = sc.nextInt();
	    produtc.addProducts(quantity);
	    
	    System.out.println();
		System.out.println("update data: " + produtc);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
	    produtc.removeProducts(quantity);
	    
	    System.out.println();
		System.out.println("update data: " + produtc);
		
	}

}
