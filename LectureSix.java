package classf;

import java.util.Scanner;

/* Constractor -  When a class contain a method with same name that's called by constractor
    Types of Constractor 
        1. Default 
        2. Parameterize Constractor
        3. Non-parameterize Constractor
    
    Contractor overloading....
    Method Overloading....
*/
public class ClassF {
    public static void main(String[] args) {
        /*
        Car First_Car = new Car(4);
        First_Car.seat =10;
        //First_Car.GetCarInfo();
        First_Car.DisplayInfo();
        Car Second_Car = new Car(4);
        Second_Car.gear = 5;
        Second_Car.seat = 6;
        Second_Car.window = 4;
        Second_Car.DisplayInfo();
        */
        //Laptop MyLaptop = new Laptop(5.5);  
        Addition First = new Addition();
        First.Sum(10, 5);
    }
}
class Addition{
    void Sum(int a, int b){
        System.out.println("Summation is : "+(a+b));
    }
}

/*
class Laptop{
    Laptop(){
        System.out.println("Laptop is created");
    }
    Laptop(int a){
        System.out.println("This is also an constractor");
    }
    Laptop(double a){
        System.out.println("Float constractor");
    }
}
*/
/*
class Car{
    int wheel;
    int gear;
    int seat;
    String Brand;
    int window;
    Car(int w){
        wheel = w;
        System.out.println("Wheel Added");
    }
    void GetCarInfo(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Gear No, seat no, window no :");
        gear = input.nextInt();
        seat = input.nextInt();
        window = input.nextInt();
    }
    void DisplayInfo(){
        System.out.println("Wheel No : "+wheel+"\nSeat No :"+seat+"\nWindow No: "+window);
    }
}

*/
/*
class Test{
    Test(int a, int b){
        System.out.println("This is constractor" + (a+b));
    }
    void DisplayName(){
        System.out.println("Name ");
    }
}
*/
