package wrapperclasses;

public class DataTypesUsage {

	public static void main(String[] args) {
		        byte b = 10;               // 1 byte
		        short s = 20;              // 2 bytes
		        int i = 100;               // 4 bytes
		        long l = 1000L;            // 8 bytes
		        float f = 5.5f;            // 4 bytes
		        double d = 10.55;          // 8 bytes
		        char c = 'A';              // 2 bytes
		        boolean bool = true;       // 1 bit
		        String str = "Hello Java"; // Non-primitive

		        // Display all values
		        System.out.println("--- Displaying All Data Types ---");
		        System.out.println("byte: " + b);
		        System.out.println("short: " + s);
		        System.out.println("int: " + i);
		        System.out.println("long: " + l);
		        System.out.println("float: " + f);
		        System.out.println("double: " + d);
		        System.out.println("char: " + c);
		        System.out.println("boolean: " + bool);
		        System.out.println("String: " + str);

		        // Example operations
		        System.out.println("\n--- Some Operations ---");
		        System.out.println("Sum of byte + short = " + (b + s));
		        System.out.println("int multiplied by 2 = " + (i * 2));
		        System.out.println("float + double = " + (f + d));
		        System.out.println("Character ASCII value = " + (int)c);
		        System.out.println("Boolean negation = " + (!bool));
		        System.out.println("String in uppercase = " + str.toUpperCase());
		    }
		


	}


