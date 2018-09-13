package Konstruktory;

public class Demokot {
    public static void main(String args[]){
        cat kot1 = new cat();
        System.out.println(kot1.getName()+" , "+kot1.getAge()+" , "+kot1.getEnergy());
        cat kot2 = new cat("Bonifacy");
        System.out.println(kot2.getName()+" , "+kot2.getAge()+" , "+kot2.getEnergy());
        cat kot3 = new cat("Felek",12,33);
        System.out.println(kot3.getName()+" , "+kot3.getAge()+" , "+kot3.getEnergy());
        dog dog1 = new dog();
        System.out.println(dog1.getRasa()+" , "+dog1.getSzybkosc()+" , "+dog1.getWiek());
        dog dog2 = new dog("Buldog",0,3);
        System.out.println(dog2.getRasa()+" , "+dog2.getSzybkosc()+" , "+dog2.getWiek());
        mouse mouse1 = new mouse();
        System.out.println(mouse1.getNazwa()+" , "+mouse1.getDlugosc()+" , "+mouse1.getWaga());
        mouse mouse2 = new mouse("Mysia",12,3);
        System.out.println(mouse2.getNazwa()+" , "+mouse2.getDlugosc()+" , "+mouse2.getWaga());


    }
}
