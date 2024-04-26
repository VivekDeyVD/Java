class SecondLargest{

    //method 1 
    public static void main(String[] args){
    
        int arr[]={6,8,2,4,3,1,5,7};
        int temp;
    
        for(int i=0 ;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;


                }

            }
           
        }
        System.out.println("the second largest element is :" + arr[1]);
    }
}