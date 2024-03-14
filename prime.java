import java.util.Scanner;

class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
for(int i=2;i<num;i++){
    if(num%i==0){
        System.out.println("number is not prime");
        break;
    }
    else{
        System.out.println("number is prime");
        break;
    }
}
    }
}