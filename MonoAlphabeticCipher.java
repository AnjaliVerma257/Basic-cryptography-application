
public class MonoAlphabeticCipher {
    String key;
    String ptext;
    String ctext;        
        MonoAlphabeticCipher(String ky, String text)
    {
        key=ky;
        ptext=text.toUpperCase();
    }
        public String MonoAlphabeticCrypt()
        {
            Conversion c;
            char ct;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<ptext.length();i++)
            {
                c=new Conversion(ptext.charAt(i));
                 int a=c.converttoInt();
                 sb.append(key.charAt(a));
                 
            }
            
            return sb.toString();
        }
}
