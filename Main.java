import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte číslo");

        int num = sc.nextInt();
        double y = 0;


        for(int i = 0; i < num; i++) {
            int sum = 0;
            char[] array = String.valueOf(i).toCharArray();

            for (char c : array) {
                int digit = Character.getNumericValue(c);
                y = Math.pow(digit, 3);
                sum = sum + (int) y;
            }

            if(i == sum) {
                System.out.println(i);
            }
        }
    }
}
