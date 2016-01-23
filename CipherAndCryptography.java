
import java.applet.*;
import java.awt.*;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import javax.swing.GroupLayout;
import sun.awt.VerticalBagLayout;
/* <applet code = "CipherAndCryptography" width = 500 height = 500> </applet> */

public class CipherAndCryptography extends Applet  implements ActionListener, AdjustmentListener
{
    ///////////////////////////////////////CLIPBOARD////////////////////////////////////////////////
    Panel clipBoard=new Panel();
    Button bclear=new Button("Clear Clipboard");
    TextArea tclip=new TextArea();
    /////////////////////////////////MAIN PANEL//////////////////////////////////////////////////////
    Panel mPanel=new Panel();
    
    ////////////////////////////////////////////////UNIVERSAL PANEL//////////////////////////////////
    Panel universalPanel=new Panel();
    Button home=new Button("Home");
    Button clipboard=new Button("Clipboard");
    Label project=new Label("Cipher Texts and Cryptography");
    
    
    ///////////////////////////////////////////INTITIAL OPTIONS//////////////////////////////////////////
     Panel initialOptions=new Panel();
        Button cip=new Button("Encryption / Decryption");
        Button cry=new Button("Cryptography");
    ///////////////////////////////FONTS////////////////////////////////////////
    Font labelFontLEFT=new Font("Times New Roman",Font.HANGING_BASELINE, 12);
    Font labelFontRIGHT=new Font("Times New Roman",Font.HANGING_BASELINE, 17);
    Font labelFont=new Font("Times New Roman",Font.HANGING_BASELINE, 20);
    

    
    //////////////////////////////////////////////CRYPT///////////////////////////////////////
    
    Panel crypt=new Panel();
    Button generateKeysRSA1=new Button("Generate Keys");
    Button rsaEncrypt=new Button("Encrypt Using RSA Algorithm");
    Button rsaDecrypt=new Button("Decrypt Using RSA Algorithm");
    
 

       /////////////////////////////////////////RSA KEY PANEL///////////////////////////////////////////////
    Panel rsaKeyPanel=new Panel();
    TextField p=new TextField();
TextField q=new TextField();
TextField publicKeyrsa=new TextField();
TextField privateKeyrsa=new TextField();
TextField modulus=new TextField();
Button clearFieldsRSAkey=new Button("Clear");
Label errorSpaceRSA=new Label("");
    //////////////////////////////////////////////////RSA ENCRYPT PANEL/////////////////////////////////////////////////////////////
    Panel rsaEncryptPanel=new Panel();
    Label publicKeyrsaEL=new Label(" Public Key: ");
TextField publicKeyrsaE=new TextField();
Label modulusEL=new Label("Modulus for Encryption :");    
TextField modulusE=new TextField();
Label inputLabelE=new Label("Plaintext :");
Label outputLabelE=new Label("Cipher Text :");
TextArea inputRSAEncryption=new TextArea();

TextArea outputRSAEncryption=new TextArea();
Button generateRSAEncrypt=new Button("Encrypt Text");
Button clearFieldsRSAkeyE=new Button("Clear");
Button resetRsaKeyE=new Button("Reset");
Button copyToRSAE=new Button("Copy To Clipboard");
Button copyFromRSAE=new Button("Copy From Clipboard");

Button generateRSADecrypt=new Button("Decrypt Text");
Label spaceRSAE=new Label("");
Label errorSpaceRSAE=new Label("");
        //////////////////////////////////////////////////RSA DECRYPT PANEL/////////////////////////////////////////////////////////////
    Panel rsaDecryptPanel=new Panel();
TextField privateKeyrsaD=new TextField();
TextField modulusD=new TextField();
TextArea inputRSADecryption=new TextArea();

TextArea outputRSADecryption=new TextArea();    
Label errorSpaceRSAD=new Label("");
    
    ///////////////////////////////CIPHER VARIABLES////////////////////////////////////////////////////
    Panel cipher=new Panel();
    
    int copt=0;
    int ctech=0;
    
    
    
    
    Button generate=new Button("Generate Output");
    Button clearFields=new Button("Clear Field");
    Button reset=new Button("Reset");
    Button copyToClip=new Button("Copy To ClipBoard");
    Button copyFromClip=new Button("Copy From ClipBoard");
    
    
    
    
    Label lForList=new Label("Select A Technique :");
    Label lstL=new Label("Encipher / Decipher :");
     List lst = new List(2, false);
     final List cipherOptions = new List(4, false);
    final TextField MultiKey=new TextField();
           TextField AddKey=new TextField();
          
            final Label MultiKeyLabel=new Label("Enter Multiplicative key :");
          
           Label AddKeyLabel=new Label("Enter Additive key :"); 
      final Button b1=new Button();
      final Label matrix=new Label("Enter key :");
      final Label num=new Label("Enter key (number and <26) :");
     final Label str=new Label("Enter key (string) :");
     final TextField numKey=new TextField();
    
     final TextField stringKey=new TextField();
     final TextArea opt=new TextArea();
    
      final TextField t0=new TextField();
          final Label input=new Label("Input :");
     final Label output=new Label("Output :");
     final TextArea ipt=new TextArea();
     final TextField t1=new TextField();
     final TextField t2=new TextField();
     final TextField t3=new TextField();
     final TextField t4=new TextField();
     final TextField t5=new TextField();
     final TextField t6=new TextField();
     final TextField t7=new TextField();
     final TextField t8=new TextField();
     final TextField t9=new TextField();
     final TextField t10=new TextField();
     final TextField t11=new TextField();
     final TextField t12=new TextField();
     final TextField t13=new TextField();
     final TextField t14=new TextField();
     final TextField t15=new TextField();
     final TextField t16=new TextField();
     final TextField t17=new TextField();
     final TextField t18=new TextField();
     final TextField t19=new TextField();
     final TextField t20=new TextField();
     final TextField t21=new TextField();
     final TextField t22=new TextField();
     final TextField t23=new TextField();
     final TextField t24=new TextField();
     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void init()
{
    rsaKeyPanel.hide();
    rsaEncryptPanel.hide();
    rsaDecryptPanel.hide();
   
   
    cipherHide();
    Color bg=new Color(176,226,255);
    Color buttonColor=new Color(193,255,193);
    setBackground(bg);
    LayoutManager lm1=new VerticalBagLayout();
    
    stop();
    ///////////////////////////////////MAIN PANEL/////////////////////////////////////////////////
    
   mPanel.setLayout(lm1);
    //////////////////////////////////////////////UNIVERSAL PANEL//////////////////////
//   universalPanel.setBorder();
    universalPanel.setSize(700, 700);
    Font f1=new Font("Times New Roman",Font.CENTER_BASELINE, 18);
   
    home.setFont(f1);
    home.setBackground(bg);
    
    clipboard.setBackground(bg);
   clipboard.setFont(f1);
    
    universalPanel.add(home);
    universalPanel.add(new Label("                                                                                                  "));
    project.setFont(labelFont);
    universalPanel.add(project);
    universalPanel.add(new Label("                                                                                         "));
    universalPanel.add(clipboard);
    clipboard.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     clipBoard.show();
     crypt.hide();
     cipher.hide();
     rsaDecryptPanel.hide();
     rsaEncryptPanel.hide();
     initialOptions.hide();
     rsaKeyPanel.hide();
     validate();
   
        }
    });

    home.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     clipBoard.hide();
     crypt.hide();
     cipher.hide();
     rsaDecryptPanel.hide();
     rsaEncryptPanel.hide();
     initialOptions.show();
     rsaKeyPanel.hide();
     validate();
   
        }
    });

    /////////////////////////////////////////////INITIAL OPTIONS/////////////////////////////////////////////////
    

