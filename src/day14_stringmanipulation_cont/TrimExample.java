package day14_stringmanipulation_cont;

public class TrimExample {

    public static void main(String[] args) {
//        trim()  --> deletes whitespace in the beginning and end of the string
        // including tab and regular space
        // space can be only at the beginning, or only at the end or in both sides.
        // Everything will go
        
        String str = "    blah        ";
        
        System.out.println(str);
        
        // console will print str without the space
        // but the value of the str does not chage
        System.out.println(str.trim());

        System.out.println(str.length());
        // chaining --> calling methods one after another
        System.out.println(str.trim().length());
                
//        #######################
        
        
    }
}