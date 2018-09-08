import java.util.Arrays;

public class slowoDoTablicy {
    public static void doTablicy(String slowo){
        char[] tablicaSlowo = slowo.toCharArray();
        System.out.println(tablicaSlowo);
        Arrays.sort(tablicaSlowo);
        System.out.println(tablicaSlowo);
    }

    public static void sprawdzA(String slowo){
        int a=0;
        char[] tablicaSlowo = slowo.toCharArray();
        for(int i=0; i<tablicaSlowo.length;i++){
            if(tablicaSlowo[i]=='a'){
                a++;
            }
        }
        if(a>0){
            System.out.println("Slowo zawiera "+a+" liter a");
        }
        else{
            System.out.println("Slowo nie zawiera liter a");
        }
    }
}
