public class Automorphic {
    public static void main(String[] args) {
        int num = 25;
        int sqNum = num * num;
        boolean isCompleted = false;
        while(!isCompleted){
            if(num % 10 == sqNum % 10){
                num = num / 10;
                sqNum = sqNum / 10;
                if( num % 10 == sqNum % 10){
                    isCompleted = true;
                    System.out.println("yes, Tt is a Automorphic number" + num + " " + sqNum );
                }
                }else{
                        System.out.println("No, It is not a Automorphic number" + num + " " + sqNum );
                           isCompleted = true;
                }
        }
    }
}
