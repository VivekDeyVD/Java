//import required classes and package
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
//create FindAllDuckNumber class to get all the Duck number in a given range  
class FindAllDuckNumber  
{  
    //main() method start  
    public static void main(String args[])  
    {  
        int range;  
          
        //create scanner class object  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter the value of range");  
          
        //store user entered value into variable range  
        range = sc.nextInt();  
  
        for(int i = 1; i <= range; i++)  
            if(checkNumber(i)){  
                System.out.println(i + " is a Duck number");  
            }  
    }  
  
    // create checkNumber() method that returns true when it founds number Buzz   
    public static boolean checkNumber(int number) {  
  
        // use loop to repeat steps  
        while(number != 0) {  
  // check whether the last digit of the number is zero or not  
            // check whether the last digit of the number is zero or not  
            if(number%10 == 0)  
                return true;    //return true if the number is Duck  
  
            // divide the number by 10 to remove the last digit  
            number = number / 10;  
        }  
  
        return false;   //return false if the number is not Duck  
   }  
}  
