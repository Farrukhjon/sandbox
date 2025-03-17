package io.github.farrukhjon.experiment.java.dp.structural.composite.solution2;

public class Client {

    public static void main(String[] args) {

        SongComponent loveSongsGroup = new SongGroup("Loves", "Songs about loves story");
        loveSongsGroup.add(new Song("Sultoni qalbam", "Ahmad Zahir", 1975));
        loveSongsGroup.add(new Song("Be tu gulgashte chaman", "Ahmad Zahir", 1974));
        loveSongsGroup.add(new Song("Dili devona", "Ahmad Zahir", 1974));

        SongComponent lyricSongsGroup = new SongGroup("Liric", "Songs about liric");
        lyricSongsGroup.add(new Song("Man nadanistam as awal", "Ahmad Zahir", 1970));
        lyricSongsGroup.add(new Song("Ay Sorbon", "Ahmad Zahir", 1971));

        SongComponent allSongsAndGroups = new SongGroup("All", "All collection of Ahmad Zahir songs");
        allSongsAndGroups.add(loveSongsGroup);
        allSongsAndGroups.add(lyricSongsGroup);

        allSongsAndGroups.add(new Song("Ba osumon bigued", "Ahmad Zahir", 1970));
        allSongsAndGroups.add(new Song("Gufta budam", "Ahmad Zahir", 1970));
        allSongsAndGroups.add(new Song("Digar ashkam marez", "Ahmad Zahir", 1970));

        allSongsAndGroups.displaySongInfo();

        /*DiskAhmadZahir disk = new DiskAhmadZahir(allSongsAndGroups);
        disk.showSongList();*/
    }
}
