// zadanie_15.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <conio.h>


using namespace std;
int main()
{
	char znak;
	do {
		int koniec, i, j, licznik;
		licznik = 0;
		cout << "Podaj liczbe do ktorej chcesz szukac liczb pierwszych"<<endl;
		cin >> koniec; // koniec przedzialu w ktorym chcemy szukac liczb

		for (i = 1; i <= koniec; i++) {

			for (j = 1; j <= i; j++) {
				if (i%j == 0) {
					licznik++; // jesli liczba jest podzielna dodajemy jeden dzielnik
				}
			}
			if (licznik == 2) { // liczba jest pierwsza kiedy posiada tylko dwa dzielniki
				cout << "Liczba pierwsza to " << i << endl; 
				licznik = 0; // zerujemy liczbe dzielnikow jesli liczba jest pierwsza
			}
			else {
				licznik = 0; // zerujemy liczbe dzielnikow jesli liczba nie jest pierwsza
			}
		}
		cout << "jesli chcesz kontynuowac wcisnij t";
		cin >> znak;
	} while(znak =='t');

	getch();
    return 0;
}

