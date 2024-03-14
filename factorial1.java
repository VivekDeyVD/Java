import java.util.Scanner;

//factorial using recursion

class factorial1{
    public static int factorial(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        int number =5;
        int fact=1;
        int result=factorial(number);
        System.out.println(result);
        
    }
}