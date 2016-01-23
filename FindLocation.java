
public class FindLocation {
    char[][] search=new char[5][5];
    int numi;
    int numj;
FindLocation(char[][] matrix)
{
    search=matrix;
}

public void FindIJ(char ip)
{
    int i=0;
    int j=0;
    for(i=0;i<=4;i++)
    {
        for(j=0;j<=4;j++)
        {
            if (search[i][j]==ip)
            {
            numi=i;
            numj=j;
            }
            
        }
    }
   
    
}
public int getI()
{
    return numi;
}
public int getJ()
{
    return numj;
}
}

