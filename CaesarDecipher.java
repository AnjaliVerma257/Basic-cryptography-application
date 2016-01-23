

import java.util.*;
public class CaesarDecipher {
    Integer ky;
    String ptext;
    String dtext;
    CaesarDecipher(String text)
    {
        ky=3;
        ptext=text;        
    }
    public String CaesarDecip()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        int l;
char a[]=ptext.toCharArray();
for(int i=0;i<a.length;i++)
{
    Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
    if(temp<=ky)
        l=(temp-ky+26)%26;
    else
    {
        l=(temp-ky)%26;
    }
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
            }
dtext=Arrays.toString(t);
//System.out.println(dtext);
return dtext;
    }    
}
