public class Palindrome {
    public static void main(String[] args) {
        int number = 101;
        int answer = 0;
        while (number > 0) {
            int lastNum = number % 10;
            answer = (answer * 10) + lastNum;
            number /= 10;     
        }
        System.out.println(answer);
    }
}
