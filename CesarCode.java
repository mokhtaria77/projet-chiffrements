package cryptDecrypt;

 
public class CesarCode {
    
    public static String cesarCrypt(String msg,Integer k){
        
         int i;
         char c;
         int[] codeNum=new int[3000];
         int[] chiffre=new int[msg.length()];
         String cryptogramme="";
         
         for(i=0;i<msg.length();i++){ //On parcours tous les lettre du message.
           
            c=msg.charAt(i);
            
            if(Character.isLetter(c)==false){
              //Si le caracter n'est pas une lettre alors on ne le crypte pas.
              cryptogramme+=c;
            }
            
            else{  //Sinon on procede aux etapes du cryptage suivants:
             
            //Etap1: Codage numerique
            codeNum[i]=c-64;   // Le code ASCII pour avoir le code numerique du lettre
        
            //Etape 2: Chiffrement
            chiffre[i]=(codeNum[i]+k)%26;
            
            //Etape 3: Decodage
            if(chiffre[i]==0) cryptogramme+='Z';
            else cryptogramme+=(char)(chiffre[i]+64);
             }
            
         }
       return cryptogramme; 
    }//end fonction()
    
    //decryptage:
    
    public static String cesarDecrypt(String msg,Integer k){
        
         int i;
         char c;
         int[] codeNum=new int[100];
         int[] chiffre=new int[msg.length()];
         String claire="";
         
         for(i=0;i<msg.length();i++){ //On parcours tous les lettre du message.
           
            c=msg.charAt(i);
            
            if(Character.isLetter(c)==false){
              //Si le caracter n'est pas une lettre alors on ne le décrypte pas.
              claire+=c;
            }
            
            else{  //Sinon on procede aux etapes du decryptage suivants:
             
            //Etap1: Codage numerique
            codeNum[i]=c-64;   // Le code ASCII pour avoir le code numerique du lettre
        
            //Etape 2: Déchiffrement
            chiffre[i]=(codeNum[i]+(26-k))%26;
            if(chiffre[i]==0) chiffre[i]=26;
            
            //Etape 3: Decodage
            claire+=(char)(chiffre[i]+64);
             }
            
         }
       return claire; 
    }//end fonction()
    
    
}
