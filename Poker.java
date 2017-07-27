
public class Poker implements Comparable<Poker>{

	private String color;
	private Integer card;
	private int id;
	
	public Poker() {
		
	}
	public Poker(String color, Integer card, int id) {
		super();
		this.color = color;
		this.card = card;
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getCard() {
		return card;
	}
	public void setCard(Integer card) {
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		//如果当前对象能通过双等号判断相等，则这两个对象一定相等
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Poker))
			return false;
		//如果走到这说明obj不为空，而且也是course类型
		//将obj强制转换为course
		Poker other = (Poker) obj;
		//判断当前名字是否为空，都为空返回true
		if (this.color == null) {
			if (other.color == null)
				return true;
			else
				return false;
		} else {
			//判断name是否相等
			if (this.color.equals(other.color))
				return true;
			else
				return false;
		}
	}
	@Override
	public int compareTo(Poker o) {
		int i=0;
		if(this.getCard()<o.getCard())
			return i=-1;
		if(this.getCard()>o.getCard())
			return i=1;
		if(this.getCard()==o.getCard()){
			
			if(this.getColor().equals("红桃"))
				return 1;
			else
				return -1;		
		}
		return i;
	}
}
