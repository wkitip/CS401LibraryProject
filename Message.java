import java.io.Serializable;

public class Message implements Serializable {
	private final String incomingString;
	private final String outgoingString;
	Member member;
	Item item;
	Location loc;
	
	public Message() {
		incomingString = "Undefined";
		outgoingString = "Undefined";
		member = null;
		item = null;
		loc = null;
	}
	
	public Member(String s, Member m, Item i, Location l) {
		
	}
	
}
