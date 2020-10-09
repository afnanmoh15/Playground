#include <iostream>
#include<string.h>
using namespace std;
void replace(char str[10],char a,char b,int n)
{
for(int i =0;i<n;i++){
	if(str[i]==a)
		str[i]=b;
  else if(str[i]==b)
		str[i]=a;
}
cout<<str;
}

int main() 
{
  char str[10];
  int n;
  char a,b;
  cin>>str>>a>>b;
  n=strlen(str);
  replace(str,a,b,n);
}