class LinearSearch{
   
        public static void main(String[] args){

        int a[]={5,3,6,1,4,2};
        int item=5;
        for(int i=0;i<a.length;i++){
            if(a[i]==item){
                System.out.println("required   is present at" +" " + i + " " + "index");
            }
        }

    }
}