import java.util.Scanner;

public class SchaltjahrBerechnung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schaltjahrberechnung");
        System.out.println("=====================");
        System.out.print("Bitte eine Jahreszahl eingeben: ");

        int jahr = scanner.nextInt();
        
        if (istSchaltjahr(jahr)) {
            System.out.println(jahr + " ist ein Schaltjahr");
        } else {
            if (jahr % 100 == 0) {
                System.out.println(jahr + " ist kein Schaltjahr weil: Es handelt sich um ein Jahrhundert");
            } else {
                System.out.println(jahr + " ist kein Schaltjahr weil: Ihre Eingabe ist nicht durch 4 teilbar");
            }
        }

        scanner.close();
    }

    public static boolean istSchaltjahr(int jahr) {
        return (jahr % 4 == 0) && (jahr % 100 != 0);
    }
}