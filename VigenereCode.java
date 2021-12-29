package cryptDecrypt;



public class VigenereCode {
    
    public VigenereCode(){}
    
    /*
     * FONCTION DE CRYPTAGE:
     */
    
     String crypter(String text,String key){
         
        String cryptogramme="";
        String message=text.toUpperCase();
        int[] codeNum1=new int[message.length()];
        int[] codeNum2=new int[key.length()];
        int[] chiff=new int[message.length()];
        int j=0;
        //Codage  numerique:
       
        for(int i=0;i<message.length();i++){
         
         if(Character.isLetter(message.charAt(i))==false){
             cryptogramme+=message.charAt(i);
         }
         else{
         codeNum1[i]=(message.charAt(i)-64);
             
                for(;j<key.length();){              
                    codeNum2[j]=(key.charAt(j)-65);
                    chiff[i]=(codeNum1[i]+codeNum2[j])%26; 
                    if(chiff[i]==0) chiff[i]=26;  
                    break;
                    }
             j++;
             j=j%key.length(); 
                
             cryptogramme+=(char)(chiff[i]+64);
         }
        }
        return cryptogramme;
    }
     
     /*
      * FONCTION DE DECRYPTAGE
      */
     String decrypter(String text,String key){
         
        String claire="";
        String message=text.toUpperCase();
        int[] codeNum1=new int[message.length()];
        int[] codeNum2=new int[key.length()];
        int[] chiff=new int[message.length()];
        int j=0;
        //Codage  numerique:
       
        for(int i=0;i<message.length();i++){
                
         if(Character.isLetter(message.charAt(i))==false){
             claire+=message.charAt(i);
         }
         else{
            
            codeNum1[i]=(message.charAt(i)-64);
             
                for(;j<key.length();){
                    codeNum2[j]=(key.charAt(j)-65);
                    chiff[i]=(codeNum1[i]-codeNum2[j])%26; 
                    if(chiff[i]<=0) chiff[i]+=26;
                    break;
                    }
             j++;
             j=j%key.length(); 
             
             claire+=(char)(chiff[i]+64);
         }
        }
        return claire;
    }
}
