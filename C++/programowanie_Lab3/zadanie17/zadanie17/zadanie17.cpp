#include "pch.h"
#include <iostream> 
#include <math.h> 

  
// Main function 
using namespace std;
int main()
{
	char t;
	do {
		float przybliz, x, mianownik, sinx, sinWartosc;

		cout << "Podaj x" << endl;
		cin >> x;
		cout << "Podaj przyblizenie" << endl;
		cin >> przybliz;

		// zamieniamy stopnie na radiany
		x = x * (3.142 / 180.0);

		float x1 = x;

		// maps the sum along the series 
		sinx = x;

		// przechowujemy aktualna wartosc sinusa
		sinWartosc = sin(x);
		int i = 1;
		do
		{
			mianownik = 2 * i * (2 * i + 1);
			x1 = -x1 * x * x / mianownik;
			sinx = sinx + x1;
			i = i + 1;
		} while (przybliz <= fabs(sinWartosc - sinx)); // wartosc bezwzgledna liczby przecinkowej
		cout << sinx << endl;
		cout << "jesli chcesz kontynuowac wcisnij t" << endl;
		cin >> t;
	} while (t == 't');
}


