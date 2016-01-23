

import java.util.Arrays;

public class AffineCipher {
    Integer kym;
    Integer kya;
    String ptext;
    String ctext;
 AffineCipher(int key1, int key2, String text)
    {
        kym=key1;
        kya=key2;
        ptext=text;        
    }
    public String AffineCrypt()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        int l;
char a[]=ptext.toCharArray();
for(int i=0;i<a.length;i++)
{
    Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
     l=(kym*temp)%26;
      l=(l+kya)%26;
    
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
            }
ctext=Arrays.toString(t);
System.out.println(ctext);
return ctext;
    }    
}


