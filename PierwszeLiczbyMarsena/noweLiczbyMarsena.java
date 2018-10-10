package thinkingInJava;
import java.math.BigInteger;
public class noweLiczbyMarsena {

    //Program sprawdza poprawnie tylko do 8 liczby pozniej wartosci są zbyt wielkie

    BigInteger sprawdz(int i){
        BigInteger f = BigInteger.valueOf(2);
        BigInteger jeden = BigInteger.valueOf(1);
        //  long potega = (long)Math.pow(2,i); // rzutowanie na long
        BigInteger nowaPotega = f.pow(i);
        BigInteger nowyMarsen = nowaPotega.subtract(jeden);
        //   BigInteger marsen = BigInteger.valueOf(nowaPotega-1); // zmiana potegi liczby dwa na liczby mersena
        //      BigInteger d = BigInteger.valueOf(nowyMarsen);
        return nowyMarsen;
    }
    public static void main(String args[]){

        int h=0;
        int liczPierwsze=0;

        noweLiczbyMarsena liczba = new noweLiczbyMarsena();

        for(int i =1;i<=100; i++){
           // for(BigInteger j=BigInteger.valueOf(0);j.compareTo(liczba.sprawdz(i))==-1;BigInteger.valueOf(+1)){
            etykieta:
            for(long j=1;j<=200000;j++){
                BigInteger zero = BigInteger.valueOf(0);
                BigInteger xx = BigInteger.valueOf(j);
                BigInteger wynik = liczba.sprawdz(i).mod( xx); //reszta z dzielenia

                int sprawdz = zero.compareTo(wynik); //porownianie wartosci

                if(h==3) {
                continue etykieta;
                }
                if(sprawdz==0){
                    h++;
                }
            }
            if(h<3) {
                System.out.println(liczPierwsze + " : " + liczba.sprawdz(i));
                liczPierwsze++;
            }
            h=0;
        }
    }
}
