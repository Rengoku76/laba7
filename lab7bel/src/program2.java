import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        int count = 0;
        int  b = 0;
        int xd;
        String[] array = {"" };
        String c = null;
        while (b != 1) {
            Scanner myscan = new Scanner(System.in);
            System.out.println("Vvedite slovo");
            String a = myscan.nextLine();
            count += 1;
            System.out.println("Zakonchit?(1/2) ");
            int s = myscan.nextInt();
            xd = b = s;
        }
        System.out.println("Slov vvedeno:" + (count));
    }
    }
