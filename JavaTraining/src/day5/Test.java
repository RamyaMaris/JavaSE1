
package day5;
public class Test {
        public static void main(String [] args) {

                System.out.println(" Command Line arguments :: " + args.length);
                int total = 0;
                for(String s : args) {
                        total += Integer.parseInt(s);
                }
                System.out.println(" Total of command line argu values :: "  + total);
        }
}