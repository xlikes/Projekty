// zadanie_14.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include<iostream>
#include<conio.h>

using namespace std;
int main()
{
	cout << endl;
	int i, j,x;
	for (i = 1; i <= 10; i++) {

		for (j = 10; j > i; j--){
			cout << " ";
		}
		
		for (x = 0; x < i*2-1; x++) {
			cout << "*";
		}
		cout << endl;
	}

	getch();
    return 0;
}

