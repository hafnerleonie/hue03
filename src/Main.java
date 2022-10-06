import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static List<Weapon> myList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.readCSV();
        main.readCSV2();
        final int result = IntStream.of(1,2,3,4,5,6,7,8,9,10).filter(w -> w%2 != 0).map(w -> w*w).reduce(0,Integer::sum);
        System.out.println(result);
        final List<String> names = Arrays.asList("Tim", "Anndi", "Michael");
        final Mapper<String, Integer> intMapper = null;

        System.out.println(intMapper.mapAll(names));

    }
    public void readCSV() throws FileNotFoundException {
            Scanner scanner = new Scanner(new File("weapons.csv"));
            scanner.nextLine();
            while (scanner.hasNextLine()){
                String read = scanner.nextLine();
                String[] split = read.split(";");
                Weapon weapons = new Weapon(split[0], CombatType.valueOf(split[1]), DamageType.valueOf(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));
                this.myList.add(weapons);
            }
    }

    public void readCSV2() throws IOException {
        Scanner sc = new Scanner("weapons.csv");
        String fileName = "weapons.csv";
        Files.lines(Path.of(fileName)).forEach(System.out::println);
    }
    public void compareTo(){
        Collections.sort(myList, Comparator.comparingInt(p -> p.getDamage()));
        Collections.sort(myList, Comparator.comparing(p -> p.getCombatType()));
        Collections.sort(myList, Comparator.comparing(p -> p.getDamage()));
        Collections.sort(myList, Comparator.comparing(p -> p.getName()));
    }
}
