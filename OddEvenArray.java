import java.util.ArrayList;

class OddEvenArray{
    public static void main(String [] args){
        int a[]={8,5,10,12,3,1,4};
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        int total=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                al1.add(a[i]);
            }
            else{
                al2.add(a[i]);
            }
        }
        System.out.println("Even numbersare :");
        for(int no : al1){
            System.out.println(no);
            
        }
        System.out.println("No of elements present are : " + al1.size());
        System.out.println("odd numbersare :");
        for(int no : al2){
            System.out.println(no);
            
            total =total+no;
            
        }
        System.out.println("The sum of even numbers are :" + total);
    }
}