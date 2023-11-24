package Practice.JavaBasicsTutorial;
public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break and Continue With For Loop--->");
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("Print When Break Works: " + i);
        }
        System.out.println("\n");
        for (int j = 0; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println("Print When Continue Works: " + j);
        }
        
        System.out.println("\n"+"Break and Continue Wit While Loop--->");
        int i1 = 0;
        while (i1 < 10) {
            System.out.println("Print When Break Works: " + i1);
            i1++;
            if (i1 == 4) {
                break;
            }
        }
        System.out.println("\n");
        int i3 = 0;
        while (i3 < 10) {
            if (i3 == 4) {
                i3++;
                continue;
            }
            System.out.println("Print When Continue Works: " +i3);
            i3++;
        }
    }
}
