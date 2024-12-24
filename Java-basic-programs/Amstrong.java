
import java.util.ArrayList;
import java.util.List;

public class Amstrong {
    public static void main(String[] args) {
        int input = 1634;
        List<Integer> result = toSplit(input);
        int lengths = result.size();
        int total = 0;
        for(int i = 0; i < lengths; i++){
            int newInt = result.get(i);
            double newAns = Math.pow(newInt, lengths);
            total += newAns ;
        }
        if(total == input){
            System.out.println("Yes, it is amstrong " + total);
            return; 
        }else{
            System.out.println("No, it is not a amstrong ");
        }
    }

    public static List<Integer> toSplit(int num){
        String newString = String.valueOf(num);
        List<Integer> list = new ArrayList<>();
        for (char c : newString.toCharArray()) {
        list.add(Character.getNumericValue(c));
    }
    return list;

    }
    public static int findLength(int num){
        String newString = String.valueOf(num);
        String[] newNumber = newString.split("");
        int length = newNumber.length;
        return length;
    }

}
