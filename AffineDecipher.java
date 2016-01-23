

import java.util.Arrays;

public class AffineDecipher {
    Integer kym;
    Integer kya;
    String ptext;
    String ctext;
 AffineDecipher(int key1, int key2, String text)
    {
        kym=key1;
        kya=key2;
        ptext=text;        
    }
    public String AffineDecrypt()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        int l;
char a[]=ptext.toCharArray();
int mui=0;
for(int j=0;j<26;j++)
{
    if((kym*j)%26==1)
        mui=j;
}
for(int i=0;i<a.length;i++)
{
    Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
     l=(mui*(temp-kya+26))%26;
      
    
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
            }
ctext=Arrays.toString(t);
System.out.println(ctext);
return ctext;
    }    
}


