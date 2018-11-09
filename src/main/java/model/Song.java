package model;

import interfaces.ISong;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class Song implements ISong {

    private long id;
    private SimpleStringProperty pfad= new SimpleStringProperty();
    private SimpleStringProperty titel = new SimpleStringProperty();
    private SimpleStringProperty album = new SimpleStringProperty();

    public Song(){

    }



    @Override
    public String getAlbum() {
        return album.getValue();
    }

    @Override
    public void setAlbum(String album) {
        this.album.setValue(album);
    }

    @Override
    public String getInterpret() {
        return null;
    }

    @Override
    public void setInterpret(String interpret) {

    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void setPath(String path) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {

    }

    @Override
    public ObservableValue<String> pathProperty() {
        return null;
    }

    @Override
    public ObservableValue<String> albumProperty() {
        return null;
    }

    @Override
    public ObservableValue<String> interpretProperty() {
        return null;
    }

    @Override
    public ObservableValue<String> titleProperty() {
        return null;
    }
}
