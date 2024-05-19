import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String  str = "";                           //man könnte auch evt. Stringbuilder verwenden

        System.out.println("Bitte schreiben Sie einen Satz: ");

        while (true) {
             str = input.nextLine();

            if(!str.isEmpty()){                                     // str != "" würde auch funktionieren
                String reverse_str = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reverse_str += str.charAt(i);
                }
                System.out.println(reverse_str);
                break;

            } else {
                System.out.println("Die Eingabe ist leer. Du kannst es nochmal versuchen!");
            }
        }

    }
}
