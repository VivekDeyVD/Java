public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;
        int rem = 0;
        int length = 0;

        int tempLength = num; // Copy of num to calculate length

        // Calculate the length of the number
        while (tempLength != 0) {
            tempLength /= 10;
            length++;
        }

        temp = num; // Reset temp to the original number

        // Calculate Armstrong sum
        while (temp != 0) {
            rem = temp % 10;
            sum += Math.pow(rem, length);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Number is Armstrong.");
        } else {
            System.out.println("Number is not Armstrong.");
        }
    }
}
