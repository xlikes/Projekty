import java.sql.SQLOutput;
import java.util.Scanner;
public class UstawPunkt {
    public static void main(String args[]) {
        Punkt pracownik1 = new Punkt();
        for (int i = 0; i < 3; i++) {

            Scanner odczyt = new Scanner(System.in);
            System.out.println("Podaj dane "+(i+1)+" pracownika");
            pracownik1.imie[i] = odczyt.nextLine();
            pracownik1.nazwisko[i] = odczyt.nextLine();
            pracownik1.wiek[i] = odczyt.nextInt();
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Pracownik " + (j + 1) + ":" + pracownik1.imie[j] + "," + pracownik1.nazwisko[j] + "," + pracownik1.wiek[j]);
        }

    }
}