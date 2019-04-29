package BibliotekaObiektowa;

import java.util.*;

public class ksiazki extends bibliotekaGlowna{

    public void ksiazki(Map<String,String> doKsiaz){


        doKsiaz.put("Piotrus Pan","Dostepna");
        doKsiaz.put("Wyspa Skarbow","Dostepna");
        doKsiaz.put("Metro","Dostepna");
        doKsiaz.put("Trening poradnik","Dostepna");

        System.out.println("Pozycje w bibliotece to");
        System.out.println(doKsiaz);
        System.out.println();



    }
}
