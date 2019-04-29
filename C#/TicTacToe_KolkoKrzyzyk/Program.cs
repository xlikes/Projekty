using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KolkoKryzyk
{
    class Program
    {

        static void Main(string[] args)
        {
            char test = 'n';

            Menu start = new Menu(); // menu
            Gameplay gra = new Gameplay(); // gra

            do
            {
                start.mainMenu();
                gra.czyGra();
                Console.WriteLine(" Aby zagrac jeszcze raz wprowadz 'G' jesli nie cokolwiek innego ");
                test = Console.ReadKey(true).KeyChar;

            }
            while (test == 'g' || test == 'G');


        }
    }
}