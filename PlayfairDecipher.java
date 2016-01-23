
import java.lang.String;
import static java.lang.System.out;
import java.util.*;
public class PlayfairDecipher
{String test;
    char[][] ky=new char[5][5];
    char[] ptext;
    String ctext;
    
    PlayfairDecipher(char key[][],String text)
    {
        ky=key;
        test=text.toUpperCase();
    
        ptext=text.toUpperCase().toCharArray();
      
    }
    
    
    public int Estimate()
    {
    int al=ptext.length;
    for(int i=0;i<ptext.length-1;i++)
    {
        if(ptext[i]==ptext[i+1])
        {
            al=al+1;
        }
            }
    if(al%2!=0)
        al=al+1;
       return al;
    }
            
    
    
    public char[] PlayfairDecrypt()
    {      
        char op1;
        char op2;
        int al=ptext.length;
        
      
 
StringBuilder sb=new StringBuilder();
sb.append(test);

for(int i=0;i<al-1;i++)
{    
   if(sb.charAt(i)==sb.charAt(i+1))
    {
        sb.insert(i+1,'X');
    }
   
 }



if(sb.length()%2!=0)
    sb.insert(sb.length(),'X');



    
        /////////////////////////////////////////////////////////////////////////////////////////
            
int a=0;
    char[] ch=new char[sb.length()];
 
for(int i=0;i<sb.length();i=i+2)
    {
          FindLocation f1=new FindLocation(ky);
            f1.FindIJ(sb.charAt(i));
            int x1=f1.getI();
            int y1=f1.getJ();
            f1.FindIJ(sb.charAt(i+1));
            int x2=f1.getI();
            int y2=f1.getJ();
             int finx1;
            int finy1 = 0;
            int finx2;
            int finy2;
            
            if(y1==y2)
            {
              //  if(x1==0)
                //    finx1=(1-x1)%5;
                //else
                    finx1=(x1-1+5)%5;
                
                //if(x2==0)
                  //  finx2=(1-x2)%5;
                //else
               finx2=(x2-1+5)%5;
                               
               finy1=y1;
               finy2=y2;
            }
            else if(x1==x2)
            {
               //if(y1==0)
                 //  finy1=(1-y1)%5;
                   //else
                finy1=(y1-1+5)%5;
               
               //if(y2==0)
                 //  finy2=(1-y2)%5;
               //else
               finy2=(y2-1+5)%5;
               
               finx1=x1;
               finx2=x2;
            }
            else
            {
                finy1=y2;
                finx1=x1;
                finx2=x2;
                finy2=y1;
            }
         op1=ky[finx1][finy1];
         op2=ky[finx2][finy2];
         
         ch[a]=op1;
         ch[a+1]=op2;
         System.out.println(op1);
         System.out.println(op2);
         a=a+2;
        }

     
        return ch;
 
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
