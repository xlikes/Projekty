// Zadanie23.cpp : Defines the entry point for the console application.
//

// zadanie_22.cpp : Defines the entry point for the console application.
//


#include "stdafx.h"
#include <conio.h>
#include <math.h>
#define _USE_MATH_DEFINES
#include <iostream>
using namespace std;

void dane(int A[][10], int&n,int&m);
void pisz_tab(int A[][10], int n,int m);
void zmiana(int A[][10], int n, int m);
void obliczenia();


void dane(int A[][10], int&n, int&m) {
	cout << "Podaj zakres" << endl;
	cout << "Podaj ilosc wierszy" << endl;
	cin >> n; // pobieramy rozmiar tablicy
	cout << "Podaj ilosc kolumn" << endl;
	cin >> m; // pobieramy rozmiar tablicy
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			A[i][j] = rand() % 100 + 1; // wypelniamy tablice
		}
	}
}


void pisz_tab(int A[][10], int n, int m) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cout.width(3); // ograniczamy rozmiar na jedno pole tablicy do 3 znakow
			cout << A[i][j]; // wypisujemy tablice
		}
		cout << endl;
	}
}

void zmiana(int A[][10], int n, int m) {
	int l, k;
	cout << "Ktore wiersze zamieniamy"<<endl;
	cin >> l;
	cin >> k;
	//odejmujemy od wierszy minus 1 bedzie to latwiejsze w odbiorze dla uzytkownika
	l = l - 1;
	k = k - 1;
	for (int i = 0; i < n; i++) {
				swap(A[l][i],A[k][i]); //zmieniamy je miejscami
			}
}

void obliczenia() { // glowna funkcja zbierajaca wszystkie funkcje
	char t;
	int A[10][10];
	int n,m;
	do {
		dane(A, n,m);
		pisz_tab(A, n,m);
		zmiana(A, n,m);
		cout << endl;
		pisz_tab(A, n,m);


		cout << "Powtarzamy (T/N)";
		cin >> t;
	} while (t == 't' || t == 'T');
}

int main()
{
	obliczenia();
	return 0;
}


