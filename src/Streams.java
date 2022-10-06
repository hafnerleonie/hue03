import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public double average(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }

    public List<String> upperCase(String[] strings) {
        return Arrays.stream(strings).map(m -> m.toUpperCase()).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        if (weapons.size() == 0) {
        }
        return weapons.stream().max(Comparator.comparing(p -> p.getMinStrength())).get();
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        //implement this
        return null;
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream().filter(w -> w.getDamageType().equals(DamageType.MISSILE)).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        if(weapons.size() == 0){
        }
        return weapons.stream().max(Comparator.comparing(p -> p.getName().length())).get();
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map(w -> w.getName()).collect(Collectors.toList());
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream().mapToInt(w -> w.getSpeed()).toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream().mapToInt(w -> w.getValue()).reduce(0, Integer::sum);
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::hashCode).reduce(0,Integer::sum);
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream().distinct().collect(Collectors.toList());
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.stream().forEach(w -> w.setValue((int)(w.getValue()*1.1)));
    }
}
