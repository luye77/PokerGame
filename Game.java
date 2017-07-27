import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Game {

	public static ArrayList<Poker> pokerList=new ArrayList<Poker>();
	public static ArrayList<Poker> newPokers=new ArrayList<Poker>();
	
	public static ArrayList<Poker> clist=new ArrayList<Poker>();
	public static ArrayList<Poker> slist=new ArrayList<Poker>();
	
	public static ArrayList<Poker> list=new ArrayList<Poker>();
	public static ArrayList<Poker> list1=new ArrayList<Poker>();
	
	public static ArrayList<Player> playerList=new ArrayList<Player>();
	public static ArrayList<Player> newPlayer=new ArrayList<Player>();
	
	public static ArrayList<Player> plist=new ArrayList<Player>();
	public static ArrayList<Player> dlist=new ArrayList<Player>();
	public Player player=new Player();
	public ArrayList<Poker> createPoker(){
		int i=1;
		int a=1;
		int b=1;
		int c=1;
		int d=1;
		while(i<41){
			if(i>0&&i<=10){
				pokerList.add(new Poker("����",a++,i++));
			}
			if(i>10&&i<=20){
				pokerList.add(new Poker("����",b++,i++));
			}
			if(i>20&&i<=30){
				pokerList.add(new Poker("��Ƭ",c++,i++));
			}
			if(i>30&&i<=40){
				pokerList.add(new Poker("�ݻ�",d++,i++));
			}
		}
		System.out.println("�˿˴����ɹ�"+pokerList.size());
		for (Poker poker : pokerList) {
			System.out.println(poker.getId()+poker.getColor()+poker.getCard());
		}
		return pokerList;
	}
	public ArrayList<Player> createPlayer(){
		for(int i=1;i<=2;i++){
			System.out.println("����������");
			Scanner console=new Scanner(System.in);
			String name=console.next();
			playerList.add(new Player(name));
		}
		for (Player player : playerList) {
			System.out.println("���"+player.getName());
		}
		return playerList;
	}
	//ϴ��
	public ArrayList<Poker> shufflePoker(ArrayList<Poker> clist){
		int max=40;
        int min=1;
		Random random = new Random();
		for(int i=0;i<4;i++){
			int s = random.nextInt(max)%(max-min+1) + min;
			for (Poker poker : clist) {
				if(s==poker.getId()&&i<4){
					newPokers.add(poker);
				}		
			}
		}
		for (Poker poker : newPokers) {
			System.out.println(poker.getColor()+poker.getCard());
		}
		return newPokers;
	}
	//����
	public ArrayList<Player> dealPoker(ArrayList<Poker> slist,ArrayList<Player> plist){
		int flag=0;
		for (Player player : plist) {
			flag++;
			//һ��ѭ�����飬ѭ����һ��ʱ
			if(flag==1){
				for(int j=0;j<2;j++){
					list.add(slist.get(j));
				}
				newPlayer.add(new Player(player.getName(),list));				
			}
			//ѭ���ڶ���ʱ
			if(flag==2){
				for(int j=2;j<4;j++){
					list1.add(slist.get(j));
				}
				newPlayer.add(new Player(player.getName(),list1));				
			}
		}	
		System.out.println(newPlayer.size());
		for (Player player : newPlayer) {
			for (Poker poker : player.getInHandList()) {
				System.out.println(player.getName()+"��"+poker.getColor()+poker.getCard());
			}
		}
		return newPlayer;
	}
	//����
	public void compareMy(ArrayList<Poker> list,ArrayList<Player> dlist){
		//�����Ƚ�
		Collections.sort(list);
		//�����һ��
		for (Player player : dlist) {
			if(player.getInHandList().contains(list.get(0))){
				System.out.println(player.getName()+"��ʤ");
			}
		}
	}
	
	public static void main(String[] args) {
		Game game=new Game();
		clist=game.createPoker();
		plist=game.createPlayer();
		slist=game.shufflePoker(clist);
		dlist=game.dealPoker(slist, plist);
		game.compareMy(clist,dlist);
		

	}
}
