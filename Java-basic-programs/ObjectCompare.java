public class ObjectCompare {
    int x = 1;
    int y = 2;
    public static void main(String[] args) {
        ObjectCompare girl = new ObjectCompare();
        Integer y = girl.y;
        int answer = y.hashCode();
        System.out.println(answer);
    }
}
