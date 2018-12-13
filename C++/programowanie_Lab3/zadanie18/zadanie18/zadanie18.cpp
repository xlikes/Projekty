// zadanie18.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include "pch.h"
#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>


using namespace std;


double f(double x)
{
	double e = 2.718281828459045235360287471352662497757247093699; // 2.7182 przyblizenie liczby e


	return pow(e,-1.5*x)-0.3*x*x; 
}

int main()
{
	char t;

	do {
		double a, b, dokl, x0, fa, fb, f0;

		cout << "Podaj dokladnosc";
		cin >> dokl;

		cout << "a = ";
		cin >> a;
		cout << "b = ";
		cin >> b;

		fa = f(a);
		fb = f(b);
		if (fa * fb > 0)
		{
			cout << "Funkcja nie spelnia zalozen\n";
		}
		else
		{
			while (fabs(a - b) > dokl) //wartosc bezwzgledna do dokladnosci
			{
				x0 = (a + b) / 2; f0 = f(x0);
				if (fabs(f0) < dokl) break; // wartosc bezwzgledna
				if (fa * f0 < 0) b = x0;
				else
				{
					a = x0; fa = f0;
				}
			}
			cout << "Wynik:pierwiastek" << fixed << setprecision(6) << x0 << endl; //Ustawiamy precyzje na 6 znakow po przecinku
		}
		cout << "Jesli chcesz kontynuowac wcisnij t\n";
		cin >> t;
	} while (t == 't');
}