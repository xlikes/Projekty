using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WordCounter
{
    class WordCounter
    {


        static void Main(string[] args)
        {
            string temporary;
            string str = "Ala ma kota a kot to kot a ktory ma ale".ToLower();
            char[] strTab = str.ToCharArray();
            int words = 1;
            int start = 0;
            int qua = 0;
            int counter = 1;

            bool clone = false;

            Hashtable sentence = new Hashtable();

            for (int i = 0; i < str.Length; i++)
            {


                if (strTab[i] ==' ')
                {

                    qua = i - start;
                    temporary = str.Substring(start, qua);
                    start = i;
                    if (sentence.ContainsKey(temporary))//warunek jesli klucz juz sie powtarza
                    {

                        words++;
   
                    int newValue = Convert.ToInt32(sentence[temporary])+1; // konwersja value dla klucza typu obiekt na int
                    sentence[temporary] = newValue; // przypisanie nowej wartosci dla powtarzajacego sie klucza
                        
                    }
                    else
                    {
                        sentence.Add(temporary, counter); // dodanie nowego elementu do hashtable
                        words++;
                    }

                }

            }

            Console.WriteLine("Liczba wyrazow to " + words);

            foreach (DictionaryEntry item in sentence)
            {
                string word = (string)item.Key;
                int number = (int)item.Value;
                Console.Write(word + " = " + number + ", ");
            }
            Console.Write(Environment.NewLine);
        }
    }
}