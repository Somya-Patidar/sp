public class BUTTERFLY {
    public static void main(String[] args) {
        int n=4;
        
        for (int i = 1; i <= n; i++) {
            
            // inner loop to print spaces.
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
  
            System.out.println("");
        }
    }
}
