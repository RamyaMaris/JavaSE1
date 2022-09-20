package day6;

public class HelloWorld {

    public static void main(String[] args) {
        char ch[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'l', 'd'};
        String s = new String(ch);
        
        System.out.println(s);
        System.out.println(s.hashCode());
        s = "Welcome to java";
        System.out.println(s.hashCode());
    }
}
