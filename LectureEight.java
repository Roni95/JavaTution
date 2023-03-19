package classh;

import java.io.FileInputStream;
import java.util.Scanner;

public class ClassH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Class.forName("package1.Test");

        
        System.out.println("Hello");
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        System.out.println("Rest of the code");

        
        
        System.out.println("Hello");
	System.out.println("fec".charAt(6)); // StringIndexOutOfBoundsException
	System.out.println("Rest of the code");

        System.out.println("Hello");
        int[] a = {5,10,15};
        System.out.println(a[6]);//ArrayIndexOutOfBoundsException
        System.out.println("Rest of the code");
        
        /*
        System.out.println("staring ....");
        int first_number = input.nextInt();
        int second_number = input.nextInt();
        int result = first_number/second_number;
        System.out.println("Result is : "+result);
        System.out.println("Enging....");
        /*
        int number;
        number = input.nextInt();
        System.out.println("Number is :"+number);
        */
    }
    
}
