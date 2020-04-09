/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class JuniusJuliusAugusztus {
    public static void main(String[]args){
        int[] jun=new int[30];
        int[] jul=new int[31];
        int[] aug=new int[31];
        int x;
        int osszjun=0;
        int osszjul=0;
        int osszaug=0;
        
        System.out.println("Júniusi hőmérséletek: ");
        for(int i=0; i<jun.length; i++){
            jun[i]=(int)(Math.random()*27)+12;
            System.out.print(jun[i]+" ");           
        }
        for(int i=0; i<jun.length; i++){
            osszjun=osszjun+jun[i];           
        }
        System.out.println();
        System.out.println("A júniusi átlag: "+osszjun/30);  
        for(int i=0; i<jun.length; i++){
            for(int j=(jun.length-1); j>i; j--){
                if(jun[j-1]<jun[j]){
                    x=jun[j-1];
                    jun[j-1]=jun[j];
                    jun[j]=x;
                }
            }
        }
        System.out.println("Júniusi hőmérsékletek sorban: ");
        for(int i=0; i<jun.length; i++){
            System.out.print(jun[i]+" ");
        }
        System.out.println();
        System.out.println("Júliusi hőmérséletek: ");
        for(int i=0; i<jul.length; i++){
            jul[i]=(int)(Math.random()*27)+12;
            System.out.print(jul[i]+" ");           
        }
        for(int i=0; i<jul.length; i++){
            osszjul=osszjul+jul[i];           
        }
        System.out.println();
        System.out.println("A júliusi átlag: "+osszjul/31);  
        for(int i=0; i<jul.length; i++){
            for(int j=(jul.length-1); j>i; j--){
                if(jul[j-1]<jul[j]){
                    x=jul[j-1];
                    jul[j-1]=jul[j];
                    jul[j]=x;
                }
            }
        }
        System.out.println("Júliusi hőmérsékletek sorban: ");
        for(int i=0; i<jul.length; i++){
            System.out.print(jul[i]+" ");
        }
        System.out.println();
        System.out.println("Augusztusi hőmérséletek: ");
        for(int i=0; i<aug.length; i++){
            aug[i]=(int)(Math.random()*27)+12;
            System.out.print(aug[i]+" ");           
        }
        for(int i=0; i<aug.length; i++){
            osszaug=osszaug+aug[i];           
        }
        System.out.println();
        System.out.println("Az augusztusi átlag: "+osszaug/31);  
        for(int i=0; i<aug.length; i++){
            for(int j=(aug.length-1); j>i; j--){
                if(aug[j-1]<aug[j]){
                    x=aug[j-1];
                    aug[j-1]=aug[j];
                    aug[j]=x;
                }
            }
        }
        System.out.println("Augusztusi hőmérsékletek sorban: ");
        for(int i=0; i<aug.length; i++){
            System.out.print(aug[i]+" ");
        }
    }
}
