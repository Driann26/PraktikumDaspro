import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.println("Have the tuition fees been pain in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("UKT payment has been verified");
            System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
        }
        sc.close();
    }
}