
import java.util.*;
public class AdditiveCipher {
    Integer ky;
    String ptext;
    String ctext;
    AdditiveCipher(Integer key, String text)
    {
        ky=key;
        ptext=text;        
    }
    public String AdditiveCip()
    {
        int l;
        StringBuilder t=new StringBuilder();
        ptext=ptext.toUpperCase();
char a[]=ptext.toCharArray();
for(int i=0;i<a.length;i++)
{    
  Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
   l=(temp+ky)%26;
Conversion c1=new Conversion(l);
t.append(c1.converttoChar());
}
ctext=t.toString();

return ctext;
    }    
}
