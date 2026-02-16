public class TrianglePattern3 {
    public static void main(String[] args) {
        int n = 4;
        int num = 20;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.printf("%3d", num);
                    num -= 2;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
