

import java.util.Arrays;

public class MuxDecipher {
    Integer ky;
    String ptext;
    String dtext;
    MuxDecipher(int key, String text)
    {
        ky=key;
        ptext=text;        
    }
    public String MuxDecrypt()
    {
        char t[]= new char[ptext.length()];
        ptext=ptext.toUpperCase();
        int l=1;
char a[]=ptext.toCharArray();
int mui=0;
for(int j=0;j<26;j++)
{
    if((ky*j)%26==1)
        mui=j;
}
Conversion c;
for(int i=0;i<ptext.length();i++)
{
    c=new Conversion(a[i]);
    int x=c.converttoInt();
    int temp=(x*mui)%26;
    c=new Conversion(temp);
    t[i]=c.converttoChar();
}

dtext=Arrays.toString(t);

return dtext;
    }    
}


