

#include "pch.h"
#include <iostream>


using namespace std;
int main() {

	char znak;
	int liczba, i, j, sprawdz;
	sprawdz = 0;
	do {
		cout << "podaj liczbe" << endl;;
		cin >> liczba; // pobieramy wartosc do jakiego zakresu ma szukac program
		for (i = 1; i <= liczba; i++) {

			if (liczba%i == 0) { // jesli liczba jest podzielna spradz rosnie o 1
				sprawdz++;
			}
		}
		if (sprawdz == 2) {
			cout << liczba << " jest pierwsza"<<endl;
			sprawdz = 0;
		}
		else {
			cout << liczba << " Nie jest pierwsza"<<endl;
			sprawdz = 0;
		}

		cout << "aby kontynuwowac wcisnij t" << endl;
		cin >> znak;
	} while (znak == 't');
}
