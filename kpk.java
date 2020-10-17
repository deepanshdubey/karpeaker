//Author   : Deepansh Dubey.
//Date       : 17/10/2020.
//Purpose: Check for karpeaker number.


import java.io.*;
class kpk //karpeaker
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,n,c=0,d,e,f,g;
System.out.println("Enter a number");
n=Double.parseDouble(br.readLine());
a=n*n;
b=n;
while(b!=0)
{
b=b/10;
c++;
}
d=Math.pow(10,c);
e=a/d;
f=a%d;
g=e+f;
if(g==n)
{
System.out.println("Karpeaker");
}
else
{
System.out.println("Not a karpeaker");
}
}
}