import java.util.HashSet;

class FirstDuplicate2{
    public static void main(String[] args){
        int a[]={6,5,3,2,5,1,2,4};
        int temp=-1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=a.length-1;i>=0;i--){
            if(hs.contains(a[i])){
                temp=i;
            }
            else{
                hs.add(a[i]);
            }
        }
        if( temp != -1){
            System.out.print("the first duplicate element is :" + a[temp]);

        }
       

        else{
            System.out.println("no element is found");
        }
    }
  
}