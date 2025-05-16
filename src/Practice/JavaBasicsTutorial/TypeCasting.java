package Practice.JavaBasicsTutorial;
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Widden Casting:---> ");
        int myInt1 = 10;
        double myDouble1 = myInt1;
        System.out.println("Print My Integer: "+myInt1);
        System.out.println("Print My Double: "+myDouble1);

        System.out.println("\nNarrow Casting:---> ");
        double myDouble2 = 10.58;
        int myInt2 = (int) myDouble2;
        System.out.println("Print My Double: "+myDouble2);
        System.out.println("Print My Integer: "+myInt2);

        System.out.printf("Print My Double: "+myDouble2);
        System.out.printf("Print My Integer: "+myInt2);
    }
}
