package lotto;

import java.util.Scanner;

public class odczytLiczb {

    public int sprawdz() {
       int liczbaGracza;
        System.out.println("Podaj liczbe od 1 do 10");
        Scanner odczyt = new Scanner(System.in);
        liczbaGracza = odczyt.nextInt();
        return liczbaGracza;

    }

}
