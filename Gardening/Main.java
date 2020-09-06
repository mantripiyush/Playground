#include<iostream>
using namespace std;
int main()
{int x,y,z,t;
 cin>>x>>y>>z;
 if(z>(x+1)&&z<(x*2+1))
    cout<<"It is a mango tree";
 else if(z>(x*(y-2))&&z<(x*(y-1))+1)
    cout<<"It is a mango tree"; 
 else cout<<"It is not a mango tree";
 return 0;
 
  //Type your code here.
}