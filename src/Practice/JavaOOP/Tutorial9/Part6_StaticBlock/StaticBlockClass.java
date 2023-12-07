package Practice.JavaOOP.Tutorial9.Part6_StaticBlock;

public class StaticBlockClass {
    static int id;
    static String name;

    static{
        id = 1010;
        name = "Shovon";
    }

    static void display1(){
        System.out.println("Id is: "+ id);
        System.out.println("Name is: "+ name);
    }
}
