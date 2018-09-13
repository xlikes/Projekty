public class Matematyka {
    public static void main (String[]args){
        Matematyka m = new Matematyka();
        m.className();
        System.out.println(m.sqrt(5)); // tu mozemy wpisac argument czyli 5
        System.out.println(m.sqrt(5.5)); // tu mozemy wpisac argument czyli 5.5
    }

    public void className(){ //void nie zwraca zadniej wartosci

        System.out.println("Matematyka");
    }

    public int sqrt(int a){ // w nawiasie parametr metody
        return a*a;
    }

    public double sqrt (double a){
        return a*a;
    }

}
