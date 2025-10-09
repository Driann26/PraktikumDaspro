import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("---Print KRS Siakad---");
        System.out.print("Have the tuition fee been paid? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("UKT payment has been verified.");
            System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
        } else {
            System.out.println("Registration rejected. Please pay UKT first.");
        }

        sc.close();
    }
}
