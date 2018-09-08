import java.util.Scanner;
public class LiczenieLiterSlowa {
    public static void main(String args[]) {
        String slowo;
        System.out.println("Podaj slowo przynajmniej 5 literowe");
        Scanner odczyt = new Scanner(System.in);
        slowo = odczyt.nextLine();
        count(slowo);
        indexy.index(slowo);
        slowoDoTablicy.doTablicy(slowo);
        slowoDoTablicy.sprawdzA(slowo);
    }

   public static void count(String x){
        char[] ch= x.toCharArray();
        int litery =0;
            for(int i=0; i<x.length(); i++){
                litery++;
            }

       System.out.println("liczba liter to "+litery);
    }



}
