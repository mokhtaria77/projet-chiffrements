package cryptDecrypt;

 

public class MultiplicationCode {
    
    static int t[]={1,3,5,7,9,11,13,15,17,19,21,23,25};
      
     /* Calcul du pgdc pour n'autoriser que les clés qui sont
      *  premiers avec 26.
      */
   static int pgdc(int a,int b){
       int r=a%b;
       if(r==0) return b;   // si b divise a ==> pgdc(a,b)=b.
       else return pgdc(b,r);
   }//end_pgdc() 
    
    //METHODE DE SUBSTITUTION PAR MULTIPLICATION: a*x mod(26)
    
    public static String multiplicationCrypt(String msg,int k){
        
         int i;
         char c;
         int[] codeNum=new int[3000];
         int[] chiffre=new int[msg.length()];
         String cryptogramme="";
      
         for(i=0;i<msg.length();i++){
             
            c=msg.charAt(i);
            if(Character.isLetter(c)==false){
                cryptogramme+=c; 
            }
            else{
                 codeNum[i]=c-64; 
                 chiffre[i]=(codeNum[i]*k)%26;
                 if(chiffre[i]==0) cryptogramme+='Z';       //Exception
                 else cryptogramme+=(char)(chiffre[i]+64);
            }
         }
       return cryptogramme; 
    }//end fonction()
    
    //=========Decryptage============
    
    
    //METHODE DE SUBSTITUTION PAR MULTIPLICATION: Inv(a)*x mod(26)
    
    public static String multiplicationDecrypt(String msg,int k){
        
         int i;
         char c;
         int[] codeNum=new int[100];
         int[] chiffre=new int[msg.length()];
         String cryptogramme="";
      
         for(i=0;i<msg.length();i++){
             
            c=msg.charAt(i);
            if(Character.isLetter(c)==false){
                cryptogramme+=c; 
            }
            
            else{
                codeNum[i]=c-64; 
                int invKey=0, j=0;
                for(;j<12;j++){
                 if((k*t[j])%26==1) invKey=t[j];   //Inverse de la clé a. 
                }
                chiffre[i]=invKey*codeNum[i]%26;
                if(chiffre[i]==0) chiffre[i]=26;
                cryptogramme+=(char)(chiffre[i]+64);
            }
         }
       return cryptogramme; 
    }//end fonction()
    
}
