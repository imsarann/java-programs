public class Factorial {
 public static void main(String[] args) {
    int num = 5;
    int fact = 1;
    while (num > 1) {
        fact *= num;
        num = num - 1;
    }
    System.out.println(fact);
 }   
}
