
/**
 * Write a description of Part3 here.
 * 
 * @author (Md. Samiul haque) 
 * @version (Tester String Occurrences)
 */

public class Part3 {
    public boolean twoOccurrences(String stringa,String stringb) {
        String s = stringb;
        int f = s.indexOf(stringa);
        if(f == -1) {
            return false;
        }
        else{
            if(s.indexOf(stringa, f) == -1){
                return false;
            }
            else {
                return true;
            }
        }
    }
    
    public String lastPart(String stringa,String stringb) {
        String s = stringb;
        int f = s.indexOf(stringa);
        if(f == -1) {
            return stringa;
        }
        else {
            String newS = s.substring(f,f+3);
            return (newS);
            
        }
    }
    
    public void testing() {
        System.out.println(twoOccurrences("by","A story by Abby Long"));
    }
    
    public void testingLast() {
        System.out.println(lastPart("an","banana"));
    }

}
