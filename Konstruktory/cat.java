package Konstruktory;

public class cat {
    String name;
    int age;
    int energy;

    public cat(){
        name = "filemon";
        age = 0;
        energy = 1;
    }
    public cat(String name){
        this();
        this.name = name;
    }

    public cat(String name,int age,int energy){
        this(name);
        this.age=age;
        this.energy=energy;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getEnergy(){
        return energy;
    }

}
