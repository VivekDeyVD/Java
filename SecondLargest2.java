class SecondLargest2{
    public static void main(String[] args){
        int arr[]={1,2,4,7,3,5,8,9,22,45,23};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i] != largest){
                second_largest=arr[i];
            }
        }
        System.out.println("the second largest element is " + second_largest);

    }
}