class FirstDuplicate{
    public static void main(String[] args){
        int a[]={6,5,3,2,5,2,4};
        //brute force
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && (i!=j)){
                    System.out.println( "first duplicate element is   " + a[i]);
                    temp+=1;
                    break;

                }

            }
            if(temp>0){
                break;
            }
        }
    }
}