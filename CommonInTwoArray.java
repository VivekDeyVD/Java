class ComminInTwoArray{
    public static void main(String[] args){
        int a[]={4,3,7,9,2};
        int A[]={5,1,4,8,3,4};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<A.length;j++){
                if(a[i]==A[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}