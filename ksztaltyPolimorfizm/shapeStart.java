package thinkingInJava.ksztaltyPolimorfizm;

public class shapeStart {


    public static void main(String args[]){
        randomShapeGenerator generator = new randomShapeGenerator();
        shape[] s= new shape[9];
        for(int i=0;i<s.length; i++){
            s[i]= generator.next();
        }
        for(shape shp:s){
            shp.kBazowa();
        }
    }

}
