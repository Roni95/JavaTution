
package classg;
/*
    Method Overloading.... 
    difference between constractor and method 
    inheritence -  
*/
public class ClassG {
    public static void main(String[] args) {
        
        
        /*
        Addition obj = new Addition();
        obj.Sum(5, 3,4);
        obj.Sum(2, 3);
        obj.Sum(1.5, 2.25);
        */
        /*
        B obj = new B();
        obj.DisplayName();
        */
        B obj = new B();
        obj.Display();
    }
}
class B extends A{
    @Override
    void Display(){
        System.out.println("This is inside class B");
    }
}
class A{
    void Display(){
        System.out.println("This is inside class A");
    }
}


/*
class B extends A{
    void PrintModel(){
        System.out.println("S21 FE");
    }
}
class A{
    void DisplayName(){
        System.out.println("SamSung");
    }
}
*/
/*
class Addtion{
    void Sum(int a, int b){
        System.out.println("Sum of two integer number is : "+(a+b));
    }
    void Sum(double a, double b){
        System.out.println("Sum of two floating number is : "+(a+b));
    }
    void Sum(int x, int y, int z){
        System.out.println("Sum of three number is : "+(x+y+z));
    }
}
*/
