import java.util.*;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}