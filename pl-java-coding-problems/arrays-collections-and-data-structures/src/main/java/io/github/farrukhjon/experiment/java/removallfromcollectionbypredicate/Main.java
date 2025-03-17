package io.github.farrukhjon.experiment.java.removallfromcollectionbypredicate;

import io.github.farrukhjon.experiment.java.sortarray.Melon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<io.github.farrukhjon.experiment.java.sortarray.Melon> melons = new ArrayList<>();
        melons.add(new io.github.farrukhjon.experiment.java.sortarray.Melon("Apollo", 3000));
        melons.add(new io.github.farrukhjon.experiment.java.sortarray.Melon("Jade Dew", 3500));
        melons.add(new io.github.farrukhjon.experiment.java.sortarray.Melon("Cantaloupe", 1500));
        melons.add(new io.github.farrukhjon.experiment.java.sortarray.Melon("Gac", 1600));
        melons.add(new io.github.farrukhjon.experiment.java.sortarray.Melon("Hami", 1400));

        List<io.github.farrukhjon.experiment.java.sortarray.Melon> copyOfMelons1 = new ArrayList<>(melons);
        System.out.println("Remove via Iterator");

        Iterator<io.github.farrukhjon.experiment.java.sortarray.Melon> iterator = copyOfMelons1.iterator(); // or listIterator()

        while (iterator.hasNext()) {
            io.github.farrukhjon.experiment.java.sortarray.Melon melon = iterator.next();
            if (melon.getWeight() < 3000) {
                iterator.remove();
            }
        }

        System.out.println("After remove with Iterator: " + copyOfMelons1);

        List<io.github.farrukhjon.experiment.java.sortarray.Melon> copyOfMelons2 = new ArrayList<>(melons);
        System.out.println("\nRemove via Collection.removeIf()");

        copyOfMelons2.removeIf(t -> t.getWeight() < 3000);

        System.out.println("After remove with Collection.removeIf(): " + copyOfMelons2);

        List<io.github.farrukhjon.experiment.java.sortarray.Melon> copyOfMelons3 = new ArrayList<>(melons);
        System.out.println("\nRemove via Stream");

        List<io.github.farrukhjon.experiment.java.sortarray.Melon> filteredMelons = copyOfMelons3.stream()
                .filter(t -> t.getWeight() >= 3000)
                .collect(Collectors.toList());

        System.out.println("After remove with Stream: " + filteredMelons);

        System.out.println("\nSeparate melons via Collectors.partitioningBy()");

        Map<Boolean, List<io.github.farrukhjon.experiment.java.sortarray.Melon>> separatedMelons = copyOfMelons3.stream()
                .collect(Collectors.partitioningBy((io.github.farrukhjon.experiment.java.sortarray.Melon t) -> t.getWeight() >= 3000));

        List<io.github.farrukhjon.experiment.java.sortarray.Melon> weightLesserThan3000 = separatedMelons.get(false);
        List<Melon> weightGreaterThan3000 = separatedMelons.get(true);

        System.out.println("After separation with "
                + "Collectors.partitioningBy(), melons < 3000g: " + weightLesserThan3000);
        System.out.println("After separation with "
                + "Collectors.partitioningBy(), melons >= 3000g: " + weightGreaterThan3000);
    }

}
