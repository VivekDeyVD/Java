
import java.util.HashSet;
class CommonInTwoArray2{
    //using hashset

public static void main(String[] args){
    int a[]={4,3,7,9,2,4};
    int b[]={5,1,4,8,3,6};

    HashSet<Integer> hs = new HashSet<>();
    for(int no: a){
        hs.add(no);
    }

    for(int no2 :b)
    {
       boolean c= hs.add(no2);

       if(c==false){
        System.out.println(no2);
       }
    }
}
}