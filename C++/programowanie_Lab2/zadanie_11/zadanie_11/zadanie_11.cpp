// zadanie_11.cpp : Defines the entry point for the console application.
//
#include "stdafx.h"
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
		srand(time(NULL));
		int wygrana;
		wygrana = 0;
		int p;
		p = rand() % 6 + 1;
		int q;
		q = rand() % 6 + 1;

		if (p%2==0) { // jesli parzysta
			switch (q) {
			case 2:
			case 4:
			case 5: {
				wygrana = p + 3*q;
				break;
			case 1:
			case 3:
			case 6: {
				wygrana = 2 * q;
				break;
			default: break;
			}
		}
	}
		}
		else  { // jesli nieparzysta
			switch (q) {
			case 1:
			case 3:
			case 6: {
				if (p == q) {
					wygrana = 5 * p + 3; // jesli p=q
					break;
				}
				else {
					wygrana = 2 * q + p; // jesli p nie rowna sie q
					break;
				}
			case 2:
			case 4:
			case 5: {
				wygrana = min(p,q)+4;
				break;
			default:break;

			}
			}
			}
		
		}
		if (p == 5 && q == 5) {
			wygrana = wygrana + 5; // jesli  wyniki obu rzutów to 5
		}
		cout << "wylosowane p i q" << endl;
		cout<< p <<"   "<< q << endl;
		cout << "Twoja wygrana to : " << wygrana << endl;
		cout << "Jesli chcesz kontynuowac wciscnij t" << endl;
		znak = _getch();

	} while (znak == 't');
	return 0;
}