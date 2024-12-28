public class Pattern {
    static void Pattern1(int n){
        for(int i =0; i < n ; i++ ){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void Pattern5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Pattern1(5);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        Pattern5(5);
    }
}