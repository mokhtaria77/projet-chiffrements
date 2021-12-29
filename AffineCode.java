package cryptDecrypt;

 

public class AffineCode {
    
     static int t[]={1,3,5,7,9,11,15,17,19,21,23,25};
      
     /* Calcul du pgdc pour n'autoriser que les clés qui sont
      *  premiers avec 26.
      */
   static int pgdc(int a,int b){
       int r=a%b;
       if(r==0) return b;   // si b divise a ==> pgdc(a,b)=b.
       else return pgdc(b,r);
   }//end_pgdc()
    
    //METHODE AFFINE : a*x+b mod(26)
   
         public static String affineCrypt(String msg,int a,int b){
        
         int i;
         int[] codeNum=new int[50000];
         int[] chiffre=new int[msg.length()];
         char c;
         String cryptogramme="";
  
         for(i=0;i<msg.length();i++){
            
             c=msg.charAt(i);
            
            if(Character.isLetter(c)==false){
                cryptogramme+=c; 
            }
            
            else{
                codeNum[i]=c-64; 
                
                chiffre[i]=(codeNum[i]*a+b)%26;
                
               if(chiffre[i]==0) cryptogramme+='Z';     //Exception
               else cryptogramme+=(char)(chiffre[i]+64);     
            }
         }
       return cryptogramme; 
    }//end_cryptage()
         
         
        //*****************DECRYPTAGE***************
         
         public static String affineDecrypt(String msg,int k1,int k2){
        
         int i;
         int[] codeNum=new int[100];
         int[] chiffre=new int[msg.length()];
         char c;
         String claire="";
         
         for(i=0;i<msg.length();i++){
            
            c=msg.charAt(i);
            
            if(Character.isLetterOrDigit(c)==false){
                claire+=c; }
            
            else{
                codeNum[i]=c-64; 
                int invKey=0, j=0;
                for(;j<12;j++){
                 if((k1*t[j])%26==1) invKey=t[j];   //Inverse de la clé a. 
                }
                chiffre[i]=invKey*(codeNum[i]+(26-k2))%26;
                if(chiffre[i]==0) chiffre[i]=26;
                claire+=(char)(chiffre[i]+64);
            }
         }
       return claire; 
    }//end_decryptage()
    
}
