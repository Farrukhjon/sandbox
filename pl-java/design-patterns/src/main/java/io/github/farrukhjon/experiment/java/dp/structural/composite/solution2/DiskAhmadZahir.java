package io.github.farrukhjon.experiment.java.dp.structural.composite.solution2;

public class DiskAhmadZahir {

    private SongComponent songList;

    public DiskAhmadZahir(SongComponent songList) {
        this.songList = songList;
    }

    public void showSongList() {
        songList.displaySongInfo();
    }

}
