package BibliotekaObiektowa;

import java.util.Scanner;

public class panelSterowania extends bibliotekaGlowna {


    public char panelSterowania(char[] or){


        System.out.println("Jesli chcesz wypozyczyc ksiazke wcisnij W");
        System.out.println("Jesli chcesz oddac ksiazke wcisnij O");
        Scanner odczyt = new Scanner(System.in);
        or[0] = odczyt.next().charAt(0); // odczyt dla jednego znaku

        return or[0];
    }

}