initialOptions.setLayout(lm1);
    mPanel.setSize(700, 700);

cipher.hide();

crypt.hide();
clipBoard.hide();

cip.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
    cipher.show();
    initialOptions.hide();
    validate();
            //initialOptions.hide();
    
    
    
            
            
            
        }
    });
cry.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
    crypt.show();
    initialOptions.hide();
    validate();
          
        }
    });
    
    
    
    
    
    
    
    
    
    
    
    cip.setBackground(bg);
    cry.setBackground(bg);
            
    cry.setFont(labelFont);
    cip.setFont(labelFont);
    initialOptions.add(cip);
    initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));
    
    
    
    
    initialOptions.add(cry);
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
    initialOptions.add(new  Label(" "));initialOptions.add(new  Label(" "));
            
    Label declaration=new Label("                                                          Project By       :    Anjali Verma                                                                    ");
    declaration.setFont(f1);
    initialOptions.add(declaration);
    
    /////////////////////////////////////////////CRYPT////////////////////////////////////////////////
    
    
        
       
       crypt.setLayout(lm1);
        
       
    
    setBackground(bg);
    //LayoutManager lm1=new VerticalBagLayout();
    Label rsa=new Label("                                                                     Asymmetric Key Cryptography Using RSA Cryptosystem");
    
    
      Font labelFontLEFT=new Font("Times New Roman",Font.HANGING_BASELINE, 12);
    Font labelFont=new Font("Times New Roman",Font.HANGING_BASELINE, 20);
    rsa.setBackground(bg);
  
    rsa.setFont(labelFont);
    
  generateKeysRSA1.setFont(labelFontRIGHT);
  generateKeysRSA1.setBackground(bg);
  
  rsaDecrypt.setBackground(bg);
  rsaEncrypt.setBackground(bg);
 
  
 
  rsaDecrypt.setFont(labelFontRIGHT);
  rsaEncrypt.setFont(labelFontRIGHT);
 
 
  
 
    crypt.add(rsa);
    
    crypt.add(new  Label(" "));
    crypt.add(new  Label(" "));
    crypt.add(generateKeysRSA1);
    crypt.add(rsaEncrypt);
    crypt.add(rsaDecrypt);
    crypt.add(new  Label(" "));crypt.add(new  Label(" "));
    crypt.add(new  Label(" "));crypt.add(new  Label(" "));
    crypt.add(new  Label(" "));crypt.add(new  Label(" "));
    
    
    
    crypt.add(new  Label(" "));crypt.add(new  Label(" "));
 
 
          
        /////////////////////////////////////////RSA KEY PANEL///////////////////////////////////////////////
Label pL=new Label("'p'   : Pick a Prime Number");    

Label qL=new Label("'q'   : Pick a Prime Number");    

Label publicKeyrsaL=new Label(" Public Key: 1<=Prime number<(p-1)(q-1)");

Label privateKeyrsaL=new Label(" Private Key: ");

Label modulusL=new Label("Modulus for Encryption or Decryption :");    

Button generateRSA=new Button(" Generate Private Key & Modulus");
generateRSA.setFont(labelFontLEFT);

clearFieldsRSAkey.setFont(labelFontLEFT);
Button resetRsaKey=new Button("Reset");
resetRsaKey.setFont(labelFontLEFT);
Button key1=new Button("Encrypt Text");
key1.setFont(labelFontLEFT);

errorSpaceRSA.setForeground(Color.RED);
Label spaceRSA=new Label("");
spaceRSA.setFont(new Font(null, Font.BOLD, 160));
Label spaceRSAK=new Label("");
spaceRSAK.setFont(new Font(null, Font.BOLD, 160));





    GroupLayout rsaKeyLayout=new GroupLayout(rsaKeyPanel);
     rsaKeyPanel.setLayout(rsaKeyLayout);     
      rsaKeyLayout.setAutoCreateGaps(true);
      rsaKeyLayout.setAutoCreateContainerGaps(true);
      
      GroupLayout.SequentialGroup hGroupKK = rsaKeyLayout.createSequentialGroup();
GroupLayout.SequentialGroup vGroupKK = rsaKeyLayout.createSequentialGroup();
     

GroupLayout.SequentialGroup hGroupKK1 = rsaKeyLayout.createSequentialGroup();
GroupLayout.SequentialGroup vGroupKK1 = rsaKeyLayout.createSequentialGroup();
 hGroupKK1.addGroup(rsaKeyLayout.createParallelGroup().
            addComponent(generateRSA));
          hGroupKK1.addGroup(rsaKeyLayout.createParallelGroup().
            addComponent(clearFieldsRSAkey));
                   hGroupKK1.addGroup(rsaKeyLayout.createParallelGroup().
            addComponent(resetRsaKey));
                   
                   
                    vGroupKK1.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(generateRSA).addComponent(clearFieldsRSAkey).addComponent(resetRsaKey));

   hGroupKK.addGroup(rsaKeyLayout.createParallelGroup().
            addComponent(pL)
           .addComponent(qL)
           .addComponent(publicKeyrsaL)
           .addComponent(privateKeyrsaL)
                 .addComponent(modulusL)
           
           
           );
   hGroupKK.addGroup(rsaKeyLayout.createParallelGroup().
            addComponent(p)
           .addComponent(q)          
           .addComponent(publicKeyrsa)
           .addComponent(privateKeyrsa)
           .addComponent(modulus)
           .addGroup(hGroupKK1)
   .addComponent(key1)
           
   .addComponent(errorSpaceRSA));
   


   
   vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(pL).addComponent(p));
   vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(qL).addComponent(q));
   
     vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(publicKeyrsaL).addComponent(publicKeyrsa));
       vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
     addComponent(privateKeyrsaL).addComponent(privateKeyrsa));
    vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
    addComponent(modulusL).addComponent(modulus));
    vGroupKK.addGap(30);
    vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGroup(vGroupKK1));
    
     vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
    addComponent(key1,30,30,30));
     
    vGroupKK.addGroup(rsaKeyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
    addComponent(errorSpaceRSA)); 
    
   
   rsaKeyLayout.setHorizontalGroup(hGroupKK);
   rsaKeyLayout.setVerticalGroup(vGroupKK);
   
privateKeyrsa.setEnabled(false);

modulus.setEnabled(false);
generateRSA.addActionListener(new ActionListener() {

        @Override
        
        public void actionPerformed(ActionEvent e) {
            
            errorSpaceRSA.setText(" ");            
            Validate v1=new Validate();
            
      if(!p.getText().isEmpty() & !q.getText().isEmpty() & !publicKeyrsa.getText().isEmpty())
      {
         
            String pk=p.getText();
            String qk=q.getText();
            String puk=publicKeyrsa.getText();
      pk=pk.replaceAll(" ", "");
      qk=qk.replaceAll(" ","");
      puk=puk.replaceAll(" ","");
       String a=String.valueOf(v1.getNum(pk));
            String b=String.valueOf(v1.getNum(qk));
            String c=String.valueOf(v1.getNum(puk));
          
            Validate v=new Validate();
           
     if((v.checkNumPrime(a))==99)
     {             if(v.checkNumPrime(b)==99)
                                {
                 if((v.checkNumPrime(c)==99))
            {
          int pk1=Integer.parseInt(a);
            int qk1=Integer.parseInt(b);
            int puk1=Integer.parseInt(c);
     AsymmetricCryptography ac=new AsymmetricCryptography(pk1,qk1);
           
           ac.chooseKey(puk1);
           String prk=String.valueOf(ac.getPrivateKey());
            String ay=(String.valueOf(ac.getn()));
        
     modulus.setText(ay);
     
     privateKeyrsa.setText(prk);
     errorSpaceRSA.setText(" ");
             }
             else
             { 
                 errorSpaceRSA.setText(" Public Key is invalid");
             }
                                }
     
             else
             {
                    errorSpaceRSA.setText("'q' is invalid");
             }    
     }
    else
         {
                 modulus.setText(" ");
                 privateKeyrsa.setText(" ");
                    errorSpaceRSA.setText("'p' is invalid");
                     }
      }
        
      else
          errorSpaceRSA.setText(" Fields cannot be left Blank");
        
     validate();
        
     
     
     
     
    }});
