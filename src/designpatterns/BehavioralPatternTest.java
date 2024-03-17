package designpatterns;

import designpatterns.behavioral.OrcKing;
import designpatterns.behavioral.Request;
import designpatterns.behavioral.RequestType;
import designpatterns.common.Utils;

public class BehavioralPatternTest {


	public static void main(String[] args) {
		
		
		//Chain Of Responsibility Design Pattern
		Utils.header("Chain Of Responsibility Pattern");
		callChainOfResponsibility();
	}
	
	/*
	 * Chain Of Responsibility Pattern
	 * 
	 */
	public static void callChainOfResponsibility() {
		OrcKing king = new OrcKing();
	    king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
	    king.makeRequest(new Request(RequestType.GAURD_PRISONERS, "gaurd prisoners"));
	    king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
	}
}
