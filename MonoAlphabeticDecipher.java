
public class MonoAlphabeticDecipher {
    String key;
    String ctext;
            
        MonoAlphabeticDecipher(String ky, String text)
    {
        key=ky;
        ctext=text.toUpperCase();
    }
        public String MonoAlphabeticDecrypt()
        {
            Conversion c;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<ctext.length();i++)
            {
                for(int j=0;j<key.length();j++)
                {
                    if(key.charAt(j)==ctext.charAt(i))
                    {
                        c=new Conversion(j);
                        sb.append(c.converttoChar());
                                
                    }
                    
                }
            }
            return sb.toString();
        }
}
