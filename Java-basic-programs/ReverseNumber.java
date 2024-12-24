public class ReverseNumber {
    public static void main(String[] args) {
        int num = 54321;
        String newNum = "";
        while(num > 0){
        newNum += num % 10;
        num = num / 10;
    }
    System.out.println(newNum);
    }
}
