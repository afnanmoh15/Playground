#include <iostream>
using namespace std;
void balance(int a,int m,int rs){
int temp,pr;
  if(a>m){
temp=a-m;
  pr=rs-temp;
    if(pr>=0)
    {
  		cout<<pr;
	} 
  }
else if(a<m){
temp=m-a;
  pr=rs+temp;
   if(pr>=0)
    {
  		cout<<pr;
	}
}
  else if(a==m){

  cout<<rs;
}
  }


int main() 
{
  int a,m,rs;
  cin>>a>>m>>rs;
  balance(a,m,rs);
  
}