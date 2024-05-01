import java.util.HashSet;

class CommonElement{
    public static void main(String [] args){
        int a1[]={1,3,7,9,3,2};
        int a2[]={5,1,4,8,3};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                   hs.add(a1[i]);
                   break;
                }
            }
        }
        for(int no:hs){
            System.out.println(no+" ");
        }

    }
}