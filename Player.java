import java.util.ArrayList;


public class Player {

	private String name;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private ArrayList<Poker> inHandList=null;
	public Player(){}
	public Player(String name) {
		super();
		this.name = name;
	}
	public Player(String name,ArrayList<Poker> inHandList){
		this.inHandList=inHandList;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Poker> getInHandList() {
		return inHandList;
	}
	public void setInHandList(ArrayList<Poker> inHandList) {
		this.inHandList = inHandList;
	} 
}
