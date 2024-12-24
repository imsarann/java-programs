public class PrimeNumber {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <=Math.sqrt(num); i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
