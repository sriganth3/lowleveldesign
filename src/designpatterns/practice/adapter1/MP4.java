package designpatterns.practice.adapter1;

public class MP4 implements Media {

	private String name;
	private AV av;
	
	public MP4(String name, AV av) {
		super();
		this.name = name;
		this.av = av;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getAudio() {
		return av == null ? null : av.getAudio();
	}
	
	
}
