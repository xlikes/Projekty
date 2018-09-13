package Konstruktory;

public class dog {
    String rasa;
    int szybkosc;
    int wiek;

public dog(){
    rasa = "Owczarek";
    szybkosc = 2;
    wiek = 1;
}

public dog(String rasa,int szybkkosc,int wiek){
    this.rasa = rasa;
    this.szybkosc = szybkosc;
    this.wiek = wiek;
}

public String getRasa(){
    return rasa;
}

public int getSzybkosc(){
    return szybkosc;
}

public int getWiek(){
    return wiek;
}

}

