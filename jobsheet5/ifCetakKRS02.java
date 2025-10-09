import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS Siakad---");
        System.out.print("Has the tuition fee been paid? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // IF-ELSE structure
        if (uktLunas) {
            System.out.println("UKT payment verified");
            System.out.println("Please print KRS and ask for Academic Advisor signature");
        } else {
            System.out.println("Registration rejected. Please pay UKT first");
        }

        // === Using Ternary Operator ===
        System.out.println("\n=== Using Ternary Operator ===");
        String result = uktLunas ? 
            "UKT payment verified\nPlease print KRS and ask for Academic Advisor signature" : 
            "Registration rejected. Please pay UKT first";
        System.out.println(result);

        sc.close();
    }
}