

public class PlayfairKey {
    char matrix[][]=new char[5][5];
    int sb=0;
    
    PlayfairKey(String t0,String t1,String t2,String t3,String t4,String t5,String t6,String t7,String t8,String t9,String t10,String t11,String t12,String t13,String t14,String t15,String t16,String t17,String t18,String t19,String t20,String t21,String t22,String t23,String t24)
    {     
  
           Validate c=new Validate();
           
           if(c.checkCharKey(t0)==99)
               matrix[0][0]=t0.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t1)==99)
               matrix[0][1]=t1.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t2)==99)
               matrix[0][2]=t2.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t3)==99)
               matrix[0][3]=t3.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t4)==99)
               matrix[0][4]=t4.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t5)==99)
               matrix[1][0]=t5.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t6)==99)
               matrix[1][1]=t6.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t7)==99)
               matrix[1][2]=t7.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t8)==99)
               matrix[1][3]=t8.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t9)==99)
               matrix[1][4]=t9.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t10)==99)
               matrix[2][0]=t10.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t11)==99)
               matrix[2][1]=t11.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t12)==99)
               matrix[2][2]=t12.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t13)==99)
               matrix[2][3]=t13.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t14)==99)
               matrix[2][4]=t14.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t15)==99)
               matrix[3][0]=t15.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t16)==99)
               matrix[3][1]=t16.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t17)==99)
               matrix[3][2]=t17.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t18)==99)
               matrix[3][3]=t18.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t19)==99)
               matrix[3][4]=t19.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t20)==99)
               matrix[4][0]=t20.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t21)==99)
               matrix[4][1]=t21.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t22)==99)
               matrix[4][2]=t22.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t23)==99)
               matrix[4][3]=t23.charAt(0);
           else
               sb=sb+1;
           
           if(c.checkCharKey(t24)==99)
               matrix[4][4]=t24.charAt(0);
           else
               sb=sb+1;
           
           for(int i=0;i<5;i++)
           {
               for(int j=0;j<5;j++)
               {
                   System.out.println(matrix[i][j]);
               }
           }
    }
        

    public int getError()
    {
       return sb;
    }
    
    public char[][] geMatrix()
    {
        return matrix;
    }
}
