class MaxMin{
    public static void main(String[] args){
        int arr[]={4,3,5,6,7,8};
        int max=0;
        int min=9999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
        }

        if(arr[i]<min){
            min=arr[i];
        }
       
    }
    System.out.println("the maximum numbe is " + " "+ max);
    System.out.println("the maximum numbe is " + " "+ min);


}
}