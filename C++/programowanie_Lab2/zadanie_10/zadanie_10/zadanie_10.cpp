// zadanie_10.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <conio.h>
#include <math.h>
#define _USE_MATH_DEFINES

using namespace std;
int main()
{
	char znak;
	int a;
	int b;
	do {
		cout << "Podaj liczby a i b";
		cout << endl;
		cout << "Podaj a" << endl;
		cin >> a;
		cout << "Podaj b" << endl;
		cin >> b;

		while (a != b) {
			if (a > b) {
				a = a - b;
			}
			else if (b > a) {
				b = b - a;
			}
		}
		cout << "Najwiekszy wspolny dzielnik: " << a <<endl;
		cout << "Jesli chcesz kontynuowac wciscnij t" << endl;
		znak = _getch();

	} while (znak=='t');
	return 0;
}

