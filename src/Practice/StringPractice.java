package Practice;
public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Strings--->");
        String greeting = "Hello";
        System.out.println("String contains: " + greeting);

        System.out.println("String Length--->");
        String bigWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
        int stringLength = bigWord.length();
        System.out.println("The string is: " + bigWord + "\n" + "String Length is: " + stringLength);

        System.out.println("String Methods--->");
        String str1 = "Mehedi Hasan Shovon";
        String makeUpperCase = str1.toUpperCase();
        System.out.println("Upper case of the string is:" + makeUpperCase);

        String makeLowerCase = str1.toLowerCase();
        System.out.println("Lower case of the string is:" + makeLowerCase);

        System.out.println("Finding a Character in a String:--->");
        String str2 = "Mehedi Hasan Shovon";
        int indexOfTheChar = str2.indexOf("Shovon");
        System.out.println("The index is: " + indexOfTheChar);

        System.out.println("Strings Concatenation--->");
        String firstName = "Mehedi Hasan";
        String lastName = "Shovon";
        System.out.println("Name is: "+firstName + " " + lastName);

        String firstName1 = "Mehedi Hasan ";
        String lastName1 = "Shovon";
        System.out.println("Name is: "+firstName1.concat(lastName1));

        System.out.println("Adding String and Number--->");
        int x1 = 10;
        int y1 = 20;
        System.out.println("Result is: "+(x1+y1));

        String x2 = "10";
        String y2 = "20";
        System.out.println("Result is: "+(x2+y2));

        int x3 = 10;
        String y3 = "20";
        System.out.println("Result is: "+(x3+y3));
    }
}
