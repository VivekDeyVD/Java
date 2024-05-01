class MissingElement2{
    public static void main(String[] args){
        int a[]={1,2,3,4,6};
        int xor1=a[0];
        for(int i=0;i<a.length;i++){
            xor1=xor1^a[i];
        }
        int xor2=1;
        for(int i=2;i<=(a.length+1);i++){
            xor2=xor2^i;
        }
        System.out.println("the missing element is : " + (xor1^xor2));
    }
}