import java.util.Scanner;

class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int rev=0;

        while(num!=0){
            int rem =num%20;
            rev=(rev*10)+rem;
            num=num/10;
            
        }
        System.out.println("Reversed number is "+rev);
    }
}