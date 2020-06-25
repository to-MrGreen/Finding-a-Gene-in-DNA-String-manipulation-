
/**
 * Write a description of Part1 here.
 * 
 * @author (Md. Samiul haque) 
 * @version (tester version)
 */
import edu.duke.*;
public class Part1 {
    public int findStopCodon(String dna,int startIndex,String stopCodon) {
        int endIndex = dna.indexOf(stopCodon,startIndex+3);
        while (endIndex != -1) {
            int validCheck = (endIndex-startIndex)%3;
            if (validCheck == 0) {
                return endIndex;
            }
            else {
                endIndex = dna.indexOf(stopCodon,endIndex+1);
            }
        }
        return dna.length();
        //if (endIndex == -1) {
        //    return dna.length();
        //}
        //else {
        //    return endIndex;
        //}
    }
    
    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "-1";
        }
        int taaIndex = findStopCodon(dna,startIndex,"TAA");
        int tagIndex = findStopCodon(dna,startIndex,"TAG");
        int tgaIndex = findStopCodon(dna,startIndex,"TGA");
        int minIndex;
        if (taaIndex < tagIndex && taaIndex != -1) {
            if (taaIndex > tgaIndex && tgaIndex != -1) {
                minIndex = tgaIndex; 
            }
            else {
                minIndex = taaIndex;
            }
            
        }
        else{
            if (tagIndex > tgaIndex && tgaIndex != -1) {
                minIndex = tgaIndex;
            }
            else {
                if (tagIndex != -1){
                    minIndex = tagIndex;
                }
                else {
                    return "Not Found";
                }
            }
        }
        //int temp = Math.min(taaIndex,tagIndex);
        //int minIndex = Math.min(temp,tgaIndex);
        //if (minIndex == dna.length()) {
        //    return "error gene";
        
        return dna.substring(startIndex,minIndex+3);
    }
    
    public StorageResource getAllGene(String dna) {
        StorageResource geneList = new StorageResource();
        
        int startIndex = 0;
        while (true) {
            String currentGene = findGene(dna);
            if (currentGene.isEmpty()) {
                break;
            }
            geneList.add(currentGene);
        }
        return geneList;
    }
    
    public void testStorageResource(String dna) {
        System.out.println("Testing getAllGenes on ");
        StorageResource st = getAllGene(dna);
        for (String g: st.data()) {
            System.out.println(g);
        }
    }
    
    public void testfindStopCodon() {
       //            01234567890123456789012345678901234
       String dna = "ATTCGATGACTGTTTCGTTGCATTAACGTTGCGTG";
       System.out.println("Index of end codon: "+findStopCodon(dna,5,"TAA"));
       dna = "ATTCGATGACTGTTTCGTTGCATCGTTGCGTG";
       System.out.println("Index of end codon: "+findStopCodon(dna,5,"TAA"));
       
       dna = "ATTCGATGACTGTTTCGTTGCATTAACGTTGCGTG";
       testStorageResource(dna);
    }

}
