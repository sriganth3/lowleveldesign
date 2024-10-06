package designpatterns.practice.adapter1;

public class AudioPlayer {

	public void play(MP3 mp3) {
		System.out.println("Playing music from : " + mp3.getName());
		System.out.println("Music : " + mp3.getAudio());
	}
}
