#include<iostream>
using namespace std;
int main()
{int x,y,z;
 cin>>x;
 y=x/1000;
 z=x%1000;
 z=z%100;
 z%=10;
 cout<<y+z;
 return 0;
 
  //Type your code here.
}