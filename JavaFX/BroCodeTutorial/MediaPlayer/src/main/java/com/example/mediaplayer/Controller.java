package com.example.mediaplayer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnPause;

    @FXML
    private Button btnReset;

    @FXML
    private MediaView myMediaView;

    @FXML
    private Label statusLabel;

    private File file;
    private Media myMedia;
    private MediaPlayer myMediaPlayer;

    public void playMedia() {
        myMediaPlayer.play();
        statusLabel.setText("Playing");
        System.out.println(myMediaPlayer.getStatus());
    }

    public void pauseMedia() {
        myMediaPlayer.pause();
        System.out.println(myMediaPlayer.getStatus());
        statusLabel.setText("Paused");
    }

    public void resetMedia() {
        System.out.println(myMediaPlayer.getStatus());
        if (myMediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            myMediaPlayer.seek(Duration.seconds(0.0));
            statusLabel.setText("Reset");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("TreeShake.MP4");
        myMedia = new Media(file.toURI().toString());
        myMediaPlayer = new MediaPlayer(myMedia);
        myMediaView.setMediaPlayer(myMediaPlayer);
    }
}