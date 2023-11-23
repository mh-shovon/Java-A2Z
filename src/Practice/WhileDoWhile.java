package Practice;
public class WhileDoWhile {
    public static void main(String[] args) {
        System.out.println("While Loop--->");
        int i=1;
        while(i<=5){
            System.out.println("Print i: "+i);
            i++;
        }

        System.out.println("Do While Loop--->");
        int j =1;
        do{
            System.out.println("Print j: "+j);
            j++;
        }
        while(j<=10);
    }
}
