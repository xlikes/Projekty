package BibliotekaObiektowa;

import java.util.*;



public class oddawanie extends bibliotekaGlowna {

    public void oddaj(Map<String,String> doKsiaz){

        String ksiazka;
        Scanner odczyt3 = new Scanner(System.in);
        ksiazka = odczyt3.nextLine();

        switch(ksiazka){


            case "Piotrus Pan":
                if(doKsiaz.get("Piotrus Pan").equals("Wypozyczona")){//jesli ksiazka jest wypozyczona przyjmujemy ja
                doKsiaz.put("Piotrus Pan","Dostepna");
                System.out.println("Dziekujemy za oddanie ksiazki");
            }
                else if(doKsiaz.get("Piotrus Pan").equals("Dostepna")){ // jesli ksiazka jest dostepna nie przyjmujemy jej
                System.out.println("Juz mamy ta ksiazke");
            }
            else{// jesli uzytkownik wprowadzil zla nazwe
                System.out.println("Podales zla nazwe");
            }
                break;

            case "Wyspa Skarbow":
                if(doKsiaz.get("Wyspa Skarbow").equals("Wypozyczona")){//jesli ksiazka jest wypozyczona przyjmujemy ja
                    doKsiaz.put("Wyspa Skarbow","Dostepna");
                    System.out.println("Dziekujemy za oddanie ksiazki");
                }
                else if(doKsiaz.get("Wyspa skarbow").equals("Dostepna")){ // jesli ksiazka jest dostepna nie przyjmujemy jej
                    System.out.println("Juz mamy ta ksiazke");
                }
                else{// jesli uzytkownik wprowadzil zla nazwe
                    System.out.println("Podales zla nazwe");
                }
                break;
            case"Metro":
                if(doKsiaz.get("Metro").equals("Wypozyczona")){//jesli ksiazka jest wypozyczona przyjmujemy ja
                    doKsiaz.put("Metro","Dostepna");
                    System.out.println("Dziekujemy za oddanie ksiazki");
                }
                else if(doKsiaz.get("Metro").equals("Dostepna")){ // jesli ksiazka jest dostepna nie przyjmujemy jej
                    System.out.println("Juz mamy ta ksiazke");
                }
                else{// jesli uzytkownik wprowadzil zla nazwe
                    System.out.println("Podales zla nazwe");
                }
                break;
            case "Trening poradnik":
                if(doKsiaz.get("Trening poradnik").equals("Wypozyczona")){//jesli ksiazka jest wypozyczona przyjmujemy ja
                    doKsiaz.put("Trening poradnik","Dostepna");
                    System.out.println("Dziekujemy za oddanie ksiazki");
                }
                else if(doKsiaz.get("Trening poradnik").equals("Dostepna")){ // jesli ksiazka jest dostepna nie przyjmujemy jej
                    System.out.println("Juz mamy ta ksiazke");
                }
                else{// jesli uzytkownik wprowadzil zla nazwe
                    System.out.println("Podales zla nazwe");
                }
                break;
            default:
                System.out.println("Niema takiej ksiazki sprawdz czy podales poprawna nazwe");

        }

    }
}
