import java.util.Scanner;

class table{
    public static void main(String [] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("the table of " + a + " is :"); ;
        for(int i=1;i<=10;i++){
            n=a*i;
            System.out.println(a + " * " + i + " = " + n);


        }
    }
}