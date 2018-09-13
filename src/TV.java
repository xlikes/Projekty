public class TV {                       //KONSTRUKTORY
    private int size;
    private String nazwa;
    private boolean onOff;

    public TV(){
            size = 69;
             nazwa = "czips";           //Ustawia wartości domyślne na null bądz 0
    }

    public TV(int size, String nazwa){
        this.size = size;       // Slowko this wystepuje poza konstruktorem
        this.nazwa = nazwa;
    }

    public int getSize(){
        return size;
    }

    public String getName(){
        return nazwa;
    }

    public void setonOff(boolean a){

        onOff = a;
    }

    public void getonOff(){

        if(onOff==true){
            System.out.println("TV is on");
        }
        else{
            System.out.println("TV is off");
        }

    }
}
