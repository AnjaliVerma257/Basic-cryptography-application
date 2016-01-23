

import java.util.Arrays;

public class VigenereCipher {
    String ky;    
    String ptext;
    String ctext;
 VigenereCipher(String key, String text)
    {
        ky=key;      
        ptext=text;        
    }
    public String VigenereCrypt()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        ky=ky.toUpperCase();
        int l;
        int kl=ky.length();
char ip[]=ptext.toCharArray();
char key[]=ky.toCharArray();
for(int i=0;i<ip.length;i++)
{
    Conversion c=new Conversion(ip[i]);
    int temp=c.converttoInt();
l=(temp+new Conversion(key[i%kl]).converttoInt())%26;
    
    
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
            }
ctext=Arrays.toString(t);
System.out.println(ctext);
return ctext;
    }        
}
