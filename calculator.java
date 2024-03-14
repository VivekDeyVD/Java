import java.util.Scanner;
class calculator{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=s.nextInt();
        System.out.println("Enter 2nd number");
        int b=s.nextInt();
        System.out.println("choose Symbols (+,-,*,/)");
        int yn;
        String sym=s.next();
        int res;

        do{
            switch (sym) {
                case "+": res = a + b;
                    System.out.println(res);
                    
                    break;
                case "-": res = a - b;
                    System.out.println(res);

                    break;

                case "*": res = a * b;  
                    System.out.println(res);
                    break;

                case "/": res = a / b;
                    System.out.println(res);
                    break;
            
                default: System.out.println("invalid symbol");
                    break;
            }

            System.out.println("Do you want to continue ? Press y for yes, n for no");
            yn=s.nextInt();
        }while(yn=='y' || yn=='Y');
    

        
    }
}