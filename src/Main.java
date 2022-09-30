import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> myList;
    public static void main(String[] args) {
        Main main = new Main();
        main .readCsv();


    }
    public void readCsv(){
        Scanner sc = new Scanner("weapons.csv");
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
    }
}
