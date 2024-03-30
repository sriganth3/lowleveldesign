package designpatterns;

import designpatterns.behavioral.chainofresponsibility.OrcKing;
import designpatterns.behavioral.chainofresponsibility.Request;
import designpatterns.behavioral.chainofresponsibility.RequestType;
import designpatterns.behavioral.command.Goblin;
import designpatterns.behavioral.command.Wizard;
import designpatterns.behavioral.iterator.Item;
import designpatterns.behavioral.iterator.ItemType;
import designpatterns.behavioral.iterator.Iterator;
import designpatterns.behavioral.iterator.TreasureChest;
import designpatterns.behavioral.mediator.ChatMediator;
import designpatterns.behavioral.mediator.ChatRoom;
import designpatterns.behavioral.mediator.User;
import designpatterns.behavioral.memento.Editor;
import designpatterns.behavioral.observer.Hobbit;
import designpatterns.behavioral.observer.Observer;
import designpatterns.behavioral.observer.Orc;
import designpatterns.behavioral.observer.Weather;
import designpatterns.behavioral.state.Phone;
import designpatterns.behavioral.strategy.AddStrategy;
import designpatterns.behavioral.strategy.Context;
import designpatterns.behavioral.strategy.SubtractStrategy;
import designpatterns.behavioral.templatemethod.ConcreteHouseBuilder;
import designpatterns.behavioral.templatemethod.HouseBuilder;
import designpatterns.behavioral.templatemethod.WoodenHouseBuilder;
import designpatterns.behavioral.mediator.ChatUser;
import designpatterns.behavioral.visitor.Commander;
import designpatterns.behavioral.visitor.CommanderVisitor;
import designpatterns.behavioral.visitor.Sergeant;
import designpatterns.behavioral.visitor.SergeantVisitor;
import designpatterns.behavioral.visitor.Solider;
import designpatterns.behavioral.visitor.SoliderVisitor;
import designpatterns.behavioral.visitor.Unit;
import designpatterns.common.Utils;

public class BehavioralPatternTest {


	public static void main(String[] args) {
		
		
		//Chain Of Responsibility Design Pattern
		Utils.header("Chain Of Responsibility Pattern");
		callChainOfResponsibility();
		
		
		//Command Design Pattern
		Utils.header("Command Pattern");
		callCommand();
		
		//Iterator Design Pattern
		Utils.header("Iterator Pattern");
		callIterator();
		
		
		//Mediator Design Pattern
		Utils.header("Mediator Pattern");
		callMediator();
		
		//Memento Design Pattern
		Utils.header("Memento Pattern");
		callMemento();
		
		//Observer Design Pattern
		Utils.header("Observer Pattern");
		callObserver();
		
		//State Design Pattern
		Utils.header("State Pattern");
		callState();
		
		//Strategy Design Pattern
		Utils.header("Strategy Pattern");
		callStrategy();		
		
		//Template Method Design Pattern
		Utils.header("Template Method Pattern");
		callTemplateMethod();
		
		//Visitor Method Design Pattern
		Utils.header("Visitor Pattern");
		callVisitor();
				
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
	
	/*
	 * Command Pattern
	 * 
	 */
	private static void callCommand() {
		Wizard wiz = new Wizard();
		Goblin goblin = new Goblin();
		
		goblin.printStatus();
		wiz.castSpell(goblin::changeSize);
		
		goblin.printStatus();
		wiz.castSpell(goblin::changeVisibility);
		
		goblin.printStatus();
		wiz.undoLastSpell();
		
		goblin.printStatus();
		wiz.undoLastSpell();
		
		goblin.printStatus();
		wiz.redoLastSpell();
		
		goblin.printStatus();
		wiz.redoLastSpell();
		
	}
	
	/*
	 * Iterator Pattern
	 * 
	 */
	private static void callIterator() {
		TreasureChest chest = new TreasureChest();
		Iterator<Item> iterator = chest.iterator(ItemType.ANY);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		System.out.println("Weapon Iterator");
		
		iterator = chest.iterator(ItemType.WEAPON);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
		
	}
	
	/*
	 * Mediator Pattern
	 * 
	 */
	private static void callMediator() {
		ChatMediator chatRoom = new ChatRoom();
		
		User user1 = new ChatUser("Bob", chatRoom);
		User user2 = new ChatUser("Alice", chatRoom);
		
		chatRoom.addMember(user1);
		chatRoom.addMember(user2);
		
		user1.send("Hi Alice!");
		user1.send("Hi Bob!");
		
	}
	
	/*
	 * Memento Pattern
	 * 
	 */
	private static void callMemento() {
		Editor editor = new Editor();
		
		editor.write("Hello! ");
		editor.write("How are you?");
		editor.undo();
		editor.undo();
		editor.undo();
		
	}
	
	/*
	 * Observer Pattern
	 * 
	 */
	private static void callObserver() {
		Weather weather = new Weather();
		
		Observer hobbit = new Hobbit();
		weather.addSubscribers(hobbit);
		weather.timePasses();
		
		Observer orc = new Orc();
		weather.timePasses();
		weather.addSubscribers(orc);
		weather.timePasses();
		weather.timePasses();
		weather.removeSubscribers(hobbit);
		weather.timePasses();
		
	}
	
	/*
	 * State Pattern
	 * 
	 */
	private static void callState() {
		Phone phone = new Phone();
		
		System.out.println(phone.onClickHome());
		System.out.println(phone.onClickHome());
		System.out.println(phone.onClickPower());
		System.out.println(phone.onClickPower());
		System.out.println(phone.onClickPower());
		System.out.println(phone.onClickHome());
		System.out.println(phone.onClickHome());
		System.out.println(phone.onClickHome());
		
	}
	
	
	/*
	 * Strategy Pattern
	 * 
	 */
	private static void callStrategy() {
		
		Context context = new Context(new AddStrategy());
		System.out.println("Result of addition: " + context.executeStrategy(15, 9));
		
		context = new Context(new SubtractStrategy());
		System.out.println("Result of subtraction: " + context.executeStrategy(15, 9));
		
	}
	
	/*
	 * Template Method Pattern
	 * 
	 */
	private static void callTemplateMethod() {
		HouseBuilder house = new ConcreteHouseBuilder();
		house.build();
		
		house = new WoodenHouseBuilder();
		house.build();
	}
	
	/*
	 * Visitor Pattern
	 * 
	 */
	
	private static void callVisitor() {
		Unit unit = new Commander(new Sergeant(new Solider(), new Solider()), new Sergeant(new Solider(), new Solider()));
		unit.accept(new CommanderVisitor());
		unit.accept(new SergeantVisitor());
		unit.accept(new SoliderVisitor());
		
	}
}
