
package classe;
/*
    Function: Function is a sub-program 
    1. Function Declaration // int Name();
    2. Function Defination // int Name(){print Rony}
    3. Function Call // calling a function


    * Function without parameter
    * Function with parameter
    

    *** Specifier *** 
*/
import java.util.Scanner;

public class ClassE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Test Object = new Test();
    }
    /*
    static int Sum(){
        System.out.println("Enter Two Number:");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Summation is :"+(a+b));
        return 0;
    }
    static int Sub(int x,int y){
        System.out.println("Substraction is : "+(x-y));
        return 0;
    }
    */
}

class Test{
    private int id; 
    void DisplayName(){
        System.out.println("Your Name is Roni");
    }
    void MobileModel(){
        System.out.println("Samsung");
    }
}
