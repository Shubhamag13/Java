public class TrianglePattern4 {
    public static void main(String[] args) {
        int n = 4;
        int num = 19;

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.printf("%3d", num);
                num -= 2;
            }
            System.out.println();
        }
    }
}
