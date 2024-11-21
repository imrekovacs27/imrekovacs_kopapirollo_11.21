package kopapirollo;

import java.util.Scanner;
import java.util.Random;

public class KopapirOllo {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("egész: ");
        int egesz = sc.nextInt();
        System.out.println("1:Kő, 2:Papír, 3:Olló");
        System.err.print("Választásod?:");
        sc.nextInt();
        
        System.out.println("A gép választása:");
        
        System.out.println("Az eredmény");
        int jatekos = sc.nextInt();
        
        int gep = random.nextInt(4);
        System.out.println("Random Integer (0-4): " + gep);
        
        String jatekosnyer = "A játékos nyert";
        String gepnyer = "A gép nyert";
        
        if(jatekos != gep ){
            if (jatekos==2 && gep == 1 ){
            System.out.println(jatekosnyer);
            }
            else if (jatekos == 1 && gep == 2 ){
            System.out.println(gepnyer);
            }
            else if (jatekos == 3 && gep == 1 ){
            System.out.println(gepnyer);
        
            }else if (jatekos == 1 && gep == 3 ){
            System.out.println(jatekosnyer);    
            
        
            }else if (jatekos == 2 && gep == 3 ){
            System.out.println(gepnyer);    
            }
            else{
                System.out.println(jatekosnyer);
            }
            
        }else{
                System.out.println("Döntetlen");
        }