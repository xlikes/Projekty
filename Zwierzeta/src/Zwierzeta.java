public class Zwierzeta {
public static void main(String[]args){


    ssak pies = new ssak("pies",1,2);
    wodne delfin = new wodne("delfin",3,8); //Rozszerzone przez polecenie "super" w klasie wodne
    latajace orzel = new latajace("orzel",4,12);

   //Delfin w klasie wodne. Klasa wodne rozszerza klase ssak
    delfin.swim="Umie plywac";
    orzel.wingsSize=3;

    System.out.println(pies.name +" , "+ pies.size +" , "+ pies.speed);
    System.out.println(orzel.name +" , "+ orzel.size +" , "+ orzel.speed+ " , " +orzel.wingsSize);
    System.out.println(delfin.name +" , "+ delfin.size +" , "+ delfin.speed +" , "+ delfin.swim);


}
}
