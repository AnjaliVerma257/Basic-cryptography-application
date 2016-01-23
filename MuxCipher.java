

import java.util.Arrays;

public class MuxCipher {
    Integer ky;
    String ptext;
    String ctext;
    MuxCipher(int key, String text)
    {
        ky=key;
        ptext=text;        
    }
    public String MuxCrypt()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        int l;
char a[]=ptext.toCharArray();
for(int i=0;i<a.length;i++)
{
    Conversion c=new Conversion(a[i]);
    int temp=c.converttoInt();
    l=(ky*temp)%26;
Conversion c1=new Conversion(l);
t[i]=c1.converttoChar();
            }
ctext=Arrays.toString(t);

return ctext;
    }    
}


