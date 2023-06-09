package org.example;

import com.github.kilianB.apis.googleTextToSpeech.GLanguage;
import com.github.kilianB.apis.googleTextToSpeech.GoogleTextToSpeech;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Path to output mp3 directory
        String outputPath = "mpFiles/";
        //Text to convert to mp3
        String text = "Senha 9 dirija-se ao atendimento.";
        //Create directory
        File outputDirectory = new File(outputPath);
        outputDirectory.mkdirs();
        //Non blocking method. Call event handler in the observer upon finishing
        boolean deleteTemporaryFiles = true;
        //Create an mp3 player to playback the final result
        SimpleMP3Player mp3Player = new SimpleMP3Player();
        GoogleTextToSpeech tts = new GoogleTextToSpeech(outputPath);
        tts.convertTextAsynch(text,GLanguage.Portuguese_Brazil, "FileNameAsynch",deleteTemporaryFiles,mp3Player);
    }


}