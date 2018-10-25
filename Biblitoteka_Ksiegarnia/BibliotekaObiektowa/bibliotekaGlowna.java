package BibliotekaObiektowa;

import java.util.*;

public class bibliotekaGlowna {

    public static void main(String args[]){

        char[] or=new char[1]; // wartosc ktora decyduje o tym czy uzytkownik chce wypozyczyc ksiazke czy oddac
        char kontynuacja;

        Map<String,String> doKsiaz = new HashMap(); // wszystkie ksiazki
        ksiazki dostepne = new ksiazki(); // dostepne ksiazki w naszej bibliotece
        panelSterowania wybor= new panelSterowania();
        rozdzielaczZadan wypozOddaj = new rozdzielaczZadan();
        jakaKsiazka wypozyczenie = new jakaKsiazka(); // jaka ksiazke chcemy wybrac
        oddawanie oddajemy = new oddawanie();


        dostepne.ksiazki(doKsiaz); // wypisujemy dostepne ksiazki w naszej bibliotece
        do {
            wybor.panelSterowania(or);//pytamy klienta co chce zrobic
            System.out.println(or);
            wypozOddaj.kieruj(or[0]);// sprawdzamy co klient chce zrobic
            if(or[0]=='w')
                wypozyczenie.jaka(doKsiaz); // jesli chce wypozyczyc pytamy jaka ksiazke chce wypozyczyc
            else if(or[0]=='o')
                oddajemy.oddaj(doKsiaz);   //jesli klient chce oddac ksiazke sprawdzamy jaka

            System.out.println(doKsiaz);// Wypisujemy dostepne ksiazki

            System.out.println("Jesli chcesz zrobic cos jeszcze w naszej bibliotece wcisnij t");
            Scanner kontynuuj = new Scanner(System.in);
            kontynuacja = kontynuuj.next().charAt(0);
        }while(kontynuacja=='t');//sprawdzamy czy uzytkownik chce podjac jeszcze jakies dzialania
    }

}
