using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lotteryGame
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] tabLotto = new int[4];
            int[] tabUser = new int[4];
            int counter = 0;//powtorzenia liczb
            int numbers = 0;//liczbu usera
            int win = 0; //zdobyte punkty

            methods lotto = new methods();

            lotto.welcome();

            for (int i = 0; i < 4; i++)
            {
                int temporary = lotto.rndNumbers(); // test czy liczba sie nie powtarza
                if (lotto.compare(temporary, tabLotto, counter) > 0)
                {
                    i--;
                }
                else
                    tabLotto[i] = lotto.rndNumbers(); // przypisanie nowych wartosci
            }

            lotto.getNumbers(numbers, tabUser); //Pobranie wartosci

            Console.Write("Wygrywajace numery: | ");
            lotto.show(tabLotto); // pokazanie wylosowanych wartosci

            Console.WriteLine(Environment.NewLine);

            Console.Write("Twoje numery: | ");
            lotto.show(tabUser); // pokazanie wybranych wartosci
            Console.WriteLine(Environment.NewLine);

            lotto.score(win, tabUser, tabLotto);//wypisanie wyniku
            Console.WriteLine(Environment.NewLine);



            //=============PLAN
            //losowanie [DONE]
            //wybor liczb [DONE]
            //porownanie [DONE]
            //wynik [DONE]
        }
    }
}