resetRsaKey.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            privateKeyrsa.setEnabled(false);
            modulus.setEnabled(false);
        p.setText(" ");
            q.setText(" ");
            q.setText(" ");
            publicKeyrsa.setText(" ");
            privateKeyrsa.setText(" ");
modulus.setText(" ");
validate();
        }
    });
clearFieldsRSAkey.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            p.setText(" ");
            q.setText(" ");
            q.setText(" ");
            publicKeyrsa.setText(" ");
            privateKeyrsa.setText(" ");
modulus.setText(" ");
validate();
            
        }
    });
key1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     rsaKeyPanel.hide();
     rsaEncryptPanel.show();
     validate();
        }
    });

    //////////////////////////////////////////////////RSA ENCRYPT PANEL/////////////////////////////////////////////////////////////


errorSpaceRSAE.setForeground(Color.RED);

publicKeyrsaEL.setFont(labelFontLEFT);
modulusEL.setFont(labelFontLEFT);
inputLabelE.setFont(labelFontLEFT);
outputLabelE.setFont(labelFontLEFT);
generateRSAEncrypt.setFont(labelFontLEFT);
clearFieldsRSAkeyE.setFont(labelFontLEFT);
resetRsaKeyE.setFont(labelFontLEFT);
copyToRSAE.setFont(labelFontLEFT);
copyFromRSAE.setFont(labelFontLEFT);
errorSpaceRSAE.setFont(labelFontLEFT);

generateRSADecrypt.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     rsaEncryptPanel.hide();
     rsaDecryptPanel.show();
     validate();
        }
    });

generateRSAEncrypt.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            errorSpaceRSAE.setText(" ");
            StringBuilder sb=new StringBuilder();
            Validate v=new Validate();
            String n=publicKeyrsaE.getText();
            
            int pub=v.getNum(n);
          int mod=v.getNum(modulusE.getText());
          String text1=inputRSAEncryption.getText();
          text1=text1.replaceAll(" ", "");
          text1=v.getString(text1);
         
          
            AsymmetricCryptography ac=new AsymmetricCryptography();
            if(pub!=0 & mod!=0 & !text1.isEmpty())
            {
                String a= String.valueOf(pub);
                String b=String.valueOf(mod);
                  if(v.checkNumPrime(a)==99)
             {
                 if(v.checkNum(a)==99)
                 {
                int p=pub;
                int m=mod;
                for(int i=0;i<text1.length();i++)
                {
                    String lol=String.valueOf(text1.charAt(i));
                BigInteger input=v.convertToBig(lol);
             ac.setN(m);
             ac.setPublicKey(p);
             
             BigInteger y=ac.Encrypt(input);
             int x=y.intValue();
            
          
          
            //String pw=String.valueOf(mod);
          
          
 sb.append(v.conv(x, mod));
                }
             outputRSAEncryption.setText(sb.toString());
                 }
                 else
                 {
                     errorSpaceRSAE.setText(" Modulus Entry Invalid ");
                 }
            }
          else
              errorSpaceRSAE.setText("Invalid Public Key");
            }
            else
            {
                errorSpaceRSAE.setText(" Fields Cannot Be Left Blank ");
                
            }
            validate();
        }
        
    });
clearFieldsRSAkeyE.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     publicKeyrsaE.setText(" ");
     modulusE.setText(" ");
     inputRSAEncryption.setText(" ");
     outputRSAEncryption.setText(" ");
        }
    });




spaceRSAE.setFont(new Font(null, Font.BOLD, 77));
GroupLayout rsaELayout=new GroupLayout(rsaEncryptPanel);
     rsaEncryptPanel.setLayout(rsaELayout);     
      rsaELayout.setAutoCreateGaps(true);
      rsaELayout.setAutoCreateContainerGaps(true);
      GroupLayout.SequentialGroup hGroupEK = rsaELayout.createSequentialGroup();
GroupLayout.SequentialGroup vGroupEK = rsaELayout.createSequentialGroup();
     

GroupLayout.SequentialGroup hGroupEK1 = rsaELayout.createSequentialGroup();
GroupLayout.SequentialGroup vGroupEK1 = rsaELayout.createSequentialGroup();

 hGroupEK1.addGroup(rsaELayout.createParallelGroup()
            .addComponent(generateRSAEncrypt));
 hGroupEK1.addGroup(rsaELayout.createParallelGroup()
           .addComponent(clearFieldsRSAkeyE));
 
                   
                   
   vGroupEK1.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(generateRSAEncrypt).addComponent(clearFieldsRSAkeyE));

   
hGroupEK.addGroup(rsaELayout.createParallelGroup().
            addComponent(publicKeyrsaEL)
           .addComponent(modulusEL)
           .addComponent(inputLabelE)
           .addComponent(outputLabelE)
                 
           
           );
   hGroupEK.addGroup(rsaELayout.createParallelGroup().
            addComponent(publicKeyrsaE)
           .addComponent(modulusE)          
           .addComponent(inputRSAEncryption)
           .addComponent(outputRSAEncryption)
           
           .addGroup(hGroupEK1)        
           .addComponent(generateRSADecrypt)
           .addGap(30)
           .addComponent(errorSpaceRSAE)
   
   );
   hGroupEK.addGroup(rsaELayout.createParallelGroup().addComponent(copyFromRSAE,140, 140,140).addComponent(copyToRSAE,140, 140,140));


   
   vGroupEK.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(publicKeyrsaEL).addComponent(publicKeyrsaE));
   vGroupEK.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(modulusEL).addComponent(modulusE));
   
     vGroupEK.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(inputLabelE).addComponent(inputRSAEncryption,100,100,100).addComponent(copyFromRSAE,40,40,40));
     
       vGroupEK.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
     addComponent(outputLabelE).addComponent(outputRSAEncryption,100,100,100).addComponent(copyToRSAE,40,40,40));
    vGroupEK.addGap(50);
     
    vGroupEK.addGroup(vGroupEK1);
    vGroupEK.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(generateRSADecrypt));
    vGroupEK.addGroup(rsaELayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(errorSpaceRSAE));
    
    
   rsaELayout.setHorizontalGroup(hGroupEK);
   rsaELayout.setVerticalGroup(vGroupEK);


        //////////////////////////////////////////////////RSA DECRYPT PANEL/////////////////////////////////////////////////////////////
    


Label modulusDL=new Label("Modulus for Encryption :");    
Label privateKeyrsaDL=new Label(" Private Key: ");
Label inputLabel=new Label("Cipher Text :");
Label outputLabel=new Label("Plain Text :");

