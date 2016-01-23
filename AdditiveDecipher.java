
import java.util.*;
public class AdditiveDecipher {
    Integer ky;
    String ptext;
    String dtext;
    AdditiveDecipher(int key, String text)
    {
        ky=key;
        ptext=text;        
    }
    public String AdditiceDecip()
    {
        StringBuilder t=new StringBuilder();
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
t.append(c1.converttoChar());
            }
dtext=t.toString();
//System.out.println(dtext);
return dtext;
    }    
}
