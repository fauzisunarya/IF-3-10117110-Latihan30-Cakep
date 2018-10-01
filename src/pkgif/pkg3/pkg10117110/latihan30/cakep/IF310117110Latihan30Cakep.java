


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * teks yang telah diwarnai
 */
package pkgif.pkg3.pkg10117110.latihan30.cakep;

import java.util.Scanner;


public class IF310117110Latihan30Cakep {
    
        public static final String NORMAL = "\u001b[0m";
        public static final String BLACK = "\u001b[30m";
        public static final String RED = "\u001b[31m";
        public static final String GREEN = "\u001b[32m";
        public static final String YELLOW = "\u001b[33m";
        public static final String BLUE = "\u001b[34m";
        public static final String MAGENTA = "\u001b[35m";
        public static final String CYAN = "\u001b[36m";
        public static final String WHITE = "\u001b[37m";
        public static final String BLINK = "\u001b[5m";
 
    public static void main(String[] args){
        

        String jawab;
        Scanner scan = new Scanner(System.in);
        
            
        System.out.println( RED + "Kamu " +GREEN+ "Ngerjain Sendiri " +YELLOW+ 
                "Latihan 17 Sampe " +BLUE+ "30 ini ? ");
        System.out.print( BLUE + "Jawab " +RED+ "(Yoi/Enggak) : ");
        jawab = scan.nextLine();
        
        
        if (jawab.equalsIgnoreCase("Yoi")){
            System.out.println( RED + "Cakep Bener." +MAGENTA+ "Good Job");
        }else{
            System.out.println( RED + "Tetep Cakep Sih");
            System.out.println( CYAN + "SIng Penting Paham Konsepnya yee.");
            System.out.println("Keep the code work dude");
        }
   }
}
