import java.sql.SQLOutput;
import java.util.Scanner; //klasa do pobierania danych
import java.util.Arrays; //klasa do manipulowania tablicami
class zadanka
{
    public static void main(String[]args){




        /*
                           // PETLA FOREACH

        int[] tablica = new int[10];
        for(int i=0; i<tablica.length;i++){
            tablica[i]=i;
        }
        for(int x:tablica){ //Sposób na wyswietlanie tablicy
            System.out.print(x+" ");
        }

                                USUWANIE ELEMENTU Z TABLICY
        int tablica[] = {5,6,7,8};
        int l;
        System.out.println("Podaj element tablicy");
        Scanner odczyt = new Scanner(System.in);
        l = odczyt.nextInt();
        for(int i = 0; i<4; i++){
            if(l==tablica[i]){
                System.out.println((i+1)+" element zostal usuniety");
                tablica[i]=0;
                break;
            }
            else if(i==tablica.length-1){
                System.out.println("nie znaleziono elementu");
            }
        }
        System.out.println(Arrays.toString(tablica));


                                SPRAWDZANIE LICZB W TABLICY
        int tablica[] = {5,12,3,1};
        int l;
        System.out.println("Podaj liczbe");
        Scanner odczyt = new Scanner(System.in);
        l = odczyt.nextInt();
        for(int i =0; i<4; i++) {
            if (l == tablica[i]) {
                System.out.println("twoja liczba jest na miejscu nr " + i);
                break;
            }
            else if(i==3){
                System.out.println("Brak liczby w tablicy");
            }
        }


                            WIELOWYMIAROWA TABLICA
        int[][] wielo;
        wielo = new int[10][10];
        for(int i=0; i<10;i++) {
            for(int j=0; j<10;j++){
                System.out.print(wielo[i][j]);
            }
            System.out.println();
        }



                            TABLICA 4 ELEMENTOWA SUMA
        int sum = 0;
        int tablica[] = new int[4];
        for(int i = 0; i<4; i++) {
            System.out.println("Podaj " + (i + 1) + " element");
            Scanner odczyt = new Scanner(System.in);
            tablica[i] = odczyt.nextInt();
            sum += tablica[i];
        }
                            TABLICA 4 ELEMENTOWA SUMA I DZIELENIE
        int tablica[] = new int[4];
        double sum = 0;
        for(int i=0; i<4; i++) {
            System.out.println("Podaj liczbe");
            Scanner odczyt = new Scanner(System.in);
            tablica[i] = odczyt.nextInt();
            sum +=tablica[i];
        }
        System.out.println(sum/tablica.length);
        System.out.println(sum);




                    DZIELENIE PETLE I WARUNKI

        System.out.println("liczba podzielna przez 3");
        for(int i =1; i<=100; i++){
            if(i%3==0){
                System.out.print(i+",");
            }
        }
        System.out.println(" ");
        System.out.println("liczba podzielna przez 5");
            for(int i =1; i<=100; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + ",");
                }
            }
        System.out.println(" ");
        System.out.println("Liczba podzielna przez 3 i 5");
            for(int i =1; i<=100; i++){
                if((i%5==0)&&(i%3==0)){
                System.out.print(i+",");
                }
             }


                    SPRAWDZANIE HASLA

        String haslo;
        do{

            System.out.println("Podaj haslo");
            Scanner odczyt = new Scanner(System.in);
            haslo = odczyt.nextLine();
        }
        while(!haslo.equals("abc"));
        System.out.println("Poprawne haslo");


                        LICZENIE LITER I ZNAKOW

                String wyraz;
                System.out.println("Podaj zdanie");
                Scanner odczyt = new Scanner(System.in);
                wyraz = odczyt.nextLine();
                count(wyraz);
            }

                char[] ch = x.toCharArray();
                int letter = 0;
                int space = 0;
                int number = 0;
                int other = 0;
                for(int i =0; i<x.length(); i++){
                    if(Character.isLetter(ch[i])){
                        letter++;
                    }
                    else if(Character.isDigit(ch[i])){
                        number++;
                    }
                    else if(Character.isSpaceChar(ch[i])){
                        space++;
                    }
                    else{
                        other++;
                    }
                }
                System.out.println("ilosc liter = "+letter);
                System.out.println("ilosc cyfr = "+number);
                System.out.println("ilosc spacji = "+space);
                System.out.println("ilosc innych znakow = "+other);



                                    ODRACANIE WYRAZÓW

        System.out.println("Podaj wyraz");
        Scanner odczyt = new Scanner(System.in);
        char[] litery = odczyt.nextLine().toCharArray();
        for(int i = litery.length - 1; i >= 0; i--) {
            System.out.print(litery[i]);
        }

                                    TBLICE LICZBY
        int n;
        int i =0;
        System.out.println("Podaj ilosc elementow  ");
        Scanner odczyt = new Scanner(System.in);
        n = odczyt.nextInt();
        int[] liczby = new int[n];
        while(i<n){
        liczby[i]=i+1;
        System.out.println(liczby[i]);
        i++;
        }


                                       IMIONA TABLICE

        String[] tablica = new String[5];
        Scanner odczyt = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Podaj imie");
            tablica[i]= odczyt.nextLine();
        }
        for (int i=0; i<5; i++){
            System.out.println("Imie to "+tablica[i]);
        }


        /*
                                      DO WHILE
        int liczba;
        System.out.println("Podaj liczbe");
        Scanner bomba= new Scanner(System.in);
        liczba = bomba.nextInt();
        do{
            System.out.println("Bomba wybuchnie za "+liczba+" sekund");  //instrukcje do wykonania
            liczba--;
        }
        while(liczba>=0);   //Warunek


                                        WHILE

        int liczba;
        System.out.println("Podaj liczbe");
        Scanner bomba = new Scanner(System.in);
        liczba = bomba.nextInt();
        while(liczba>=0){
            System.out.println("Bomba wybuchnie za " +liczba+" sekund");
            liczba--;
        }
                                        FOR

        int liczba;
        System.out.println("Podaj liczbe");
        Scanner bomba= new Scanner(System.in);
        liczba = bomba.nextInt();
        for(int i=liczba; i>=0; i--) {
            System.out.println("Bomba wybuchnie za "+i+" sekund");

        }


                                SWITCHE I CASE

        int a;

        Scanner sprawdz = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        a = sprawdz.nextInt();


        switch(a) {
            case 1:
                System.out.println("Liczba to 1");
                break;
            case 2:
                System.out.println("Liczba to 2");
                break;
            case 3:
                System.out.println("Liczba to 3");
                break;
            default:
                System.out.println("Inna liczba");
        }



                                    SPRAWDZANIE ROWNOSCI IFY
        int a;
        int b;
        Scanner sprawdz = new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        a=sprawdz.nextInt();
        System.out.println("Podaj liczbe b");
        b=sprawdz.nextInt();

        if(a>b){
            System.out.println(" liczba "+a+" jest wieksza od "+b);
        }
        else if(a==b){
            System.out.println("liczby są równe");
        }
        else{
            System.out.println("liczba "+b+" jest wieksza od"+a);
        }



                                    KALKULATOR

        double a;
        double b;
        Scanner licz = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        a=licz.nextDouble();
        System.out.println("Podaj druga liczbe");
        b=licz.nextDouble();

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));






                                   POBIERANIE DANYCH

        String imie;
        Scanner odczyt = new Scanner(System.in); // obiekt do odbierania danych
         imie=odczyt.nextLine();

         System.out.println("Witaj"+imie);





                                       DZIALANIA

        int a =2;
        double b =3;


        System.out.println("dodawanie 2+3=" +(a+b));
        System.out.println("odejmowanie 2-3=" +(a-b));
        System.out.println("mnozenie 2*3=" +(a*b));
        System.out.println("dzielenie 2/3=" +(a/b));
        System.out.println("czy a=b "+(a==b));
*/



    }
}
