public class  mergeSort{
    int[] arr;
    int[] tempMergeArr;
    int length;

        public static void main(String[] args){
int inputArr[]={5,7,8,3,4,2,1};

mergeSort ms= new mergeSort();
ms.sort(inputArr);
for(int i : inputArr){
    System.out.print(i + " ");
}
        }

    public  void divideArray(int lowerIndex,int higherIndex){

        if (lowerIndex<higherIndex){
             int mid =lowerIndex+(lowerIndex-higherIndex)/2;
             divideArray(lowerIndex,mid); // for the left side..
        divideArray(mid+1,higherIndex); // for the right hand side..
        mergeArray(lowerIndex,mid,higherIndex);

        }
       
        
    }

    public void mergeArray(int lowerIndex,int mid,int higherIndex){

        for(int i=lowerIndex;i<higherIndex;i++){
            tempMergeArr[i]=arr[i];
        }
        int i=lowerIndex;
        int j=mid+1;
        int k=lowerIndex;
        while(i<=mid && j<=higherIndex){
            if(tempMergeArr[i] <= tempMergeArr[j]){
                arr[k]=tempMergeArr[i];
                i++;
            }
            else{
                arr[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            arr[k]=tempMergeArr[i];
            i++;
            k++;
            
        }

    }




     public void sort(int inputArr[]){

        this.arr=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0, length-1);
    }
}
