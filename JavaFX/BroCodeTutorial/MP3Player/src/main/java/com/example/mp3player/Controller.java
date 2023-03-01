package com.example.mp3player;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {

    @FXML
    private Pane mainPane;

    @FXML
    private Label lblSongTitle;

    @FXML
    private ProgressBar songProgressBar;

    @FXML
    private Button btnPlay, btnPause, getBtnReset, getBtnPrevious, getBtnNext;

    @FXML
    private ComboBox cbSpeed;

    @FXML
    private Slider slideVolume;

    private Media media;
    private MediaPlayer mediaPlayer;

    private File directory;
    private File[] files;
    private ArrayList<File> songs;
    private int songNumber;
    private int[] speeds = {25, 50, 75, 100, 125, 150, 170, 200};
    private Timer timer;
    private TimerTask task;
    private boolean running;

    public void play() {
        System.out.println("Play");
        beginTimer();
        speed(null);
        mediaPlayer.play();
    }

    public void pause() {
        System.out.println("Pause");
        cancelTimer();
        mediaPlayer.pause();
    }

    public void reset() {
        System.out.println("Reset");
        songProgressBar.setProgress(0);
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            mediaPlayer.seek(Duration.seconds(0.0));
        }
    }

    public void previous() {
        System.out.println("Previous");
        if(songNumber < songs.size() - 1) {
            songNumber--;
        } else {
            songNumber = songs.size() - 1;
        }
        mediaPlayer.stop();
        if(running) {
            cancelTimer();
        }
        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        lblSongTitle.setText(songs.get(songNumber).getName());
        play();
    }

    public void next() {
        System.out.println("Next");
        if(songNumber < songs.size() - 1) {
            songNumber++;
        } else {
            songNumber = 0;
        }
        mediaPlayer.stop();
        if(running) {
            cancelTimer();
        }
        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        lblSongTitle.setText(songs.get(songNumber).getName());
        play();
    }

    public void speed(Event event) {
        System.out.println("Speed");
        if(cbSpeed.getValue() == null) {
            mediaPlayer.setRate(1);
        } else {
            mediaPlayer.setRate(Integer.parseInt((String) cbSpeed.getValue()) * 0.01);
        }
    }

    public void beginTimer() {
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                running = true;
                double current = mediaPlayer.getCurrentTime().toSeconds();
                double end = media.getDuration().toSeconds();
                System.out.println(current/end);
                songProgressBar.setProgress(current/end);
                if(current/end == 1) {
                    cancelTimer();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public void cancelTimer() {
        running = false;
        timer.cancel();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        songs = new ArrayList<File>();
        directory = new File("music");
        files = directory.listFiles();
        if(files != null) {
            for(File file : files) {
                songs.add(file);
//                System.out.println("File: " + file);
            }
        } else {
            lblSongTitle.setText("No songs found in the 'Music' folder");
        }
        System.out.println(songs.get(songNumber).toURI().toString());
        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        lblSongTitle.setText(songs.get(songNumber).getName());
        for(int i = 0; i < speeds.length; i++) {
//            System.out.println(speeds[i]);
            cbSpeed.getItems().add(Integer.toString(speeds[i]));
        }
        cbSpeed.setOnAction(this::speed);

        slideVolume.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                mediaPlayer.setVolume(slideVolume.getValue() * 0.01);
            }
        });
        songProgressBar.setStyle("-fx-accent: #0000FF");
    }

}