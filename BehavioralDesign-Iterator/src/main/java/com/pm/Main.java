package com.pm;

/**
 * TIP The Iterator Design Pattern is a behavioral pattern that provides a standard way to access elements of a collection sequentially without exposing its internal structure.
 * Problem: Implement a ReversePlaylistIterator that traverses the playlist from the last song to the first.
 * Requirements:
 * Implement the Iterator interface (or BookIterator if using the library example)
 * Start from the last element and move backward
 * The existing Playlist and forward PlaylistIterator must not be modified
 */
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Shape of You");
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Blinding Lights");

        ReversePlaylistIterator reverse = new ReversePlaylistIterator(playlist);
        System.out.println("Reverse Playlist:");
        while (reverse.hasNext()) {
            System.out.println("  " + reverse.next());
        }
    }
}