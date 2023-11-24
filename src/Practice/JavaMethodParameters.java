package Practice;

public class JavaMethodParameters {
    public static void main(String[] args) {
        //Single Parameter
        myMethodSingleParameter("Sachin");
        myMethodSingleParameter("Anjali");
        myMethodSingleParameter("Arjun");
        myMethodSingleParameter("Sara");

        //Multiple Parameters
        myMethodMultipleParameter("Sachin", 50);
        myMethodMultipleParameter("Anjali", 45);
        myMethodMultipleParameter("Arjun", 24);
        myMethodMultipleParameter("Sara", 26);

        //Return Values single parameter
        System.out.println("The value return from the method is: " + myIntMetohdSingleParam(5));

        //Return values multiple parameters
        System.out.println("The value return from the method is: " + myIntMetohdMultipleParam(5,5));
        int c = myIntMetohdMultipleParam(10, 10);
        System.out.println("The sum is: " + c);

        //A method with if...else.
        checkVotingAge(19);
        checkVotingAge(17);
    }

    //Single Parameter
    static void myMethodSingleParameter(String firstName) { // first name is the single parameter here and its type is string.
        System.out.println(firstName + " " + "Tendulkar");
    }

    //Multiple Parameters
    static void myMethodMultipleParameter(String name, int age) { // name and age are the parameters here and the type of them are string & int.
        System.out.println(name + " is " + age);
    }

    //Return Values single parameter
    static int myIntMetohdSingleParam(int x){
        return 10 + x;
    }

    //Return values multiple parameters
    static int myIntMetohdMultipleParam(int a, int b){
        return a + b;
    }

    //A method with if.....else.
    static void checkVotingAge(int votingAge){
        if (votingAge < 18) {
            System.out.println("Not Eligible - You are not old enough for voting.");
        } else {
            System.out.println("Eligible - You are old enough for voting.");
        }
    }

}
