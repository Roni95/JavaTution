package classc;
import java.util.Scanner;
/*
    char - character ( A-Z, a-z, ! @ $ % + - ) - 1byte
    String - string is a collection of character 
    int - integer - 2byte
    float - floating . 6 digit - 4byte
    double - floating . 14 digit - 8byte

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
        5. Logical Operator ( && - logical AND , || - logical OR , ! )
        
    Expression: 
        a*a=  
        (a+b)*(a+b)
        c = ((k-273)/5)*5;
    Number System: 
        decimal - 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 ... 99 100
        octal -   0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 21 .... 77 100
        binary -  0 1 10 11 100 101 110 111 1000 
    Formation: 
        Arranging output value using printf function and specifier 
    Type Casting: 
        Changing data type one to another ..
    ASCII - American Standard Coded for Information Interchange
    
    next - switch case 
    10 % 2 = 0
*/
public class ClassC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 210;
        double n = 100.1001;
        System.out.printf("%.0f\n", n);
        System.out.println("Type Casted int to double : "+(double)b);
        System.out.println("double to int : "+ (int)n);
        String first = "Abid ";
        String second = "Hasan";
        System.out.println("Summation is :"+ (first+second) );
        /*
        double number = input.nextDouble();
        System.out.printf("%.1f\n", number);
        
        /*
        int number = input.nextInt();
        if(number%3==0 && number%5==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
        
        
        /*
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
        if(a==4 && b==1)
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
