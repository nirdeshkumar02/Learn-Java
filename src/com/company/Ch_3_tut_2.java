package com.company;
// ----------------------------- Chapter 3 (Strings) ------------------------------ //
public class Ch_3_tut_2 {
    public static void main(String[] args) {
        String name = "Nirdesh KUMAR Saini";
        System.out.println(name);

        // -------------------------- String Methods --------------------- //

        // -------------------- NOTE --- Strings are immutable so it cannot be changed, once it created. --------------------- //
        // ------------ On applying methods on Strings, It always return a "New String" ------------------//

        System.out.println("The length of name: "+ name.length()); // return length of string of name //

        System.out.println("The lower case of name: "+ name.toLowerCase()); // return new string of name having lower case //

        System.out.println("The upper case of name: "+ name.toUpperCase()); // return new string of name having upper case //


        String name2 = "      Nirdesh KUMAR Saini      ";
        System.out.println(name2); // print string "name2" with spaces //
        System.out.println("The trimmed string of name: "+ name2.trim()); // return new string of name2 without spaces. it trim the spaces//

        System.out.println("The substring of name: "+ name.substring(4)); // return new substring of name starting from index 5 //
        System.out.println("The substring of name: "+ name.substring(4,16)); // return new substring of name starting from index 5 & end on index 16 //


        System.out.println("New String after replacing i to a: "+ name.replace('i', 'a')); // replace character in string name //
        System.out.println("New String after replacing rdesh to tin: "+ name.replace("rdesh", "tin")); // replace series of char and return new string of name //

        System.out.println("String starts with sh: "+ name.startsWith("sh")); // return a new string start with sh //
        System.out.println("String starts with Ni: "+ name.startsWith("Ni"));

        System.out.println("String ends with sh: "+ name.endsWith("sh")); // return a new string of name ends with sh //
        System.out.println("String ends with ni: "+ name.endsWith("ni"));

        System.out.println("Character at index 4: " + name.charAt(9)); // return character at index 9 //

        System.out.println("Index of s in name string: "+ name.indexOf('s')); // return index of char where it occurs 1 //
        System.out.println("Index of s in name string: "+ name.indexOf('s', 2)); //
        System.out.println("Index of sa in name string: "+ name.indexOf("Sa"));
        System.out.println("Index of sa in name string: "+ name.indexOf("sh", 2));


        String name3 = "Nirdesh";
        System.out.println("is given string equals to name: "+name3.equals("Nirdesh"));
        System.out.println("is given string equals to name: "+name3.equals("nirdesh"));
        System.out.println("is given string equals to name: "+name3.equalsIgnoreCase("NIRdesH"));


        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence\tdouble quote");
    }
}
