import java.util.Scanner;
public class LiczenieLiterSlowa {
    public static void main(String args[]) {
        String slowo;
        System.out.println("Podaj slowo przynajmniej 5 literowe");
        Scanner odczyt = new Scanner(System.in);
        slowo = odczyt.nextLine();
        count(slowo);
        index(slowo);
    }

   public static void count(String x){
        char[] ch= x.toCharArray();
        int litery =0;
            for(int i=0; i<x.length(); i++){
                litery++;
            }

       System.out.println("liczba liter to "+litery);
    }

        public static void index(String slowo){
        int index1 = slowo.charAt(0);
        int index2 = slowo.charAt(4);
            System.out.println("pierwsza litera to "+(char)index1);
            System.out.println("piata litera to "+(char)index2);
        }

}
