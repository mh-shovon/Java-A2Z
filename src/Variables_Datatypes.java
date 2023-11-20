public class Variables_Datatypes {
    public static void main(String[] args) {
        String firstName="Mehedi";
        String lastName="Hasan";
        System.out.println("Name: " +firstName+" "+lastName);

        int intNum1 = 10;
        int intNum2 = 20;
        int intSum;
        intSum= intNum1+intNum2;
        System.out.println("Sum is: " + intSum);
        
        double doubleNum1 = 20.50;
        double doubleNum2 = 20.50;
        System.out.println("Sum is: " +(doubleNum1+doubleNum2));

        float floatNum1 = 24.5f;
        float floatNum2 = 25.5f;
        float floatSum = 0.0f;
        floatSum = floatNum1+floatNum2;
        System.out.println("Sum is: " +floatSum);

        char charChar1 = 'A';
        char charChar2 = 'B';
        System.out.println(charChar1+""+charChar2);
    }
}
