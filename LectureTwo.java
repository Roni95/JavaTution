package classb;
import java.util.Scanner;
/*
    char - character ( A-Z, a-z, ! @ $ % + - )
    String - string is a collection of character 
    int - integer 
    float - floating . 6 digit
    double - floating . 14 digit

    Rules for variable declaration:
        1. must be start with A-Z, a-z, _ 
        2. only can use A-Z, a-z, _ , 0-9 
        3. keyword can't use as a varibale
        4. white space and special character not allow

    Operator : 
        1. Arithmetic Operator ( + , - , * , / , % )
        2. Assignement Operator ( = , += , -= , *= ) 
        3. Increment and Decreament Operator ( ++ , -- )
        4. Relational Operator ( == , >= , <= , < , > , != ) 
        5. Logical Operator ( && , || , ! )
        
        
    ASCII - American Standard Coded for Information Interchange

    10 % 2 = 0
*/
public class ClassB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your subject number : ");
        int number = input.nextInt();
        if(number >=70 && number <80){
            System.out.println("A");
        }
        else if(number >= 80){
            System.out.println("A+");
        }
        else if(number >=60){
            System.out.println("D");
        }
        else 
            System.out.println("Fail");
        
        /*
        int myPassword = 2243;
        System.out.print("Enter your password : ");
        int userPassword = input.nextInt();
        if(myPassword == userPassword){
            System.out.println("Welcome to the System");
        }
        else{
            System.out.println("Contact the system owner");
        }
        
        /* 
        int a = 5 , b= 6;
        if(a==4 || b==1)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
        
        
        /*
        int number = input.nextInt();
        System.out.print("Enter a number : ");
        if(number % 7 == 0)
        {
            System.out.println("Divisible "); 
        }
        else
        {
            System.out.println("Not Divisible  ");
        }
        
        
        
        /*
        int a = 5, b=6;
        System.out.println(a==b);
        
        int a =5, b=6;
        int c = a+++b; // a= 6, b = 7, b= 13
        System.out.println(a);
        /*
        int test = 10;
        //test = test + number ;
        test *= number;
        System.out.println(test);

        */
    }
    
}
