import java.util.Scanner;
class fibonacci{
    public static void main(String[] args){
     int first=0;
     int second=1;
     int sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int num = sc.nextInt();
     System.out.println("Fibonacci series:");
     
     for(int i=1;i<=num;i++){
         System.out.println(first);
         sum=first+second;
         first=second;
         second=sum;

     }
     
    }
}