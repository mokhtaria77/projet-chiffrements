package cryptDecrypt;
 

import javax.swing.JOptionPane;


public class HillCode {
    
    
    static int[] t={1,3,5,7,9,11,15,17,19,21,23,25};
    
    static int pgdc(int a,int b){
        int r=a%b;
        if(r==0) return b;
        else return pgdc(b,r);
    }
    
    /*
     *  RENVOIE LE det(A)SI ELLE EST INVERSIBLE MODULO 26
     * 0 SINON
     */
    static int inverseDet(int[][]A){
        
        int detA=A[0][0]*A[1][1]-A[0][1]*A[1][0];
        int invDet=0;
        
        if(pgdc(detA,26)==1){
            
            for(int i=0;i<12;i++){
                if((detA*t[i])%26==1){
                 invDet=t[i]; break; }  
            }
        }

    return invDet;
   
    }
    
    /*
     * FONCTION DE DECRYPTAGE:
     */
    static String hillCrypt(String texte,int[][]A){
        
        String claire="";
        texte=texte.toUpperCase();
        texte=texte.replace(" ", "Z");
        if(texte.length()%2==1) texte+="Z";
        
        Vect[] v=new Vect[texte.length()];
       
        int inv=inverseDet(A);
        int[][] invA=new int[2][2];
       
        if(inv==0){
            JOptionPane.showInternalConfirmDialog(null, "La matrice de chiffrement n'est pas inversible !");
            return null;
        }
        
        for(int i=1;i<texte.length();i++){
            
                char c1=texte.charAt(i-1);
                char c2=texte.charAt(i);
                int n1=c1-64;
                int n2=c2-64;
                
                if(Character.isLetter(c1)==false) {
                   claire+=c1;  continue;
                }
               
                if(Character.isLetter(c2)==false) {
                    claire+=c2;continue;  
                }
                 
                else{
                   v[i]=new Vect(n1,n2);

                    int x=(A[0][0]*v[i].x+A[0][1]*v[i].y)%26;
                    int y=(A[1][0]*v[i].x+A[1][1]*v[i].y)%26;

                    //System.out.print("("+x+","+y+");"); 
                    char l1,l2;
                    l1=(char)(x+64);
                    l2=(char)(y+64);
                   
                    claire+=l1;
                    claire+=l2;
                    
                   i++;
                }
           }
        
         return claire;
           
    }
    
    /*
     * FONCTION DE DECRYPTAGE:
     */
       
    static String hillDecrypt(String texte,int[][]A){
        
        texte=texte.toUpperCase();
        //texte=texte.replace(" ", "Z");
        if(texte.length()%2==1) texte+="Z";
        String claire=" ";
        Vect[] v=new Vect[texte.length()];
        
        int inv=inverseDet(A);
        int[][] invA=new int[2][2];
       
        if(inv==0){
            JOptionPane.showInternalConfirmDialog(null, "La matrice"
                    + " de chiffrement n'est pas inversible !");
            return null;
        }
        
        else{
             
            //CALECUL DE L'INVERSE DE A MODULO 26.
             invA[0][0]= (A[1][1]*inv)%26;  
             invA[0][1]= 26+(-A[0][1]*inv)%26;  
             invA[1][0]= 26+(-A[1][0]*inv)%26;  
             invA[1][1]= (A[0][0]*inv)%26;  
            
            for(int i=1;i<texte.length();i++){
                
                char c1=texte.charAt(i-1);
                char c2=texte.charAt(i);
                int n1=c1-64;
                int n2=c2-64;
                
                if(Character.isLetter(c1)==false) {
                   claire+=c1;  continue;
                }
               
                if(Character.isLetter(c2)==false) {
                    claire+=c2;continue;  
                }
              
                else{
                   v[i]=new Vect(n1,n2);

                    int x=( invA[0][0]*v[i].x+ invA[0][1]*v[i].y)%26;
                    int y=( invA[1][0]*v[i].x+ invA[1][1]*v[i].y)%26;

                    //System.out.print("("+x+","+y+");"); 
                    char l1,l2;
                    l1=(char)(x+64);
                    l2=(char)(y+64);
                   
                    claire+=l1;
                    claire+=l2;
                    i++;
           }
            }
        }
        return claire;
    }
    
    
    }// END_CLASS


class Vect {
    
    public Vect(int x,int y){
        
        this.x=x;
        this.y=y;
    }
    int x,y;
    
}
    

