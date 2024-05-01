class MissingElement{

    public static void main(String[] args){

        int a[]={1,2,3,4,6};
       
        int expectedNoOfElement=a.length+1;
        int totalSum=expectedNoOfElement*(expectedNoOfElement+1)/2;
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];

        }

        System.out.println("Missing nummber :" + (totalSum-sum));

    }

}