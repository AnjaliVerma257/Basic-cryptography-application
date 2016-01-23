
import java.util.Arrays;
public class AutoKeyDecipher {
Integer ky;    
    String ptext;
    String ctext;
 AutoKeyDecipher(int key, String text)
    {
        ky=key;      
        ptext=text;        
    }
    public String AutoKeyDecrypt()
    {
        char p[]=ptext.toCharArray();
        int f[]=new int[p.length];
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<p.length;i++)
        {
            if(i==0)
            {
            f[i]=(new Conversion(p[i]).converttoInt()-ky+26)%26;
            sb.append(new Conversion(f[i]).converttoChar());
            
            }
            else
            {
                f[i]=(new Conversion(p[i]).converttoInt()-f[i-1]+26)%26;
                sb.append(new Conversion(f[i]).converttoChar());
            }
        }
        return sb.toString();
    }        
}
