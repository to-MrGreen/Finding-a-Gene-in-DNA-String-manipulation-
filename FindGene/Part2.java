
/**
 * Write a description of Part2 here.
 * 
 * @author (Md. Samiul Haque) 
 * @version (Tester version )
 */
import java.util.Scanner;
public class Part2 {
    public String Fgene(String dna,String startCodon,String stopCodon ) {
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if(startIndex == -1) {
            
                return "";
            }
        int endIndex = dna.indexOf(stopCodon,startIndex+3);
        if(endIndex == -1) {
            return "";
        }
        result = dna.substring(startIndex, endIndex+3);
        return result;
    }
    
    public void testFindGeneSimple() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter DNA String");
        String dna = sc.nextLine();
        System.out.println("Enter Start cod");
        String scod = sc.nextLine();
        System.out.println("Enter Stop cod");
        String stpcod = sc.nextLine();
        
        //String dna = "AATGCGTAATATGGT";
        System.out.println("DNA string is: "+dna);
        String gene = Fgene(dna,scod,stpcod);
        System.out.println("Gene is : "+gene);
        
        dna = "AATGCTAGGTAATATGGT";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna,"ATG","TAA");
        System.out.println("Gene is: "+gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna,"ATG","TAA");
        System.out.println("Gene is: "+gene);
        
        dna = "TTATAA";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna,"ATG","TAA");
        System.out.println("Gene is: "+gene);
        
        dna = "CGATGGTTTG";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna,"ATG","TAA");
        System.out.println("Gene is: "+gene);
    }

}
