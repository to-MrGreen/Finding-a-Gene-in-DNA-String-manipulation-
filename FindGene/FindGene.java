
/**
 * Write a description of FindGene here.
 * 
 * @author (Md. Samiul Haque) 
 * @version (Test_Version)
 */
public class FindGene {
    public String Fgene(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1) {
            
                return "";
            }
        int endIndex = dna.indexOf("TAA",startIndex+3);
        if(endIndex == -1) {
            return "";
        }
        result = dna.substring(startIndex, endIndex+3);
        return result;
    }
    
    public void testFindGeneSimple() {
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA string is: "+dna);
        String gene = Fgene(dna);
        System.out.println("Gene is : "+gene);
        
        dna = "AATGCTAGGTAATATGGT";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna);
        System.out.println("Gene is: "+gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna);
        System.out.println("Gene is: "+gene);
        
        dna = "TTATAA";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna);
        System.out.println("Gene is: "+gene);
        
        dna = "CGATGGTTTG";
        System.out.println("DNA string is: "+dna);
        gene = Fgene(dna);
        System.out.println("Gene is: "+gene);
    }

}
