public abstract class KlasyAbstrakcyjne {

        public static final int iloscOczu = 2; //stałe są ok

        //metoda abstrakcyjna
        public abstract String krzyczNaDzieci ();

        //zwykla metoda z implementacja

        public static void biegnijDoSklepu ( int odleglosc, int predkosc){
            double czas = (double) odleglosc / predkosc;
            System.out.println("Biegne do sklepu bede za " + czas);
        }
    }