modulus.setFont(labelFontLEFT);
privateKeyrsaDL.setFont(labelFontLEFT);
inputLabel.setFont(labelFontLEFT);
outputLabel.setFont(labelFontLEFT);
Button generateRSADecrypt=new Button("Decrypt Text");
generateRSADecrypt.setFont(labelFontLEFT);
Button clearFieldsRSAkeyD=new Button("Clear");
clearFieldsRSAkeyD.setFont(labelFontLEFT);
Button copyToRSAD=new Button("Copy To Clipboard");
copyToRSAD.setFont(labelFontLEFT);
Button copyFromRSAD=new Button("Copy From Clipboard");
copyFromRSAD.setFont(labelFontLEFT);

errorSpaceRSAD.setForeground(Color.RED);
errorSpaceRSAD.setFont(labelFontLEFT);
clearFieldsRSAkeyD.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     privateKeyrsaD.setText(" ");
     modulusD.setText(" ");
     inputRSADecryption.setText(" ");
     outputRSADecryption.setText(" ");
        }
    });
generateRSADecrypt.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     errorSpaceRSAD.setText(" ");
            StringBuilder sb=new StringBuilder();
            Validate v=new Validate();
            String n=privateKeyrsaD.getText();
            
            int pub=v.getNum(n);
          int mod=v.getNum(modulusD.getText());
          String text1=inputRSADecryption.getText();
          text1=text1.replaceAll(" ", "");
          text1=String.valueOf(v.getNum(text1));
          System.out.println(text1);
         
          
          
            AsymmetricCryptography ac=new AsymmetricCryptography();
            if(pub!=0 & mod!=0 & !text1.isEmpty())
            {
                String a= String.valueOf(pub);
                String b=String.valueOf(mod);
                  if(v.checkNumPrime(a)==99)
             {
                 if(v.checkNum(a)==99)
                 {
                int p=pub;
                int m=mod;
               int ab[]=v.div(text1, mod);
               System.out.println(ab.toString());
                for(int i=0;i<text1.length()/b.length();i++)
                {
                   BigInteger lol=BigInteger.valueOf(ab[i]);
                System.out.println(lol);
             ac.setN(m);
             ac.setPrivateKey(p);
             
             BigInteger y=ac.Decrypt(lol);
             Conversion c=new Conversion(y.intValue());
             char kj=c.converttoChar();
            
          
                
            
          
          
 sb.append(kj);
                }
             outputRSADecryption.setText(sb.toString());
                 }
                 else
                 {
                     errorSpaceRSAD.setText(" Modulus Entry Invalid ");
                 }
            }
          else
              errorSpaceRSAD.setText("Invalid Private Key");
            }
            else
            {
                errorSpaceRSAD.setText(" Fields Cannot Be Left Blank ");
                
            }
            validate();
      

        }
    });

GroupLayout rsaDLayout=new GroupLayout(rsaDecryptPanel);
     rsaDecryptPanel.setLayout(rsaDLayout);     
      rsaDLayout.setAutoCreateGaps(true);
      rsaDLayout.setAutoCreateContainerGaps(true);
      GroupLayout.SequentialGroup hGroupDK = rsaDLayout.createSequentialGroup();
GroupLayout.SequentialGroup vGroupDK = rsaDLayout.createSequentialGroup();
     

GroupLayout.SequentialGroup hGroupDK1 = rsaDLayout.createSequentialGroup();
GroupLayout.SequentialGroup vGroupDK1 = rsaDLayout.createSequentialGroup();

 hGroupDK1.addGroup(rsaDLayout.createParallelGroup()
            .addComponent(generateRSADecrypt));
 hGroupDK1.addGroup(rsaDLayout.createParallelGroup()
           .addComponent(clearFieldsRSAkeyD));

                   
                   
   vGroupDK1.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(generateRSADecrypt).addComponent(clearFieldsRSAkeyD));


hGroupDK.addGroup(rsaDLayout.createParallelGroup().
            addComponent(privateKeyrsaDL)
           .addComponent(modulusDL)
           .addComponent(outputLabel)
           .addComponent(inputLabel)
       
                 
           
           );
   hGroupDK.addGroup(rsaDLayout.createParallelGroup().
            addComponent(privateKeyrsaD)
           .addComponent(modulusD)          
           .addComponent(inputRSADecryption)
           .addComponent(outputRSADecryption)
           .addComponent(spaceRSA)
           .addGroup(hGroupDK1)        
           .addComponent(errorSpaceRSAD)
   
   );
   spaceRSA.setFont(new Font(null, Font.BOLD, 60));
      hGroupDK.addGroup(rsaDLayout.createParallelGroup().addComponent(copyFromRSAD,140, 140,140).addComponent(copyToRSAD,140, 140,140));


   
   vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(privateKeyrsaDL).addComponent(privateKeyrsaD));
   vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(modulusDL).addComponent(modulusD));
   
     vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.CENTER).
            addComponent(inputLabel).addComponent(inputRSADecryption,100,100,100).addComponent(copyFromRSAD,40,40,40));
     
       vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.CENTER).
     addComponent(outputLabel).addComponent(outputRSADecryption,100,100,100).addComponent(copyToRSAD,40,40,40));
    vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(spaceRSA));
    vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
.            addGroup(vGroupDK1));
    vGroupDK.addGroup(rsaDLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
 .addComponent(errorSpaceRSAD));
    
   rsaDLayout.setHorizontalGroup(hGroupDK);
   rsaDLayout.setVerticalGroup(vGroupDK);


    

    ///////////////////////////////////////////////CRYPTOGRAPHY ACTION LISTENER/////////////////////////////////////////////////////////////////
        generateKeysRSA1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            rsaKeyPanel.show();
            rsaEncryptPanel.hide();
            crypt.hide();
            rsaDecryptPanel.hide();
            validate();

        }
    });
        
        rsaEncrypt.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             rsaEncryptPanel.show();
             rsaKeyPanel.hide();
             rsaDecryptPanel.hide();
            crypt.hide();
            validate();

        }
    });
         rsaDecrypt.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             rsaDecryptPanel.show();
             rsaEncryptPanel.hide();
            crypt.hide();
validate();
        }
    });
        
   
    
    

         ////////////////////////////////////////////////////////////CLIPBOARD///////////////////////////////////////////////    
    
GroupLayout cLayout=new GroupLayout(clipBoard);
     clipBoard.setLayout(cLayout);     
      cLayout.setAutoCreateGaps(true);
      
      cLayout.setAutoCreateContainerGaps(true);
      GroupLayout.SequentialGroup hG = cLayout.createSequentialGroup();
GroupLayout.SequentialGroup vG = cLayout.createSequentialGroup();
     clipboard.setFont(f1);
