// zadanie_6.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <conio.h>

using namespace std;
int main()
{
		int i;
		int suma;
		suma = 0;

		for (i = 1; i < 11; i++) {
			suma = suma + (i*i); //liczenie ilosci cegiel
		}
		cout << suma;
	getch();
}

