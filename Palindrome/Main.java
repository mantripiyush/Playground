#include <iostream>
#include <cstring>
using namespace std;

int main() 
{char p[50];
 int s,x,j=0;
 cin.getline(p,50);
 s=strlen(p);
 if(s%2==0)
 { x=s/2;}
 else{ x=s/2;
      x++;}
 --s;
 for(int i=0;i<x;i++)
 {if(p[i]==p[s])
   j++;
  --s;
 }
 if(j==x)
   cout<<1;
 else cout<<0;
    return 0;
}