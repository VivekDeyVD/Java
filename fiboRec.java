import java.util.Scanner;

class fiboRec{

    public static int fibo(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

}