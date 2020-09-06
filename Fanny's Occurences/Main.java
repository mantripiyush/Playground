#include <iostream>
#include <cstring>
using namespace std;

int main() 
{char p[50];
 char x;
 cin.getline(p,25);
 cin>>x;
 for(int i=0;i<strlen(p);i++)
 {if(p[i]==x)
   continue;
  cout<<p[i];
 }
 return 0;
}
 
 
