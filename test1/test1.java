
/**
 * Write a description of test1 here.
 * String Finding
 * @author (Md.Samiul Haque) 
 * @version (a version number or a date)
 */
public class test1 {
    public void findAbc(String input){
       int index = input.indexOf("abc");
       while (true){
           System.out.println("index "+index);
           if (index == -1 || index >= input.length() - 3){
               break;
           }
           System.out.println(index);
           String found = input.substring(index+1, index+4);
           System.out.println(found);
           index = input.indexOf("abc",index+3);
           System.out.println("index after updating "+index);
       }
   }

   public void test(){
       //findAbc("abcd");
       //findAbc("abcdabc");
       //findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
       findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
   }
}
