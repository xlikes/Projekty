#include "stdafx.h"
#include <conio.h>
#include <iostream>


using namespace std;
int main()
{
	int n;
	int i;
	i = 0;

	cout << "Podaj liczbe n " << endl;
	cin >> n;
	while (i <= n) {
		i++;
		if (n%i == 0) {
			cout << "dzielnik liczby :" << i << endl;
		}
	}
	getch();
}

