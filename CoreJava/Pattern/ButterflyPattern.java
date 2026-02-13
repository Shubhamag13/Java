public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) System.out.print("*");
            for(int s = 1; s <= 2*(n-i); s++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // Lower half
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++) System.out.print("*");
            for(int s = 1; s <= 2*(n-i); s++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
