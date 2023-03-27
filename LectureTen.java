package classj;
import java.util.Scanner;
/*
    stringname.chatAt(index)-use to print any character using position/index from a string
    stringname.length() - use to count total number of character from a string
    substring() - a part of a string 
    toUpperCase()
    toLowerCase()
    Difference between 7 , '7' , "7"
    7 - integer
    '7' - character
    "7" - String
    StringName.replace() 
    StringName.indexOf()
    isEmpty()
    StringName.equals()
*/

public class ClassJ {
    public static void main(String[] args) {
        String text ="I love my country and the name is Bangladesh";
        System.out.println(text.isEmpty());
        int index = text.indexOf('l');
        System.out.println(index);
        //System.out.println(text.replace('n','A'));

        //System.out.println(text.replace("love", "hate"));
        
        //System.out.println(text.toUpperCase());
        //System.out.println(text.toLowerCase());
        
        
        String Password= "Abid1234";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String inputPass = in.nextLine();
        System.out.println(Password.equals(inputPass));
        /*
        if(Password.equals(inputPass)){
            System.out.println("Success");
        }else{
            System.out.println("Fail");
        }
        */
        //System.out.println(text.substring(0 , 6));
        //System.out.println(Contact.substring(7));
        //System.out.println(text.length());
        //System.out.println(text.charAt(10));
        //String obj = new String("I love my Land");
    }
    
}
