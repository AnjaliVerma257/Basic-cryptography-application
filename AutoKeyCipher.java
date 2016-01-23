import java.util.Arrays;

public class AutoKeyCipher {
Integer ky;    
    String ptext;
    String ctext;
 AutoKeyCipher(int key, String text)
    {
        ky=key;      
        ptext=text;        
    }
    public String AutoKeyCrypt()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        int l;
char a[]=ptext.toCharArray();
for(int i=0;i<a.length;i++)
{
    Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
    if(i==0)
    {
        l=(ky+temp)%26;
    }
    else
    {
        l=(temp+(new Conversion(a[i-1]).converttoInt()))%26;
    }
    
    
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
            }
ctext=Arrays.toString(t);
System.out.println(ctext);
return ctext;
    }        
}
