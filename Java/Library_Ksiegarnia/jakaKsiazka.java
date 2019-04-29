package BibliotekaObiektowa;

import java.util.Scanner;
import java.util.Map;

public class jakaKsiazka extends bibliotekaGlowna{


    public void jaka(Map<String,String> doKsiaz){
        String ksiazka;
        Scanner odczyt = new Scanner(System.in);
        ksiazka = odczyt.nextLine();

        switch(ksiazka){

            case "Piotrus Pan":
                doKsiaz.remove("Piotrus Pan");
                doKsiaz.put("Piotrus Pan","Wypozyczona");
                System.out.println("Dziekujemy za wypozyczenie");
                break;
            case "Wyspa Skarbow":
                doKsiaz.remove("Wyspa Skarbow");
                doKsiaz.put("Wyspa Skarbow","Wypozyczona");
                System.out.println("Dziekujemy za wypozyczenie");
                break;
            case"Metro":
                doKsiaz.remove("Metro");
                doKsiaz.put("Metro","Wypozyczona");
                System.out.println("Dziekujemy za wypozyczenie");
                break;
            case "Trening poradnik":
                doKsiaz.remove("Trening poradnik");
                doKsiaz.put("Trening poradnik","Wypozyczona");
                System.out.println("Dziekujemy za wypozyczenie");
                break;
            default:
                System.out.println("Niema takiej ksiazki sprawdz czy podales poprawna nazwe");

        }

    }
}
