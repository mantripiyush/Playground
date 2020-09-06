#include<iostream>
using namespace std;
int main()
{ int x,i,t;
 float ie,d,l,p;
 cin>>x>>i>>t;
 ie=(x*i*t)/100;
 l=x+ie;
 d=(ie*2)/100;
 p=l-d;
 cout<<ie<<"\n"<<l<<"\n"<<d<<"\n"<<p;
 return 0;
  //Type your code here.
}