clipboard.setBackground(bg);
bclear.setFont(labelFontLEFT);

 hG.addGroup(cLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
            .addComponent(tclip)
         .addGap(80)
           .addComponent(bclear,120, 120, 120));
 
                   
                   
   vG.addGroup(cLayout.createParallelGroup(GroupLayout.Alignment.CENTER).
            addComponent(tclip));
   vG.addGroup(cLayout.createParallelGroup(GroupLayout.Alignment.CENTER).
            addComponent(bclear,50,50,50));

   
   
   cLayout.setHorizontalGroup(hG);
   cLayout.setVerticalGroup(vG);
   bclear.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            tclip.setText(" ");
        }
    });

    
    /////////////////////////////////////   CIPHER///////////////////////////////////////
    
    
    //cipher.setLayout(lm1);
    final GroupLayout lm2=new GroupLayout(cipher);
     cipher.setLayout(lm2);
       //final GroupLayout lm2=new GroupLayout(cipher);
     //cipher.setLayout(lm2);
      lm2.setAutoCreateGaps(true);
      lm2.setAutoCreateContainerGaps(true);
      
     matrix.setFont(labelFont);
             num.setFont(labelFontLEFT);
             str.setFont(labelFontLEFT);
             
             
     lst.setSize(200,100);
     
     lst.add("Generate Cipher Text",0);
     lst.add("Decipher Code",1);
     
     lst.setFont(new Font("Times New Roman",Font.ITALIC, 14));
    
     
     
     lstL.setFont(labelFont);
     

     
     lForList.setFont(labelFont);
     
     
     cipherOptions.add("Caesar Cipher",0);
     cipherOptions.add("Additive Cipher",1);
     cipherOptions.add("Monoaplhabetic Substitution Cipher",2);
     cipherOptions.add("Multiplicative Cipher               (Only 1, 3, 5, 7, 9, 11, 15, 17, 19, 21 are valid Keys)",3);
     cipherOptions.add("Affine Cipher                       (Only 1, 3, 5, 7, 9, 11, 15, 17, 19, 21 are valid Multiplicative Keys)",4);
     cipherOptions.add("Autokey Cipher",5);
     cipherOptions.add("Playfair Cipher",6);     
     cipherOptions.add("Vigenere Cipher",7);
     
     
     b1.setLabel("  Proceed to Inputs  ");
     b1.setFont(labelFontLEFT);
     b1.setPreferredSize(new Dimension(40, 40));
     
     cipherOptions.setFont(new Font("Times New Roman",Font.ITALIC, 14));
     
     cipherOptions.setSize(500, 500);
    
     
        generate.setFont(new Font(null,Font.HANGING_BASELINE,16));
        clearFields.setFont(new Font(null,Font.HANGING_BASELINE,16));
        copyToClip.setFont(labelFontLEFT);
        copyFromClip.setFont(labelFontLEFT);
        reset.setFont(new Font(null,Font.HANGING_BASELINE,16));
  
           MultiKeyLabel.setFont(labelFontLEFT);
           AddKeyLabel.setFont(labelFontLEFT);
      
     b1.setSize(50,50);
     
     

     input.setFont(labelFont);
     output.setFont(labelFont);
     
   ///////////////////////////////////////////////LAYOUT - DO NOT TOUCH ----///////////////////////////////////////
     
     GroupLayout.SequentialGroup hGroup1 = lm2.createSequentialGroup();
     hGroup1.addGroup(lm2.createParallelGroup()
           .addComponent(t0,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t5,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t10,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t15,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t20,GroupLayout.Alignment.CENTER,20,20,20)).addGroup(lm2.createParallelGroup()
           .addComponent(t1,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t6,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t11,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t16,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t21,GroupLayout.Alignment.CENTER,20,20,20)).addGroup(lm2.createParallelGroup()
           .addComponent(t2,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t7,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t12,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t17,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t22,GroupLayout.Alignment.CENTER,20,20,20)).addGroup(lm2.createParallelGroup()
           .addComponent(t3,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t8,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t13,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t18,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t23,GroupLayout.Alignment.CENTER,20,20,20)).addGroup(lm2.createParallelGroup()
           .addComponent(t4,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t9,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t14,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t19,GroupLayout.Alignment.CENTER,20,20,20)
           .addComponent(t24,GroupLayout.Alignment.CENTER,20,20,20));
     
   GroupLayout.SequentialGroup vGroup1 = lm2.createSequentialGroup();
     vGroup1.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(t0,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t1,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t2,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t3,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t4,GroupLayout.Alignment.CENTER,20,20,20));
     vGroup1.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(t5,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t6,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t7,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t8,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t9,GroupLayout.Alignment.CENTER,20,20,20));
     vGroup1.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(t10,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t11,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t12,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t13,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t14,GroupLayout.Alignment.CENTER,20,20,20));
     vGroup1.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(t15,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t16,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t17,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t18,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t19,GroupLayout.Alignment.CENTER,20,20,20));
     vGroup1.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(t20,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t21,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t22,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t23,GroupLayout.Alignment.CENTER,20,20,20)
             .addComponent(t24,GroupLayout.Alignment.CENTER,20,20,20));
   
     GroupLayout.SequentialGroup hGroup2=lm2.createSequentialGroup();
     hGroup2.addGroup(
             lm2.createParallelGroup()
           .addComponent(numKey,GroupLayout.Alignment.CENTER,40,150,150).addComponent(num))
           .addGroup(lm2.createParallelGroup().addComponent(stringKey,GroupLayout.Alignment.CENTER,40,150,150).addComponent(str)).
                   addGroup(lm2.createParallelGroup().addComponent(AddKey,GroupLayout.Alignment.CENTER,40,150,150).addComponent(AddKeyLabel)).
                           addGroup(lm2.createParallelGroup().addComponent(MultiKey,GroupLayout.Alignment.CENTER,40,150,150).addComponent(MultiKeyLabel)).
                                    addGroup(hGroup1);
                                           
                                           
                           
     
     
     
     
     
     GroupLayout.SequentialGroup vGroup2 = lm2.createSequentialGroup();
     
     vGroup2.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(numKey,GroupLayout.Alignment.TRAILING,40,40,40).
             addComponent(stringKey,GroupLayout.Alignment.TRAILING,40,40,40).
             addComponent(AddKey,GroupLayout.Alignment.TRAILING,40,40,40).
             addComponent(MultiKey,GroupLayout.Alignment.TRAILING,40,40,40).
             addGroup(vGroup1));
     vGroup2.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(num).
             addComponent(str).
             addComponent(AddKeyLabel).
             addComponent(MultiKeyLabel)
             
             );
     
     
     
     
     
   GroupLayout.SequentialGroup hGroupn = lm2.createSequentialGroup();
     hGroupn.addGroup(lm2.createParallelGroup()
           .addComponent(generate)).addGroup(lm2.createParallelGroup()
           .addComponent(clearFields)).addGroup(lm2.createParallelGroup()
           .addComponent(reset)).addGroup(lm2.createParallelGroup());
       
     
    GroupLayout.SequentialGroup vGroupn = lm2.createSequentialGroup();
     vGroupn.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(generate)
             .addComponent(clearFields)
             
             .addComponent(reset)
            );
            
     
     
     Label space=new Label("");
  final Label error=new Label("");
     error.setForeground(Color.red);
     space.setFont(labelFont);
     GroupLayout.SequentialGroup hGroup = lm2.createSequentialGroup();
   hGroup.addGroup(lm2.createParallelGroup().
            addComponent(lstL)
           .addComponent(lForList)
           .addComponent(matrix)
           .addComponent(input)
                 .addComponent(output)
           );
   hGroup.addGroup(lm2.createParallelGroup().
            addComponent(lst)
           .addComponent(cipherOptions)          
           .addGroup(hGroup2)
           .addComponent(ipt,40, 350, 350)
           .addComponent(opt,40, 350, 350)
   .addComponent(output)
           .addComponent(space)
           .addGroup(hGroupn)
   .addComponent(error));
   hGroup.addGroup(lm2.createParallelGroup().addComponent(b1).addComponent(copyFromClip).addComponent(copyToClip));
   
   
   lm2.setHorizontalGroup(hGroup);
   
   GroupLayout.SequentialGroup vGroup = lm2.createSequentialGroup();
   
   vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(lstL).addComponent(lst));
   vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(lForList).addComponent(cipherOptions).addComponent(b1, GroupLayout.Alignment.CENTER,20,20,30));
   
     vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(matrix).addGroup(vGroup2));
       vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
     addComponent(input).addComponent(ipt,40, 40, 40).addComponent(copyFromClip));
    vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
    addComponent(output).addComponent(opt,40, 40, 40).addComponent(copyToClip));
    vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(space));
    vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addGroup(vGroupn));
   vGroup.addGroup(lm2.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(error));
      lm2.setVerticalGroup(vGroup);
      
    
