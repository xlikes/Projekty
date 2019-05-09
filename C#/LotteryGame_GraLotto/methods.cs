using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lotteryGame
{
    class methods
    {

        public void welcome() { 
            Console.WriteLine(" =========================================");
            Console.WriteLine(" ||       WELCOME IN LOTTERY GAME       ||");
            Console.WriteLine(" =========================================");
            Console.WriteLine(Environment.NewLine);
        }

       public int rndNumbers() { // losowanie liczb
            Random rand = new Random();
            return rand.Next(0,20);
        }

        public void show(int[] testTab) { // wyswietlanie liczb
            for (int i = 0; i < 4; i++) {
                Console.Write(testTab[i]+" | ");
            }
        }

        public int compare(int a,int[] tab,int counter) { // test czy liczby sie nie powtarzaja
            for (int i = 0; i < 4; i++)
            {
                if (a == tab[i])
                    counter++;
            }
            return counter;
        }

        public void getNumbers(int number,int[] tab) // wczytanie danych
        {
            Console.WriteLine("Podaj 4 liczby od 1 do 20");
            for (int i = 0; i < 4; i++) {
                Console.WriteLine("Podaj " + (i + 1) + " liczbe");
                try//try catch dla obslugi wyjatku jesli uzytkownik poda inna wartosc niz liczbe
                {
                    number = Convert.ToInt32(Console.ReadLine()); // wczytanie do zmiennej
                    if (number < 20 && number > 0)
                        tab[i] = number;
                    else
                    {
                        Console.WriteLine("Liczba poza zakresem");
                        i--;
                    }
                }
                catch(Exception e) {
                    Console.WriteLine("Niepoprawa wartosc podaj liczb od 1 do 20");
                    i--;
                }
            }
        }

        public void score(int win, int[] tabU, int[] tabR) { //porownanie liczb losowanych z wybranymi
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (tabU[i] == tabR[j]) {
                        win++;
                    }
                }
            }
            if(win>1)
            Console.Write(" :D :D :D  |Udalo ci sie trafic "+win+" numery|  :D :D :D");
            if(win==1)
            Console.Write(" :D :D :D  |Udalo ci sie trafic "+win+" numer|  :D :D :D");
            else if(win==0)
            Console.Write(" :(  |Niestety nie trafiles zadnego numeru|  :(");
        }
    }
}