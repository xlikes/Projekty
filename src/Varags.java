public class Varags {

    //[typ] metoda(typ ArgumentStały, typ...GrupaArgumentow)
    static int sumvarargs(int...intArrays){
        int sum, i;
        sum=0;
        for(i=0; i<intArrays.length; i++){
            sum+=intArrays[i];                  //for dla wypelnienia tablicy
        }
        return (sum);
    }
    public static void main(String[]args){
        int sum =0;
        sum=sumvarargs(new int[] {10,11,12,13}); //ilosc oraz wartosc elementow tablicy
        System.out.println("Suma liczb to "+sum);
    }
}