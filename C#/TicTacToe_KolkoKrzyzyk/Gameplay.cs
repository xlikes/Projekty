using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KolkoKryzyk
{
    class Gameplay
    {
        char[] plansza = new char[9];// wiersze, kolumny
        char testGame;
        bool gracz;
        bool czyZajeteField = false;
        public bool czyGra()
        { // Start Gry

            for (int i = 0; i < 9; i++) {
                plansza[i] = ' ';
            }

            testGame = Console.ReadKey(true).KeyChar; // wczytanie znaku   

            if (testGame == 'g' || testGame == 'G')
            {   
                Console.WriteLine(Environment.NewLine + " Zaczynajmy");
                gracze();
                return true;
            }
            else
            {
                Console.WriteLine(Environment.NewLine + " Wyjscie");
                return false;
            }
        }

        public void gracze()
        { // Zmiana Graczy

            for (int i = 1; i < 11; i++)
            {
                czyZajeteField = false;
                if (i % 2 == 1)
                {
                    Console.WriteLine(" Gracz Pierwszy |O|");
                    Console.WriteLine(" Podaj pole od 1 do 9");
                    testField(ref plansza);
                    czyZajete(ref i, ref czyZajeteField);

                    wczytajRysuj(ref plansza);
                    testWin(ref i, ref plansza); // sprawdzanie wygranej
                }
                else
                {
                    Console.WriteLine(" Gracz Drugi |X|");
                    Console.WriteLine(" Podaj pole od 1 do 9");
                    testField(ref plansza); // testy czy pole jest zajete
                    czyZajete(ref i, ref czyZajeteField); // test czy pole jest puste

                    wczytajRysuj(ref plansza); // rysowanie tablicy
                    testWin(ref i, ref plansza); // sprawdzanie wygranej
                }
            }
        }

        public void wczytajRysuj(ref char[] plansza) // Rysowanie Planszy
        {

            Console.WriteLine(Environment.NewLine);

            Console.WriteLine("  " + plansza[0] + " || " + plansza[1] + " || " + plansza[2] + "       1 || 2 || 3");
            Console.WriteLine(" =============      ===========  ");
            Console.WriteLine("  " + plansza[3] + " || " + plansza[4] + " || " + plansza[5] + "       4 || 5 || 6");
            Console.WriteLine(" =============      ===========  ");
            Console.WriteLine("  " + plansza[6] + " || " + plansza[7] + " || " + plansza[8] + "       7 || 8 || 9");
            Console.Write(Environment.NewLine);

        }

        public void czyZajete(ref int i, ref bool czyZajeteField)
        { // Sprawdzanie czy pole jest zajete
            if (czyZajeteField == true) // jesli zajete gracz powtarza ruch
            {
                i--;
                czyZajeteField = false;
            }

        }

        public void testField(ref char[] plansza)
        {
            char wspol;
            wspol = Console.ReadKey(true).KeyChar; // wczytanie wartosci pola true aby ukryc wprowadzany znak
            Console.WriteLine(Environment.NewLine);

            int valueOfWspol = (int)Char.GetNumericValue(wspol);

            try // Blok try catch aby uniemozliwic wpisanie innych danych niz liczby od 1-9
            {
                if (plansza[valueOfWspol - 1] == ' ')
                {
                    if (gracz == true)
                    {
                        gracz = false;

                        switch (wspol)
                        {
                            case '1':
                                plansza[0] = 'X';
                                break;
                            case '2':
                                plansza[1] = 'X';
                                break;
                            case '3':
                                plansza[2] = 'X';
                                break;
                            case '4':
                                plansza[3] = 'X';
                                break;
                            case '5':
                                plansza[4] = 'X';
                                break;
                            case '6':
                                plansza[5] = 'X';
                                break;
                            case '7':
                                plansza[6] = 'X';
                                break;
                            case '8':
                                plansza[7] = 'X';
                                break;
                            case '9':
                                plansza[8] = 'X';
                                break;
                            default:
                                Console.WriteLine(" Bledna Wartosc");
                                break;
                        }
                    }
                    else if (gracz == false)
                    {
                        gracz = true;
                        switch (wspol)
                        {
                            case '1':
                                plansza[0] = 'O';
                                break;
                            case '2':
                                plansza[1] = 'O';
                                break;
                            case '3':
                                plansza[2] = 'O';
                                break;
                            case '4':
                                plansza[3] = 'O';
                                break;
                            case '5':
                                plansza[4] = 'O';
                                break;
                            case '6':
                                plansza[5] = 'O';
                                break;
                            case '7':
                                plansza[6] = 'O';
                                break;
                            case '8':
                                plansza[7] = 'O';
                                break;
                            case '9':
                                plansza[8] = 'O';
                                break;
                            default:
                                Console.WriteLine(" Bledna wartosc");
                                break;
                        }
                    }
                }
                else
                {
                    Console.WriteLine(" !!! TO POLE JES ZAJETE !!!");
                    czyZajeteField = true;
                }
            }
            catch (System.IndexOutOfRangeException e)
            {
                Console.WriteLine(" !!! BLEDNA WARTOSC !!!");
                czyZajeteField = true;
            }

        }

        public void testWin(ref int i, ref char[] plansza)
        {//SPRAWDZANIE WARUNKÓW WYGRANEJ
            if (plansza[0] == 'X' && plansza[1] == 'X' && plansza[2] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[3] == 'X' && plansza[4] == 'X' && plansza[5] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[6] == 'X' && plansza[7] == 'X' && plansza[8] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[0] == 'X' && plansza[3] == 'X' && plansza[6] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[1] == 'X' && plansza[4] == 'X' && plansza[7] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[2] == 'X' && plansza[5] == 'X' && plansza[8] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[0] == 'X' && plansza[4] == 'X' && plansza[8] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }
            if (plansza[2] == 'X' && plansza[4] == 'X' && plansza[6] == 'X')
            {
                Console.WriteLine("GRACZ 2 WYGRAŁ");
                i = 11;
            }

            //===================== Warunki dla drugiego gracza
            if (plansza[0] == 'O' && plansza[1] == 'O' && plansza[2] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[3] == 'O' && plansza[4] == 'O' && plansza[5] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[6] == 'O' && plansza[7] == 'O' && plansza[8] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[0] == 'O' && plansza[3] == 'O' && plansza[6] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[1] == 'O' && plansza[4] == 'O' && plansza[7] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[2] == 'O' && plansza[5] == 'O' && plansza[8] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[0] == 'O' && plansza[4] == 'O' && plansza[8] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            if (plansza[2] == 'O' && plansza[4] == 'O' && plansza[6] == 'O')
            {
                Console.WriteLine("GRACZ 1 WYGRAŁ");
                i = 11;
            }
            else
            {
                if (i == 10)
                    Console.WriteLine(":( :( :( REMIS :( :( :(");
            }

        }
    }
}