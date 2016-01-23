
import java.util.*;
public class CaesarCipher {
    Integer ky;
    String ptext;
    String ctext;
    CaesarCipher(String text)
    {
        ky=3;
        ptext=text;        
    }
    public String CaesarCip()
    {
        int l;
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
char a[]=ptext.toCharArray();
for(int i=0;i<a.length;i++)
{    
  Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
   l=(temp+ky)%26;
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
}
ctext=Arrays.toString(t);
ctext=ctext.replace("[","");
ctext=ctext.replace(",","");
ctext=ctext.replace("]","");
ctext=ctext.replaceAll("\\s+","");
System.out.println(ctext);
return ctext;
    }    
}
