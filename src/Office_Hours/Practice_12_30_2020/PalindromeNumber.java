package Office_Hours.Practice_12_30_2020;

public class PalindromeNumber {

        // 12343

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(123));
        System.out.println(isNumberPalindrome(13531));
    }

    public static boolean isNumberPalindrome(long number) {

        long reverse = 0;
        long temp = number;

        // Using % 10 we can read the last digit

        while(temp != 0) {

        reverse = reverse * 10 + (temp % 10); // 0 + 1  = 1
                                                // 10  + 2 = 12
        temp /= 10; // temp = temp / 10

        }

        return reverse == number;

    }

}