cipher.add(error);
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           
     b1.addActionListener(new ActionListener() {

      @Override
        public void actionPerformed(ActionEvent e) {                 
            cipherOptions.setEnabled(false);
            lst.setEnabled(false);
            copt=lst.getSelectedIndex();
            if(lst.getSelectedIndex()==-1)
                copt=0;
           ctech=cipherOptions.getSelectedIndex();
           
           if(cipherOptions.getSelectedIndex()==-1)
               ctech=0;
      
            if(ctech==0)                     
                {
                    clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                    input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();    
                }
            else if(ctech==1)
            {
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                numKey.setEnabled(true);
                num.setEnabled(true);
                 input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();    
            }
            else if(ctech==2)
            {
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                str.setEnabled(true);
                stringKey.setEnabled(true);
                input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();
                
            }
            else if(ctech==3)
            {
                
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                MultiKey.setEnabled(true);
                MultiKeyLabel.setEnabled(true);
                input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();
            }
            else if(ctech==4)
            {
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                AddKey.setEnabled(true);
                num.setEnabled(true);
                MultiKey.setEnabled(true);
                MultiKeyLabel.setEnabled(true);
                input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();
            }
            else if(ctech==5)
            {
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                numKey.setEnabled(true);
                num.setEnabled(true);
                input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();
                
            }
            else if(ctech==6)
            {
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                matrix.setEnabled(true);
                    t0.setEnabled(true);
                    t1.setEnabled(true);
                    t2.setEnabled(true);
                    t3.setEnabled(true);
                    t4.setEnabled(true);
                    t5.setEnabled(true);
                    t6.setEnabled(true);
                    t7.setEnabled(true);
                    t8.setEnabled(true);
                    t9.setEnabled(true);
                    t10.setEnabled(true);
                    t11.setEnabled(true);
                    t12.setEnabled(true);
                    t13.setEnabled(true);
                    t14.setEnabled(true);
                    t15.setEnabled(true);
                    t16.setEnabled(true);
                    t17.setEnabled(true);
                    t18.setEnabled(true);
                    t19.setEnabled(true);
                    t20.setEnabled(true);
                    t21.setEnabled(true);
                    t22.setEnabled(true);
                    t23.setEnabled(true);
                    t24.setEnabled(true);
                    input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();
            }
            else if(ctech==7)
            {
                clearFields.setEnabled(true);
      copyToClip.setEnabled(true);
      copyFromClip.setEnabled(true);
      generate.setEnabled(true);
      reset.setEnabled(true);
                str.setEnabled(true);
                stringKey.setEnabled(true);
                input.setEnabled(true);
                    output.setEnabled(true);
                    ipt.setEnabled(true);
                    opt.setEnabled(true);
                    validate();
            }
        }
        
    });    
     reset.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     clear();     
    cipherHide();
     
        }
    });    
     clearFields.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     clear();     
    
     
        }
    });     
generate.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            
             String a=ipt.getText();
             a=a.replaceAll(" ", "");
             a=(new Validate()).getInput(a);
            
