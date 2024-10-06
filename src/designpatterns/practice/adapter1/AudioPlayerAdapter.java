package designpatterns.practice.adapter1;

public class AudioPlayerAdapter{

	public AudioPlayerAdapter() {
		super();
	}

	public MP3 convertToMP3(Media media) {
		return new MP3(media.getName(),media.getAudio());
	}



}
