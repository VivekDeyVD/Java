class CommonElement{
    public static void main(String [] args){
        int a1[]={1,3,7,9,2};
        int a2[]={5,1,4,8,3};

        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.println("commonelement is : " + a1[i]);
                }
            }
        }

    }
}