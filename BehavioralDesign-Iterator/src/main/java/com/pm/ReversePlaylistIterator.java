package com.pm;

import java.util.List;

public class ReversePlaylistIterator implements Iterator<String> {
    private List<String> songs;
    private int index = 0;
    public ReversePlaylistIterator(Playlist playlist) {
        this.songs = playlist.getSongs();
        this.index = songs.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index>=0;
    }

    @Override
    public String next() {
        return songs.get(index--);
    }
}
