//set interface

import java.util.HashSet;
import java.util.Set;


class Duplicate2{
    public static void main(String[] args){
        int a[]={3,5,4,3,2,2,1};
        Set<Integer> s= new HashSet<>();
        for(int no :a){
            if(s.add(no)==false){
                System.out.println(no);
            }
        }
    }
}