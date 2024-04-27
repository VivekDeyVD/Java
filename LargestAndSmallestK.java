class LargestAndSmallestK{
    public static void main(String [] args){
        int a[]={5,8,12,7,8,6,2,4};
        int k=4;
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
temp=a[j];
a[j]=a[i];
a[i]=temp;
                }
            }
            if(i==k-1){
                System.out.println("the " + k + "th largest element is "+a[i]);
            }
        }
    }
}