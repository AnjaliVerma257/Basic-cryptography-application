
import java.util.*;
public class Conversion {
    int ip;
    char ipi;
    char op;
    int opi;
public Conversion(int a)
{
    ip=a;
}
public Conversion(char b)
{
   ipi=b;
}
public char converttoChar()
{
if(ip==0)
    op='A';
else if(ip==1)
    op='B';
else if(ip==2)
    op='C';
else if(ip==3)
    op='D';
else if(ip==4)
    op='E';
else if(ip==5)
    op='F';
else if(ip==6)
    op='G';
else if(ip==7)
    op='H';
else if(ip==8)
    op='I';
else if(ip==9)
    op='J';
else if(ip==10)
    op='K';
else if(ip==11)
    op='L';
else if(ip==12)
    op='M';
else if(ip==13)
    op='N';
else if(ip==14)
    op='O';
else if(ip==15)
    op='P';
else if(ip==16)
    op='Q';
else if(ip==17)
    op='R';
else if(ip==18)
    op='S';
else if(ip==19)
    op='T';
else if(ip==20)
    op='U';
else if(ip==21)
    op='V';
else if(ip==22)
    op='W';
else if(ip==23)
    op='X';
else if(ip==24)
    op='Y';
else if(ip==25)
    op='Z';
else{}
return op;
}

public int converttoInt()
{
    if(ipi=='A' | ipi=='a')
        opi=0;
    else if(ipi=='B' | ipi=='b')
        opi=1;
    else if(ipi=='C' | ipi=='c')
        opi=2;
    else if(ipi=='D' | ipi=='d')
        opi=3;
    else if(ipi=='E' | ipi=='e')
        opi=4;
    else if(ipi=='F' | ipi=='f')
        opi=5;
    else if(ipi=='G' | ipi=='g')
        opi=6;
    else if(ipi=='H' | ipi=='h')
        opi=7;
    else if(ipi=='I' | ipi=='i')
        opi=8;
    else if(ipi=='J' | ipi=='j')
        opi=9;
    else if(ipi=='K' | ipi=='k')
        opi=10;
    else if(ipi=='L' | ipi=='l')
        opi=11;
    else if(ipi=='M' | ipi=='m')
        opi=12;
    else if(ipi=='N' | ipi=='n')
        opi=13;
    else if(ipi=='O' | ipi=='o')
        opi=14;
    else if(ipi=='P' | ipi=='p')
        opi=15;
    else if(ipi=='Q' | ipi=='q')
        opi=16;
    else if(ipi=='R' | ipi=='r')
        opi=17;
    else if(ipi=='S' | ipi=='s')
        opi=18;
    else if(ipi=='T' | ipi=='t')
        opi=19;
    else if(ipi=='U' | ipi=='u')
        opi=20;
    else if(ipi=='V' | ipi=='v')
        opi=21;
    else if(ipi=='W' | ipi=='w')
        opi=22;
    else if(ipi=='X' | ipi=='x')
        opi=23;
    else if(ipi=='Y' | ipi=='y')
        opi=24;
    else if(ipi=='Z' | ipi=='z')
        opi=25;
    else{}
    
    
 
    return opi;
}
}
