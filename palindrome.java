 class palindrome {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;
        int length = 0;

        // Calculate the length of the number
        while (temp != 0) {
            temp /= 10;
            length++;
        }

        temp = num; // Reset temp to the original number

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev) {
            System.out.println("Number is a palindrome.");
        } else {
            System.out.println("Number is not a palindrome.");
        }
    }
}
