package strings;

import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "Hello World";
		String str1 = "Hello World";
		System.out.println(str.length());
		 System.out.println(str.charAt(4));
		 System.out.println(str.substring(6));
		 System.out.println(str.substring(0, 5));
		 System.out.println(str.equals(str1));
		 System.out.println(str.equalsIgnoreCase(str1));
		 System.out.println(str1.compareTo(str));
		 System.out.println(str1.compareToIgnoreCase(str));
		 System.out.println(str.compareTo(str1));
		 System.out.println(str.compareToIgnoreCase(str1));
		 System.out.println(str.contains("World"));
		 System.out.println(str.startsWith("Hello"));
		 System.out.println(str.endsWith("World"));
		 System.out.println(str.indexOf("o"));
	     System.out.println(str.lastIndexOf("o"));
	     System.out.println(str.trim() + "'");
	     System.out.println(str.replace('l', 'y'));
	     System.out.println(str1.replaceAll("\\d", "#"));
	     System.out.println(str1.replaceFirst("\\d", "#"));
	     System.out.println(str.toLowerCase());
	     System.out.println(str.toUpperCase());
	     System.out.println(str.toCharArray());
	     System.out.println(str.isEmpty());
	     System.out.println(String.valueOf(str));
	    

	    





		  







		
		



        



	}

}
