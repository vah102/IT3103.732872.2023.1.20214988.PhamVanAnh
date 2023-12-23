package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

import javax.swing.*;
import java.util.Objects;

public class Track implements Playable{
    private String title;
    private int length;

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Constructors
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() throws PlayerException {
        // TODO Auto-generated method stub
        if (this.getLength() > 0) {
            JDialog dialog = new JDialog();
            dialog.setSize(300, 200);

            // create Label
            JLabel text = new JLabel("Track - Title : " + this.getTitle() + " Length : " + this.getLength());
            dialog.add(text);
            dialog.setTitle("Play Track");
            dialog.setVisible(true);
        } else
            throw new PlayerException("ERROR : Track length is non-positive");
    }

    @Override
    public boolean equals(Object o) {
        Track tmp = (Track)o;
        return Objects.equals(this.getTitle(), tmp.getTitle()) && this.getLength() == tmp.getLength();
    }
}