import java.util.Scanner;

class factorial{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }
        System.out.println("the factorial of " + n + " is " + fact);
    }
}