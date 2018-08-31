import javax.swing.JFrame;
public class MyFrame extends JFrame{
    public MyFrame(){
    super("Hello world");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Czerwony krzyżyk zamykajacy okienko
    setVisible(true); //Ustawienie naszej ramki jako widoczne
        setSize(300,100);//Ustawienie rozmiaru okna
        setLocation(100,100);
}
}
