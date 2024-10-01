package practice.adapter1;

public class MP3 implements Media{

	private String name;
	private String audio;
	
	public MP3(String name, String audio) {
		super();
		this.name = name;
		this.audio = audio;
	}
	
	public MP3() {
		
	}

	public String getName() {
		return name;
	}
	
	public String getAudio() {
		return audio;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
}