if(a.length()>0)
{
             if(copt==0 )
     {
         if(ctech==0 )
         {            
             if(a.length()>0)
             {
                
                CaesarCipher c=new CaesarCipher(a); 
                opt.setText(c.CaesarCip());
                error.setText("");
             }
             
         }
         else if(ctech==1)
         {
          String j=numKey.getText();
          j=j.replaceAll(" ", "");
          numKey.setText(j);
             int err=(new Validate()).checkNumKey(numKey.getText());
             if(err==99)
             {
             AdditiveCipher ac=new AdditiveCipher(Integer.parseInt(numKey.getText()),a);
             String l=ac.AdditiveCip();
          
             opt.setText(l);
             error.setText("");
             }
             else
                 error.setText("Invalid Key");
         }    
         else if(ctech==2)
         {
             String key=stringKey.getText();
             key=key.toUpperCase();
             key=key.replaceAll(" ", "");
             int err=(new Validate()).checkStringKey(key);
             
             if(err==99)
             {
                 MonoAlphabeticCipher mc=new MonoAlphabeticCipher(key, a);
                 opt.setText(mc.MonoAlphabeticCrypt().toUpperCase());
                 error.setText("");
             }
             else
                 error.setText("Invalid Key");
         }   
         else if(ctech==3)
         {
             String j=MultiKey.getText();
             j=j.replaceAll(" ", "");
             MultiKey.setText(j);
             int err=(new Validate()).checkNumKey(MultiKey.getText());
             if(err==99)
             {
             MuxCipher mux=new MuxCipher(Integer.parseInt(MultiKey.getText()),a);
             opt.setText((new Validate()).getInput(mux.MuxCrypt()));
             error.setText("");
             }
             else
                 error.setText("Invalid Key");
         }   
         else if(ctech==4)
         {
             String mkey=MultiKey.getText();
             String akey=AddKey.getText();
             mkey=mkey.replaceAll(" ", "");
             akey=akey.replaceAll(" ", "");
             MultiKey.setText(mkey);
             AddKey.setText(akey);
             int errm=(new Validate()).checkNumKey(mkey);
             int erra=(new Validate()).checkNumKey(akey);
             
             if(errm==99 && erra==99)
             {
                 AffineCipher ac=new AffineCipher(Integer.parseInt(mkey),Integer.parseInt(akey),a);
                 opt.setText((new Validate()).getInput(ac.AffineCrypt()));
                 error.setText("");
             }
             else if(errm!=99)
                 error.setText("Invalid Multiplicative Key");
             else if(erra!=99)
                 error.setText("Invalid Additive Key");
         }   
         else if(ctech==5)
         {
               String key=numKey.getText();
             key=key.replaceAll(" ", "");
             numKey.setText(key);
             
             
             int err=(new Validate()).checkNumKey(key);
             
             if(err==99)
             {
                 AutoKeyCipher ac=new AutoKeyCipher(Integer.parseInt(key),a);
                 opt.setText((new Validate()).getInput(ac.AutoKeyCrypt()));
                 error.setText("");
             }
             else 
                 error.setText("Invalid Key");
         }   
         else if(ctech==6)
         {
             String tb0=t0.getText().toUpperCase();
             tb0=tb0.replaceAll(" ", "");
             t0.setText(tb0);
             
             String tb1=t1.getText().toUpperCase();
             tb1=tb1.replaceAll(" ", "");
             t1.setText(tb1);
             
             String tb2=t2.getText().toUpperCase();
             tb2=tb2.replaceAll(" ", "");
             t2.setText(tb2);
             
             String tb3=t3.getText().toUpperCase();
             tb3=tb3.replaceAll(" ", "");
             t3.setText(tb3);
             
             String tb4=t4.getText().toUpperCase();
             tb4=tb4.replaceAll(" ", "");
             t4.setText(tb4);
             
             String tb5=t5.getText().toUpperCase();
             tb5=tb5.replaceAll(" ", "");
             t5.setText(tb5);
             
             String tb6=t6.getText().toUpperCase();
             tb6=tb6.replaceAll(" ", "");
             t6.setText(tb6);
             
             String tb7=t7.getText().toUpperCase();
             tb7=tb7.replaceAll(" ", "");
             t7.setText(tb7);
             
             String tb8=t8.getText().toUpperCase();
             tb8=tb8.replaceAll(" ", "");
             t8.setText(tb8);
             
             String tb9=t9.getText().toUpperCase();
             tb9=tb9.replaceAll(" ", "");
             t9.setText(tb9);
             
             String tb10=t10.getText().toUpperCase();
             tb10=tb10.replaceAll(" ", "");
             t10.setText(tb10);
             
             String tb11=t11.getText().toUpperCase();
             tb11=tb11.replaceAll(" ", "");
             t11.setText(tb11);
             
             String tb12=t12.getText().toUpperCase();
             tb12=tb12.replaceAll(" ", "");
             t12.setText(tb12);
             
             String tb13=t13.getText().toUpperCase();
             tb13=tb13.replaceAll(" ", "");
             t13.setText(tb13);
             
             String tb14=t14.getText().toUpperCase();
             tb14=tb14.replaceAll(" ", "");
             t14.setText(tb14);
             
             String tb15=t15.getText().toUpperCase();
             tb15=tb15.replaceAll(" ", "");
             t15.setText(tb15);
             
             String tb16=t16.getText().toUpperCase();
             tb16=tb16.replaceAll(" ", "");
             t16.setText(tb16);
             
             String tb17=t17.getText().toUpperCase();
             tb17=tb17.replaceAll(" ", "");
             t17.setText(tb17);
             
             String tb18=t18.getText().toUpperCase();
             tb18=tb18.replaceAll(" ", "");
             t18.setText(tb18);
             
             String tb19=t19.getText().toUpperCase();
             tb19=tb19.replaceAll(" ", "");
             t19.setText(tb19);
             
             String tb20=t20.getText().toUpperCase();
             tb20=tb20.replaceAll(" ", "");
             t20.setText(tb20);
             
             String tb21=t21.getText().toUpperCase();
             tb21=tb21.replaceAll(" ", "");
             t21.setText(tb21);
             
             String tb22=t22.getText().toUpperCase();
             tb22=tb22.replaceAll(" ", "");
             t22.setText(tb22);
             
             String tb23=t23.getText().toUpperCase();
             tb23=tb23.replaceAll(" ", "");
             t23.setText(tb23);
             
             String tb24=t24.getText().toUpperCase();
             tb24=tb24.replaceAll(" ", "");
             t24.setText(tb24);
             
             PlayfairKey p=new PlayfairKey(tb0,tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9,tb10,tb11,tb12,tb13,tb14,tb15,tb16,tb17,tb18,tb19,tb20,tb21,tb22,tb23,tb24);
int error1=p.getError();
char keyp[][];
keyp=p.geMatrix();

             if(error1==0)
             {
                 PlayfairCipher pc=new PlayfairCipher(keyp, a);
                 opt.setText((new Validate()).getInput(pc.PlayfairCrypt().toString()));
                 
             }
             else
                 error.setText(error1 + "Errors in Key Matrix");
             
         }   
         else if(ctech==7)
         {
             String key=stringKey.getText();
             key=key.replaceAll(" ", "");
             stringKey.setText(key);
             
             
             int keyf=(new Validate()).checkVigenereKey(key);
             
             if(keyf==99)
             {
                 VigenereCipher ac=new VigenereCipher(key,a);
                 opt.setText((new Validate()).getInput(ac.VigenereCrypt()));
                 error.setText("");
             }
             else 
                 error.setText("Invalid Key");
         }   
     }   
     else
     {
         if(ctech==0)
         {
             if(a.length()>0)
             {
                CaesarDecipher c=new CaesarDecipher(ipt.getText()); 
                opt.setText(c.CaesarDecip());
                error.setText("");
             }
              
         }
         else if(ctech==1)
         {
              String j=numKey.getText();
          j=j.replaceAll(" ", "");
          numKey.setText(j);
             int err=(new Validate()).checkNumKey(numKey.getText());
             if(err==99)
             {
             AdditiveDecipher ac=new AdditiveDecipher(Integer.parseInt(numKey.getText()),a);
             opt.setText(ac.AdditiceDecip());
             error.setText("");
             }
             else
                 error.setText("Invalid Key");
         }    
         else if(ctech==2)
         {
                 String key=stringKey.getText();
             key=key.toUpperCase();
             
             key=key.replaceAll(" ", "");
             int err=(new Validate()).checkStringKey(key);
             
             if(err==99)
             {
                 MonoAlphabeticDecipher mc=new MonoAlphabeticDecipher(key, a);
                 opt.setText(mc.MonoAlphabeticDecrypt().toUpperCase());
                 error.setText("");
             }
             else
                 error.setText("Invalid Key");
         }   
         else if(ctech==3)
         {
             String j=MultiKey.getText();
             j=j.replaceAll(" ", "");
             MultiKey.setText(j);
                 int err=(new Validate()).checkNumKey(MultiKey.getText());
             if(err==99)
             {
             MuxDecipher mux=new MuxDecipher(Integer.parseInt(MultiKey.getText()),a);
             opt.setText((new Validate()).getInput(mux.MuxDecrypt()));
             error.setText("");
             }
             else
                 error.setText("Invalid Key");
         }   
         else if(ctech==4)
         {
             String mkey=MultiKey.getText();
             String akey=AddKey.getText();
             mkey=mkey.replaceAll(" ", "");
             akey=akey.replaceAll(" ", "");
             MultiKey.setText(mkey);
             AddKey.setText(akey);
             
             int errm=(new Validate()).checkNumKey(mkey);
             int erra=(new Validate()).checkNumKey(akey);
             
             if(errm==99 && erra==99)
             {
                 AffineDecipher ac=new AffineDecipher(Integer.parseInt(mkey),Integer.parseInt(akey),a);
                 opt.setText((new Validate()).getInput(ac.AffineDecrypt()));
                 error.setText("");
             }
             else if(errm!=99)
                 error.setText("Invalid Multiplicative Key");
             else if(erra!=99)
                 error.setText("Invalid Additive Key");
         }   
         else if(ctech==5)
         {
                      
               
               String key=numKey.getText();
             key=key.replaceAll(" ", "");
             numKey.setText(key);
             
             
             int err=(new Validate()).checkNumKey(key);
             
             if(err==99)
             {
                 AutoKeyDecipher ac=new AutoKeyDecipher(Integer.parseInt(key),a);
                 opt.setText((new Validate()).getInput(ac.AutoKeyDecrypt()));
                 error.setText("");
             }
             else 
                 error.setText("Invalid Key");

         }   
         else if(ctech==6)
         {
             
             String tb0=t0.getText().toUpperCase();
             tb0=tb0.replaceAll(" ", "");
             t0.setText(tb0);
             
             String tb1=t1.getText().toUpperCase();
             tb1=tb1.replaceAll(" ", "");
             t1.setText(tb1);
             
             String tb2=t2.getText().toUpperCase();
             tb2=tb2.replaceAll(" ", "");
             t2.setText(tb2);
             
             String tb3=t3.getText().toUpperCase();
             tb3=tb3.replaceAll(" ", "");
             t3.setText(tb3);
             
             String tb4=t4.getText().toUpperCase();
             tb4=tb4.replaceAll(" ", "");
             t4.setText(tb4);
             
             String tb5=t5.getText().toUpperCase();
             tb5=tb5.replaceAll(" ", "");
             t5.setText(tb5);
             
             String tb6=t6.getText().toUpperCase();
             tb6=tb6.replaceAll(" ", "");
             t6.setText(tb6);
             
             String tb7=t7.getText().toUpperCase();
             tb7=tb7.replaceAll(" ", "");
             t7.setText(tb7);
             
             String tb8=t8.getText().toUpperCase();
             tb8=tb8.replaceAll(" ", "");
             t8.setText(tb8);
             
             String tb9=t9.getText().toUpperCase();
             tb9=tb9.replaceAll(" ", "");
             t9.setText(tb9);
             
             String tb10=t10.getText().toUpperCase();
             tb10=tb10.replaceAll(" ", "");
             t10.setText(tb10);
             
             String tb11=t11.getText().toUpperCase();
             tb11=tb11.replaceAll(" ", "");
             t11.setText(tb11);
             
             String tb12=t12.getText().toUpperCase();
             tb12=tb12.replaceAll(" ", "");
             t12.setText(tb12);
             
             String tb13=t13.getText().toUpperCase();
             tb13=tb13.replaceAll(" ", "");
             t13.setText(tb13);
             
             String tb14=t14.getText().toUpperCase();
             tb14=tb14.replaceAll(" ", "");
             t14.setText(tb14);
             
             String tb15=t15.getText().toUpperCase();
             tb15=tb15.replaceAll(" ", "");
             t15.setText(tb15);
             
             String tb16=t16.getText().toUpperCase();
             tb16=tb16.replaceAll(" ", "");
             t16.setText(tb16);
             
             String tb17=t17.getText().toUpperCase();
             tb17=tb17.replaceAll(" ", "");
             t17.setText(tb17);
             
             String tb18=t18.getText().toUpperCase();
             tb18=tb18.replaceAll(" ", "");
             t18.setText(tb18);
             
             String tb19=t19.getText().toUpperCase();
             tb19=tb19.replaceAll(" ", "");
             t19.setText(tb19);
             
             String tb20=t20.getText().toUpperCase();
             tb20=tb20.replaceAll(" ", "");
             t20.setText(tb20);
             
             String tb21=t21.getText().toUpperCase();
             tb21=tb21.replaceAll(" ", "");
             t21.setText(tb21);
             
             String tb22=t22.getText().toUpperCase();
             tb22=tb22.replaceAll(" ", "");
             t22.setText(tb22);
             
             String tb23=t23.getText().toUpperCase();
             tb23=tb23.replaceAll(" ", "");
             t23.setText(tb23);
             
             String tb24=t24.getText().toUpperCase();
             tb24=tb24.replaceAll(" ", "");
             t24.setText(tb24);
             
             PlayfairKey p=new PlayfairKey(tb0,tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9,tb10,tb11,tb12,tb13,tb14,tb15,tb16,tb17,tb18,tb19,tb20,tb21,tb22,tb23,tb24);
int error1=p.getError();
char keyp[][];
keyp=p.geMatrix();

             if(error1==0)
             {
                 PlayfairDecipher pc=new PlayfairDecipher(keyp, a);
                 opt.setText((new Validate()).getInput(pc.PlayfairDecrypt().toString()));
                 
                 
             }
             else
                 error.setText(error1 + "Errors in Key Matrix");
             
         }   
                 
         else if(ctech==7)
         {
             
             String key=stringKey.getText();
             key=key.replaceAll(" ", "");
             stringKey.setText(key);
             
             
             int keyf=(new Validate()).checkVigenereKey(key);
             
             if(keyf==99)
             {
                 VigenereDecipher ac=new VigenereDecipher(key,a);
                 opt.setText((new Validate()).getInput(ac.VigenereDecrypt()));
                 error.setText("");
             }
             else 
                 error.setText("Invalid Key");
         }   
     }
         }
