

#include "pch.h"
#include <iostream>
#include <conio.h>
#include <math.h>
#include <cstdlib>
#define _USE_MATH_DEFINES


using namespace std;
int main()
{
	double suma,sumapi,i, licznik,mianownik,pi;
	suma = 0;
	sumapi = 0;
	licznik = 1;
	for (i = 1; i<= 100000000;i++) { // obliczanie sumy kwadratow do podanej liczby w zadaniu

		
		mianownik = i * i; // obliczanie mianownika
		suma = suma + (1 / mianownik);//obliczanie calego wyrazu

		pi =4*((pow(-1,(i - 1))) /( (2 * i) - 1)); // wzor na wyrazy ciagu dla pi
	
		sumapi = sumapi + pi; //suma ciagu wyznaczajacego pi
	}
	cout <<"Suma kwadratow wynosi "<< suma<<endl; // wypisanie sumy kwadratow
	cout <<"Wyznaczenie pi "<< sumapi<<endl; //wypisanie wyznaczonego pi

}

