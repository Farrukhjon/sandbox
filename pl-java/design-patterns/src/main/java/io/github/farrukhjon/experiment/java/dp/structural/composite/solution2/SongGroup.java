package io.github.farrukhjon.experiment.java.dp.structural.composite.solution2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {

    private List<SongComponent> songComponentList = new ArrayList<>();

    private final String groupName;
    private final String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponentList.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent newSongComponent) {
        songComponentList.remove(newSongComponent);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return songComponentList.get(componentIndex);
    }

    @Override
    public void displaySongInfo() {
        System.out.printf("%-5s %1s %-3s %n", getGroupName(), "---", getGroupDescription());

        Iterator<SongComponent> iterator = songComponentList.iterator();

        while (iterator.hasNext()) {
            SongComponent component = iterator.next();
            component.displaySongInfo();
        }
    }

}