else
{
 error.setText("Input Field Cannor Be Left Blank");
}}});
               
Label x=new Label("_____________________________________________________________________________________________________________________");
        x.setFont(labelFont);
        
        ////////////////////////////CLIPBOARD FUNCTIONS//////////////////////////////////////////////////////////
        copyToRSAE.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     tclip.setText(outputRSAEncryption.getText());
        }
    });
copyFromRSAE.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            inputRSAEncryption.setText(tclip.getText());
        }
    });

copyToClip.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     tclip.setText(opt.getText());
        }
    });
copyFromClip.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            ipt.setText(tclip.getText());
        }
    });

copyToRSAD.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     tclip.setText(outputRSADecryption.getText());
        }
    });
copyFromRSAD.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            inputRSADecryption.setText(tclip.getText());
        }
    });




     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 final GroupLayout lmain=new GroupLayout(mPanel);

   GroupLayout.SequentialGroup hGroupmain = lmain.createSequentialGroup();
     hGroupmain.addGroup(lmain.createParallelGroup().addComponent(new Label(""))
           .addComponent(universalPanel).addComponent(x).addComponent(new Label("")).addComponent(new Label("")).addComponent(initialOptions,100, 100, 100).addComponent(cipher).addComponent(crypt).addComponent(rsaKeyPanel).addComponent(rsaEncryptPanel).addComponent(rsaDecryptPanel).addComponent(clipBoard));
     lmain.setHorizontalGroup(hGroupmain);
     
    GroupLayout.SequentialGroup vGroupmain = lmain.createSequentialGroup();
    vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
     .addComponent(new Label("")));
    vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
     .addComponent(new Label("")));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(universalPanel));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
     .addComponent(new Label("")));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
     .addComponent(new Label("")));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
     .addComponent(new Label("")));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(initialOptions,100,100,100));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(cipher));
     vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(crypt));
      vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(rsaKeyPanel));
      vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(rsaEncryptPanel));
      vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(rsaDecryptPanel));
      vGroupmain.addGroup(lmain.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(clipBoard));
      
     lmain.setVerticalGroup(vGroupmain);
     add(mPanel);

             }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
public void start()
{}
public void stop()
{}
public void destroy()
{}
public void paint(Graphics g)
{}
public void cipherHide()
{    cipherOptions.setEnabled(true); 
    lst.setEnabled(true);
     
    MultiKey.setEnabled(false);
         AddKey.setEnabled(false);
          
      clearFields.setEnabled(false);
      copyToClip.setEnabled(false);
      copyFromClip.setEnabled(false);
      generate.setEnabled(false);
      reset.setEnabled(false);
      
     
     
     numKey.setEnabled(false);
     stringKey.setEnabled(false);
     opt.setEnabled(false);

          
    ipt.setEnabled(false);

    t0.setEnabled(false);
     t1.setEnabled(false);
     t2.setEnabled(false);
     t3.setEnabled(false);
     t4.setEnabled(false);
     t5.setEnabled(false);
     t6.setEnabled(false);
     t7.setEnabled(false);
     t8.setEnabled(false);
     t9.setEnabled(false);
     t10.setEnabled(false);
     t11.setEnabled(false);
     t12.setEnabled(false);
     t13.setEnabled(false);
     t14.setEnabled(false);
     t15.setEnabled(false);
t16.setEnabled(false);
   t17.setEnabled(false);
  t18.setEnabled(false);
   t19.setEnabled(false);
    t20.setEnabled(false);
   t21.setEnabled(false);
    t22.setEnabled(false);
    t23.setEnabled(false);
     t24.setEnabled(false);
}

public void clear()
{
    t0.setText(" ");
    t1.setText(" ");
    t2.setText(" ");
    t3.setText(" ");
    t4.setText(" ");
    t5.setText(" ");
    t6.setText(" ");
    t7.setText(" ");
    t8.setText(" ");
    t9.setText(" ");
    t10.setText(" ");
    t11.setText(" ");
    t12.setText(" ");
    t13.setText(" ");
    t14.setText(" ");
    t15.setText(" ");
    t16.setText(" ");
    t17.setText(" ");
    t18.setText(" ");
    t19.setText(" ");
    t20.setText(" ");
    t21.setText(" ");
    t22.setText(" ");
    t23.setText(" ");
    t24.setText(" ");
    
    MultiKey.setText(" ");
    AddKey.setText(" ");
    numKey.setText(" ");
    stringKey.setText(" ");
    ipt.setText(" ");
    opt.setText(" ");
    
            
}
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

