
public class SunnyNumber {
    public static void main(String[] args) {
        double num = 79;
        double sqnum = Math.sqrt(num + 1);
        if(sqnum - Math.floor(sqnum) == 0){
            System.out.println("Yes it is a sunny number");
        }else{
            System.out.println("No , it is a sunny number");
        }
    }
}
