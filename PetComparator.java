package petcode;

import java.util.Comparator;

public class PetComparator implements Comparator<Pets> {
    @Override
    public int compare(Pets pet1, Pets pet2) {
        int petComparison = pet1.getClass().getName().compareTo(pet2.getClass().getName());
        if (petComparison != 0) {
            return petComparison;
        }else {
            return pet1.getName().compareTo(pet2.getName());
        }
    }
}
