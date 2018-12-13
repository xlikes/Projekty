// zadanie_22.cpp : Defines the entry point for the console application.
//


#include "stdafx.h"
#include <conio.h>
#include <math.h>
#define _USE_MATH_DEFINES
#include <iostream>
using namespace std;

void dane(int A[][10], int&n);
void pisz_tab(int A[][10], int n);
void sort(int A[][10], int n);
void obliczenia();


void dane(int A[][10], int&n) {
	cout << "Podaj zakres";
	cin >> n; // pobieramy rozmiar tablicy
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			A[i][j] = rand() % 100 + 1; // wypelniamy tablice
		}
	}
}


void pisz_tab(int A[][10], int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout.width(3); // ograniczamy rozmiar na jedno pole tablicy do 3 znakow
			cout << A[i][j]; // wypisujemy tablice
		}
		cout << endl;
	}
}

void sort(int A[][10], int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n-1; j++) {
			if (A[j][j]>A[j+1][j+1]) { // sortujemy tablice jesli element j jest wiekszy od j+1 
				swap(A[j][j], A[j + 1][j + 1]); //zmieniamy je miejscami
			}
		}
	}
}

void obliczenia() { // glowna funkcja zbierajaca wszystkie funkcje
	char t;
	int A[10][10];
	int n;
	do {
		dane(A, n);
		pisz_tab(A, n);
		sort(A, n);
		cout << endl;
		pisz_tab(A, n);


		cout << "Powtarzamy (T/N)";
		cin >> t;
	} while (t == 't' || t == 'T');
}

int main()
{
	obliczenia();
	return 0;
}

