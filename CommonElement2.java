import java.util.HashSet;
class CommonElement2{
    public static void main(String[] args){
        //using hashset

        int a1[]={4,3,7,9,2};
        int a2[]={5,1,4,8,3};
        HashSet<Integer> hs = new HashSet<>();

        for(int no :a1){
            hs.add(no);
        }

        for(int no :a2){
          boolean b =  hs.add(no);
          if(b==false){
            System.out.println(no);
          }

        }
       
    }
}