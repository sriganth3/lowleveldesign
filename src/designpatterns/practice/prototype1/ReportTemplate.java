package designpatterns.practice.prototype1;

public class ReportTemplate implements Cloneable {

	private static volatile ReportTemplate instance;
	
	private ReportTemplate() {
		
	}
	
	private String header;
	private String footer;
	private String content;
	
	public static ReportTemplate getInstance() {
		if(instance == null) {
			synchronized(ReportTemplate.class){
				if(instance == null) {
					instance = new ReportTemplate();
					instance.setContent("Content");
					instance.setHeader("Report Template");
					instance.setFooter("Confidential");
				}
			}
		}
		return instance;
	}
	
	@Override
	public ReportTemplate clone() {
		try {
			return (ReportTemplate) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ReportTemplate [header=" + header + ", footer=" + footer + ", content=" + content + "]";
	}

	
	
}

