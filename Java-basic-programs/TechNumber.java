public class TechNumber {
    public static void main(String[] args) {
        int num = 2025;
        double tempNum = num;
        int length = countLength(num);
        int half = length % 2;
        int power = length / 2 ;
        double total = 0;
        if(half == 0 ){
                double divisor = Math.pow(10, power); 
                int convertedNumber = (int)divisor;
                total = (int)tempNum / convertedNumber  + (int)tempNum % convertedNumber;
                total = Math.pow(total, 2);
        }
        else{
            System.out.println("No it is not a tech number");
        }
        if((int)total == num){
            System.out.println((int)total);
        }
    }
    public static Integer countLength(int value){
        int count = 0;
        while( value > 0){
            value = value / 10;
            count++;
        }
        return count;
    }
}
