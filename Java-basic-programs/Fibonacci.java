class Fibonacci{
    public static void main(String[] args){
        int ans ;
        for(int i = 0; i <=100; i++ ){
            if(i == 0){
                System.out.println("0");
                continue;                
            }
            if(i == 1){
                System.out.println("1");
                continue;                
            }
            ans = (i-2) + (i-1);
            System.out.println(ans);
        }
    }
}