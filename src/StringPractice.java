public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Strings--->");
        String greeting = "Hello";
        System.out.println("String contains: " + greeting);

        System.out.println("String Length--->");
        String bigWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
        int stringLength = bigWord.length();
        System.out.println("The string is: " +bigWord +"\n"+"String Length is: " + stringLength);
        
        System.out.println("String Methods--->");
        String str1 = "Mehedi Hasan Shovon";
        String makeUpperCase = str1.toUpperCase();
        System.out.println("Upper case of the string is:"+makeUpperCase);
        String makeLowerCase = str1.toLowerCase();
        System.out.println("Lower case of the string is:"+makeLowerCase);

        System.out.println("Finding a Character in a String:--->");
        String str2 = "Mehedi Hasan Shovon";
        int indexOfTheChar = str2.indexOf("Shovon");
        System.out.println("The index is: "+indexOfTheChar);
    }
}
