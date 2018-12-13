// Zadanie19.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <conio.h>
#include <math.h>
#define _USE_MATH_DEFINES
#include <iostream>
using namespace std;

float f1(float);
float f2(float);
float f3(float);

void bisekcja(float, float, float,float f(float x));

void menu();
void obliczenia();




float f1(float x){
	return (sin(x)*cos(x)+5*x+1);
}

float f2(float x){
	return (M_PI-(x*x)+(sin(x)/sqrt(25-x)));
}

float f3(float x){
	return (exp(-1.5*x)-0.3*x*x);
}

void menu(){

cout<<"\n\n\n";
cout<<"\t1. Pierwiastek fukncji f1(x) = (sin(x)*cos(x)+5*x+1)"<<endl;
cout<<"\t2. Pierwiastek fukncji f1(x) = (M_PI-x*x+sin(x)/sqrt(25-x))"<<endl;
cout<<"\t3. Pierwiastek fukncji f1(x) = (exp(-1.5*x)-0.3*x*x)"<<endl;
cout<<"\t4. Koniec";

}

void bisekcja(float a, float b, float eps, float f(float x)){
	float pierw,fa, fb, f0;
	int k=0;
	if(f(a)==0){
		pierw=a;
	}
	else if(f(b)==0){
		pierw=b;
	}
	
	fa = f(a);
	fb = f(b);

	while (fabs(a - b) > eps) 
			{
				k++;
				pierw = (a + b) / 2; f0 = f(pierw);
				if (fabs(f0) < eps) 
					break;
				if (fa * f0 < 0) 
					b = pierw;
				else
				{
					a = pierw; fa = f0;
				}
			}

	cout<<"Pierwiastek= "<<pierw<<endl;
	cout<<"Liczba Iteracji"<<k<<endl;
}



void obliczenia(void){
float a,b,eps;
char z, wybor;

do{
	system("cls");
	menu();
	cout<<"\n\n\n\n\n\t\t\t\t\t Twoj wybor (1,2,3,4): ";
	wybor =_getch();
	system("cls");
	if(wybor =='4'){
		cout<<"Koniec pracy z progamem";
		cout<<"Nacisnij dowolny klawisz";
		_getch();
	break;
}
else{

	cout<<"Wybrales funkce f"<<wybor<<"(x\n\n\n)";
	cout<<"Podaj a: ";cin>>a;
	cout<<"Podaj b: ";cin>>b;
	cout<<"Podaj dokladnosc eps"; cin>> eps;
	cout<<"\n\n";

	if(wybor=='1'){
	bisekcja(a,b,eps,f1);
	}
	else if(wybor =='2'){
	bisekcja(a,b,eps,f2);
	}
	else if(wybor=='3'){
	bisekcja(a,b,eps,f3);
	}

	cout <<"Powtarzamy (T/N)";
	z=getch();
}
}
while(z=='t'||z=='T');
}





int _tmain(int argc, _TCHAR* argv[])
{
	obliczenia();
	return 0;
}

