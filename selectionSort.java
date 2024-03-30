public class selectionSort {
  public static void main(String [] args){
    int temp;
    int []a={38,52,9,18,6,62,13};
int min;
    for(int i=0; i<a.length;i++){
        min=i;
        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
            }
            temp=a[j];
            a[j]=a[min];
            a[min]=a[temp];
        }

    }
    for(int k=0;k<a.length;k++){
        System.out.print(a[k] + " ");
    }
  }
}
