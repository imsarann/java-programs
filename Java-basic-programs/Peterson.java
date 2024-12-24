public class Peterson {
    public static void main(String[] args) {
        int number = 145;
        int forFact = 0;
        Integer result = 0;
        while (number > 0 ) {
            forFact = number % 10;
            number = number / 10;
            result = result  + fact(forFact);       
        }
        System.out.println(result);
        
    }
        public static Integer fact(int num) {
            if (num < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
    
            int fact = 1;
            while (num > 0) {
                fact = fact * num; 
                num--;
            }
            // System.out.println(fact); // Return the result
            return fact;
        }
        
}