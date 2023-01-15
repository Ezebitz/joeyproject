import java.security.SecureRandom;

public class Joey {


    public static void main(String[] args) {
        SecureRandom cloths = new SecureRandom();

        for(int counter = 1; counter <= 10; counter++) {

            int random = cloths.nextInt();
            System.out.printf("%d ", random);
        }

    }
}
