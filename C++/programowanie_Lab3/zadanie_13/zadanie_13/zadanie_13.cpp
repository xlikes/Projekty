// zadanie_13.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <conio.h>



using namespace std;
int main()
{
	char znak;
	int liczba, suma;
	do {
		suma = 0; // zerujemy sume
		cout << "Podaj liczbe do sprawdzenia czy jest doskonala" << endl;
		cin >> liczba; // wprowadzamy liczbe do sprawdzenia

		for (int i = 1; i <liczba; i++) {
			if (liczba%i == 0) {
				suma = suma + i; // dodajemy do sumy jej dzielniki
			}
		}
		if (liczba == suma) {
			cout << "Liczba: " << liczba << " Jest doskonala" << endl; // jesli suma dzielnikow jest rowna liczbie wtedy liczba jest doskonala
		}
		else if (liczba != suma) {
			cout<<"Liczba: "<< liczba << " nie jest doskonala"<<endl; // jesli suma dzielnikow jest rozna od liczby
		}

		cout << "Jesli chcesz kontynuowac sprawdzanie liczb wcisnij t" << endl;
		cin >> znak;
		
	} while (znak == 't');
	getch();
}

