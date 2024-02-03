package designpatterns.abstractfactory;

public abstract class Gadget {
	
	private String type;
	
    public Gadget(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public abstract String getModel();

}
