// zadanie_16.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <conio.h>

long silnia(int a) {
	long s = 1;
	for (int i = 1; i <= a; i++) {
		s = s*i; // liczymy silnie w zmiennej s
	}
	return s;

}

int wynik(int n, int k) {
	long w;
	w = silnia(n) / (silnia(k)*silnia(n - k)); // livxmy wedlug wzoru na dwumian newtona
	return w;
}


using namespace std;

int main()
{
	char znak;
	do {
		int n, k;
		cout << "Podaj liczbe n" << endl;
		cin >> n; // pobieramy liczbe z jakiej chcemy liczyc silnie
		cout << "Podaj liczbe k" << endl;
		cin >> k; // pobieramy liczbe z jakiej chcemy liczyc silnie

		cout << wynik(n, k)<<endl; // zwracamy wynik

		cout << "jesli chcesz kontynuowac wcisnij t";
		cin >> znak;
	} while (znak == 't');
	getch();
    return 0;
}

