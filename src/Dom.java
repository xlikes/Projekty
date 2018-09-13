public class Dom {
    public static void main(String[]args){

        TV sony = new TV();
        TV Lg = new TV(32,"LGSUPRIM");

        System.out.println(Lg.getName()+" , "+Lg.getSize());
        System.out.println(sony.getName()+" , "+sony.getSize());

        Lg.getonOff();
        Lg.setonOff(true);
        Lg.getonOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(22);
        System.out.println(rex.getSize());
    }
}
