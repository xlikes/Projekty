// zadanie_12.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include "pch.h"
#include <iostream>
#include <conio.h>
#include <math.h>
#include <time.h>
#include <algorithm>
#define _USE_MATH_DEFINES
using namespace std;
int main()
{
	char znak;
	do {
		int d, m, r;

		cout << "Podaj dzien" << endl;
		cin >> d;
		cout << "Podaj miesiac" << endl;
		cin >> m;
		cout << "Podaj rok" << endl;
		cin >> r;

		if (m < 3) { // jesli miesiac jest mniejszy o 3 zwieksz miesiac o 12 i cofnij rok o 1
			r = r - 1;
			m = m + 12;
		}

		d = r + r / 4 - r / 100 + r / 400 + 3 * m - (2 * m + 1) / 5 + d + 1;  // wzor obliczajacy dzien tygodnia
		d -= (d / 7) * 7;

		cout << d << endl; // wypisuje ktory dzien tygodnia liczbowo

		switch (d) { // switch na podstawie d wypisujacy poszczegolne dni tygodnia
		
		case 1:
			cout << "Poniedzialek";
			break;
		case 2:
			cout << "Wtorek";
			break;
		case 3:
			cout << "Sroda";
			break;
		case 4:
			cout << "Czwartek";
			break;
		case 5:
			cout << "Piatek";
			break;
		case 6:
			cout << "Sobota";
			break;
		case 7:
			cout << "Niedziela";
			break;
			
		default:
			cout << "Error";
				break;
		}
		cout << "Jesli chcesz kontynuowac wciscnij t" << endl;
		cin >> znak;
	} while (znak == 't');

}