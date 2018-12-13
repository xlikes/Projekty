// Zadanie21.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <conio.h>
#include <math.h>
#define _USE_MATH_DEFINES
#include <iostream>
#include <string.h>

using namespace std;

void czyt_wyraz(char A[], int &n);
void sprawdz_wyraz(char A[], int n);

void czyt_wyraz(char A[], int &n){
	n = strlen(A);
	cout << "Podaj wyraz"<<endl;
	cin >> A;
	cout << A<<endl;
}

void sprawdz_wyraz(char A[],int n) {
	int i;
	int j;
	int nie = 0;
	for (i = 0; i < n/2; i++) {
		for (j = n; j > n/2; j--) {
			if (j != i) {
				nie++;
			}
		}
	}
	if (nie > 0) {
		cout << "Wyraz nie jest palindromem";
	}
	else {
		cout << "Wyraz jest palindromem";
	}

}

void obliczenia() {
	char kont;
	do {
		char A[30];
		int n;
		czyt_wyraz(A, n);
		sprawdz_wyraz(A, n);
		cout << "Jesli chcesz konynuowac wcisnij t";
		cin >> kont;
	} while (kont == 't');
}

int main()
{
	obliczenia();
    return 0;
	getch();
}

