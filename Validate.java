

import java.applet.Applet;
import java.math.BigInteger;

public class Validate {
int okay;
// 48 - 0
// 49 - 1
// 50 - 2
// 51 - 3
// 52 - 4
// 53 - 5
// 54 - 6
// 55 - 7
// 56 - 8
// 57 - 9
public int checkNumKey(String a)
{
    String ip=a;
    if(ip.length()>2)
        okay=0;
    if(ip.length()==1)
    {
        if(ip.charAt(0)>=48 & ip.charAt(0)<=57)
        {
            okay=99;
        }
    }
    else if(ip.length()==2)
    {
        if(ip.charAt(0)==49 &  ip.charAt(1)>=48 & ip.charAt(1)<=57)
        {
        okay=99;
        }
        else if(ip.charAt(0)==50 &  ip.charAt(1)>=48 & ip.charAt(1)<=54)
        {
            okay=99;
        }
        else
            okay=0;
       
    }
    else
        okay=0;
    
return okay;
}
public String getString(String o)
{
    String j=o;
    j=j.toUpperCase();
    StringBuilder b=new StringBuilder();
    for(int i=0;i<j.length();i++)
    {
        if(j.charAt(i)>=65 & (j.charAt(i)<=90))
        {
            b.append(j.charAt(i));
        }
    
    }
    return b.toString();
}
public int checkStringKey(String a)
{
    int error;
    String input=a;
    input=input.toUpperCase();
    if(input.length()<26)
    {
     error=0;
     return error;
    }
    else
    {
    for(char i=65;i<=90;i++)
    {
       input=input.replace((Character.toString(i)),"");
             
    }
    
    
    if(input.length()!=0)
    {
        error=0;
    }
    else
        error=99;
    
    return error;
    }
}




public String getInput(String a)
{
    String ip=a;
    ip=ip.toUpperCase();
    for(int i=0;i<ip.length();i++)
    {
        if(ip.charAt(i)>=65 & ip.charAt(i)<=90)
        {            
        }
        else
        {
            String ab;
            ab = Character.toString(ip.charAt(i));
            ip=ip.replace(ab,"");
        }
    }
    return ip;
}


public int checkVigenereKey(String a)
{
   int error=0;
    String input=a;
    input=input.toUpperCase();
      for(char i=0;i<input.length();i++)
    {
      if(input.charAt(i)>=65 && input.charAt(i)<=90 )
             error=99;
      else
      {
          error=0;
          return error;
      }
   
    } 
       return error;
   
}

public int checkCharKey(String a)
{
   int error=0;
    String input=a;
    input=input.toUpperCase();
    if(input.length()!=1)
        error=0;
    else
    {
      for(char i=0;i<input.length();i++)
    {
      if(input.charAt(i)>=65 && input.charAt(i)<=90 )
             error=99;
      else
      {
          error=0;
          return error;
      }
   
    }} 
       return error;
   
}

public int checkNumPrime(String n)
{
    int error=0;
    
    String a=n;
    a=a.replaceAll(" ", "");
    int x;
  
    x=Integer.parseInt(a);
    for(int i=2;i<x;i++)
    {
        if(x%i==0)
        {error=0;
        break;
        }
        else
            error=99;
    }
    return error;
    
}

public int checkNum(String n)
{
    int error=0;
    String a=n;
    int x;
    for(int i=0;i<a.length();i++)
    {
        if(a.charAt(i)>=48 && a.charAt(i)<=57)
        {
            error=99;
            
        }
        else
            error=0;
    }
   
    return error;
}

public int getNum(String a)
{
    String ip=a;
    int l=0;
    
    for(int i=0;i<ip.length();i++)
    {
        if(ip.charAt(i)>=48 & ip.charAt(i)<=57)
        {            
        }
        else
        {
            String ab;
            ab = Character.toString(ip.charAt(i));
            ip=ip.replace(ab,"");
        }
    }
    
    l=(Integer.parseInt(ip));
    return l;
}

public BigInteger convertToBig(String a)
{
    StringBuilder ab=new StringBuilder();
    int n;
    BigInteger ans=BigInteger.ZERO;
    for(int i=0;i<a.length();i++)
    {
        
        char z=a.charAt(i);
        Conversion c=new Conversion(z);
        n=c.converttoInt();
        if(n>=0 & n<=9)
        {

            ans=ans.multiply(BigInteger.valueOf(100)).add(BigInteger.valueOf(n));
          
        }
        else if(n>=10 & n<=25)
        {
            ans=ans.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(n));
        }
            
        
    }



   //System.out.println(ans);
    return ans;
}
public String conv(int n, int mod)
{
    String a=String.valueOf(mod);
    String b=String.valueOf(n);
    StringBuilder sb=new StringBuilder();
    int l=a.length()-b.length();
    for(int i=0;i<l;i++)
    {
        sb.append("0");
    }
    sb.append(""+n+"");
    return sb.toString();
}

public int[] div(String ip, int m)
{
    String b=String.valueOf(m);
    int s=ip.length()/b.length();
    int ans[]=new int[s];
      for(int i=0;i<s;i++)
    {
        ans[i]=Integer.parseInt(ip.substring(i*b.length(), (i*b.length())+b.length()));
       
    }
    return ans;
}



}
