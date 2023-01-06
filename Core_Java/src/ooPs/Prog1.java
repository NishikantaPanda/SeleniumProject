package ooPs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) throws FileNotFoundException  {

		System.out.println("My First Java Program"); // Declaration

		File f = new File("File.txt"); // Read File using Scanner Class

		Scanner sc = new Scanner(f);

		while(sc.hasNext()==true) {


			System.out.print(sc.next()+" ");
		}

		System.out.println();
		sc.close();

		/* Object 
		   Class
		   Encapsulation
		   Inheritance
		   Polymorphism
		   Abstraction
		   Interface

		 */

		//Object

		String s = new String("Hema");
		String p = "Hema";

		System.out.println(s.equals(p));
		System.out.println(s==p);

		// StringBuffer

		StringBuffer sb = new StringBuffer("Hema");
		sb.append(" "+"Malini");
		System.out.println(sb);
		String r= sb.toString();
		System.out.println(r+" Actor");
		System.out.println(r);
		r=r+" Actress";
		System.out.println(r);


	}









}
