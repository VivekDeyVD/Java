

class stringRev{
    public static void main(String[]args)
    {
        
        String name="Vivek";
        int len=name.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}