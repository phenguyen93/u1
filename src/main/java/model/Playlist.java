package model;

import interfaces.IPlaylist;
import interfaces.ISong;
import javafx.collections.ModifiableObservableListBase;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

public class Playlist extends ModifiableObservableListBase<ISong> implements IPlaylist {

    private ArrayList<Song> playlist = new  ArrayList<>();


    @Override
    public boolean addSong(ISong s) throws RemoteException {
        return false;
    }

    @Override
    public boolean deleteSong(ISong s) throws RemoteException {
        return false;
    }

    @Override
    public boolean deleteSongByID(long id) throws RemoteException {
        return false;
    }

    @Override
    public void setList(ArrayList<ISong> s) throws RemoteException {

    }

    @Override
    public ArrayList<ISong> getList() throws RemoteException {
        return null;
    }

    @Override
    public void clearPlaylist() throws RemoteException {

    }

    @Override
    public int sizeOfPlaylist() throws RemoteException {
        return 0;
    }

    @Override
    public ISong findSongByPath(String name) throws RemoteException {
        return null;
    }

    @Override
    public ISong findSongByID(long id) throws RemoteException {
        return null;
    }

    @Override
    public Iterator<ISong> iterator() {
        return null;
    }

    @Override
    public ISong get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    protected void doAdd(int index, ISong element) {

    }

    @Override
    protected ISong doSet(int index, ISong element) {
        return null;
    }

    @Override
    protected ISong doRemove(int index) {
        return null;
    }
}
