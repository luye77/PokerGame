
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
		//�����ǰ������ͨ��˫�Ⱥ��ж���ȣ�������������һ�����
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Poker))
			return false;
		//����ߵ���˵��obj��Ϊ�գ�����Ҳ��course����
		//��objǿ��ת��Ϊcourse
		Poker other = (Poker) obj;
		//�жϵ�ǰ�����Ƿ�Ϊ�գ���Ϊ�շ���true
		if (this.color == null) {
			if (other.color == null)
				return true;
			else
				return false;
		} else {
			//�ж�name�Ƿ����
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
			
			if(this.getColor().equals("����"))
				return 1;
			else
				return -1;		
		}
		return i;
	}
}
