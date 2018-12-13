
#include "pch.h"
#include <math.h>
#define _USE_MATH_DEFINES
#include <iostream>
#include <time.h>
#include<algorithm>
using namespace std;

void obliczenia();
void czyt_dane(int A[], int&n);
void pisz_tab(int A[], int n);
void srednia(int A[], int n);
void min(int A[], int n);
void max(int A[], int n);
void zadany(int A[], int n);
void element(int A[], int n);


void czyt_dane(int A[], int&n) {
	int a, b;
	srand(time(NULL));
	cout << "Podaj ilosc elementow tablicy" << endl;
	cin >> n;
	cout << "Podaj a" << endl; // pobieramy zakres losowan
	cin >> a;
	cout << "Podaj b" << endl;
	cin >> b;
	for (int i = 0; i < n; i++) {
		A[i] = rand() % (b - a + 1) + a; // losujemy liczby tablicy
	}
}

void pisz_tab(int A[], int n) {
	for (int i = 0; i < n; i++) {
		cout << A[i] << " "; // wypisujemy tablice
	}
}

void srednia(int A[], int n) {
	float suma = 0;
	float srednia = 0;
	for (int i = 0; i < n; i++) {
		suma = suma + A[i]; // liczymy srednia
		srednia = suma / n;
	}
	cout << endl;
	cout << "srednia to " << srednia;

}

void max(int A[], int n) {
	int max = A[0];
	int PozMax = 0;
	int i = 0;

	while (i < n) {
		if (A[i] > max) { // sprawdzamy maksymalna wartosc
			max = A[i];
			PozMax = i;
		}
		else
			i++;
	}
	cout << "\nLiczba max to " << max;
	cout << "\nPozycja tej liczby to " << PozMax;
}

int maxDlaCzesto(int A[], int n) {
	int max = A[0];
	int PozMax = 0;
	int i = 0;

	while (i < n) {
		if (A[i] > max) { // sprawdzamy maksymalna wartosc
			max = A[i];
			PozMax = i;
		}
		else
			i++;
	}
	return max;
}

void min(int A[], int n) {
	int min = A[0];
	int PozMin = 0;
	int i = 0;

	while (i < n) {
		if (A[i] < min) { // sprawdzamy minimalna wartosc
			min = A[i];
			PozMin = i;
		}
		else
			i++;
	}
	cout << "\nLiczba min to " << min;
	cout << "\nPozycja tej liczby to " << PozMin << endl;
}

void czestotliwosc(int A[], int n) {
	
	int sprawdz,licznik;
	licznik = 0;
	cout << "Podaj jaka liczbe mam sprawdzic pod wzgledem powtorzen ";
	cin >> sprawdz;
	for (int i = 0; i <= n; i++) { // sprawdzamy ile razy powtarza sie liczba uzytkownika
		if (sprawdz == A[i]) {
			licznik++;
		}
	}
	cout << "Liczba powtorzen to " << licznik << endl;
}

void najczesciej(int A[], int n) {
	int naj = 0, liczba = 0, najNew = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < maxDlaCzesto(A,n); j++) {
			if (i == A[j]) {
				najNew++;
			}
		}
		if (najNew > naj) {
			naj = najNew;
			liczba = i;
		}
		najNew = 0;
	}
	cout << "Najczesciej wystepujacy element to " << liczba << " liczba powtorzen to "<<naj<<endl;
}

void obliczenia() {
	char znak;
	int A[100];
	int n = 0;
	int wybor;
	do {
		cout << "Co chcesz zrobic podaj nr od 1 do 5" << endl;
		cout << "1. Licz srednia" << endl;
		cout << "2. Wartosc Max" << endl;
		cout << "3. Wartosc Min" << endl;
		cout << "4. Sprawdz czestotliwosc dla danej liczby" << endl;
		cout << "5. Jaki Element powtarza sie najczesciej" << endl<<endl;
		cout << "Inny klawisz powoduje WYJSCIE " << endl;
		cin >> wybor;
		if (wybor <= 5 && wybor >= 1) {
			czyt_dane(A, n);
			pisz_tab(A, n);
			if (wybor == 1) {
				srednia(A, n);
				cout << "Jesli chcesz kontynuowac wcisnij  t";
				cin >> znak;
			}
			else if (wybor == 2) {
				max(A, n);
				cout << "Jesli chcesz kontynuowac wcisnij  t";
				cin >> znak;
			}
			else if (wybor == 3) {
				min(A, n);
				cout << "Jesli chcesz kontynuowac wcisnij  t";
				cin >> znak;
			}
			else if (wybor == 4) {
				czestotliwosc(A, n);
				cout << "Jesli chcesz kontynuowac wcisnij  t";
				cin >> znak;
			}
			else if (wybor == 5) {
				najczesciej(A, n);
				cout << "Jesli chcesz kontynuowac wcisnij  t";
				cin >> znak;
			}
		}
		else
			znak = 'x';
	} while (znak == 't');

}


int main()
{
	obliczenia();
	return 0;
}

