
/**
 * Write a description of FindingGeneVersion2 here.
 * 
 * @author (Md. Samiul Haque) 
 * @version (Tester version)
 */
import java.util.Scanner;
public class FindingGeneVersion2 {
    public String FindGene(String dna, String startGene, String endgene) {
        String dn = dna;
        String sdn = startGene;
        String edn = endgene;
        
        int fsrt = dn.indexOf(sdn);
        if(fsrt == -1) {
            return "-1";
        }
        int fend = dn.indexOf(edn);
        if(fend == -1) {
            return "-1";
        }
        
        return dn.substring(fsrt,fend+3);
    }

    
    public void testGene() {
        
        
    }
    
    public String findGeneLoop(String dna, String startGene, String endgene) {
        int srtindex = dna.indexOf(startGene);
        int currindex = dna.indexOf(endgene,srtindex+3);
        
        while (currindex != -1) {
            if ((currindex - srtindex)%3==0) {
                return dna.substring(srtindex,currindex);
            }
            else {
                currindex = dna.indexOf(endgene,currindex+1);
            }
        }
        return "-2";
    }
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        FindingGeneVersion2 smpl1 = new FindingGeneVersion2();
        System.out.println("Enter DNA");
        String dna = sc.nextLine();
        System.out.println("Enter Start gene");
        String sgene = sc.nextLine();
        System.out.println("Enter End gene");
        String egene = sc.nextLine();
        
        System.out.println("Got Gene !!"+smpl1.FindGene(dna,sgene,egene));
        System.out.println("Got Gene !!"+smpl1.findGeneLoop(dna,sgene,egene));
    }
}
