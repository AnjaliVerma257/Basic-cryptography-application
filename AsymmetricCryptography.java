import java.math.BigInteger;

public class AsymmetricCryptography
{
    int p;
    int q;
    int n;
    int fn;
    int publicKey;
    int privateKey;
    public void setN(int no)
    {
        n=no;
    }
    
    public void setPublicKey(int ky)
    {
        publicKey=ky;
    }
    
    public void setPrivateKey(int ky)
    {
        privateKey=ky;
    }
            
    AsymmetricCryptography()
    {
        
    }
    AsymmetricCryptography(int a, int b)
    {
        p=a;
        q=b;
        n=p*q;
        fn=(p-1)*(q-1);
    }    
    public String range()
    {
        return ("Choose a public key in the range  :  0 to"+ fn);
    }    
    public void chooseKey(int x)
    {
        publicKey=x;
        int mui=0;
        for(int i=1;i<=fn;i++)
        {
            if((i*publicKey)%fn==1)
            {
                mui=i;
                break;
            }
        }
        publicKey=x;
        privateKey=mui;
       
    }    
    public int getPrivateKey()
       {
           System.out.println(privateKey);
        return privateKey;
        }        
    public int getPublicKey()
    {
        return publicKey;
        }        
    public int getn()
        {
        return n;
        }
    public BigInteger expoEncrypt(BigInteger n)
   {
        BigInteger x=n;
        BigInteger y=BigInteger.ONE;
        
       for(int i=0;i<publicKey;i++)
       {
           y=y.multiply(x);
       }
       
       return y;
    }    
    public BigInteger expoDecrypt(BigInteger n)
   {
       BigInteger y=BigInteger.ONE;
       BigInteger xy=n;
       for(int i=0;i<privateKey;i++)
       {
           y=xy.multiply(y);
       }
       
       return y;
    }   
    public BigInteger Encrypt(BigInteger input)
    {
            Conversion c;
            BigInteger temp=input;       
            StringBuilder output=new StringBuilder();          
            BigInteger l=(expoEncrypt(temp)).mod(BigInteger.valueOf(n));
          
            return l;
        }        
    public BigInteger convertToBig(String s)
    {
        String a=s;
        Conversion c;
        BigInteger b=BigInteger.ZERO;
        for(int i=0;i<a.length();i++)
        {
            c=new Conversion(a.charAt(i));
            if(c.converttoInt()>9)
                b=(b.multiply(BigInteger.valueOf(100))).add(BigInteger.valueOf(c.converttoInt()));
            else
             b=(b.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(c.converttoInt()));
            
        }
        return b;
    }       
    public BigInteger Decrypt(BigInteger input)
    {
            
            BigInteger temp=input;         
           
         BigInteger l=expoDecrypt(temp).mod(BigInteger.valueOf(n));
           
                              
            return l;
        }
    
    
    
    
  
}
