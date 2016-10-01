package the.com.poker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class Poker implements Comparable<Poker>{
	public List<Poker> pokers;
	
	public String huase;
	public String shuzi;
	public Poker(){}
	public Poker(String huase,String shuzi){
		this.huase=huase;
		this.shuzi=shuzi;
		
		
	}
	public void add(){
		pokers = new ArrayList<Poker>();
		 Poker p=new Poker("ºìÌÒ","1");Poker p2=new Poker("ºìÌÒ","2");Poker p3=new Poker("ºÚÌÒ","1");Poker p4=new Poker("·½Æ¬","1");
		 Poker p6=new Poker("·½Æ¬","2");Poker p5=new Poker("ºÚÌÒ","2");

		 pokers.add(p);
		 pokers.add(p2);
		 pokers.add(p3);
		 pokers.add(p4);
		 pokers.add(p5);
		 pokers.add(p6);
		 
		for(Poker pp:pokers){
			System.out.println(pp.huase+pp.shuzi);
		}
		
	}
	@Override
	public int compareTo(Poker o) {
		
		// TODO Auto-generated method stub
		return 0;
	}
} 
class Player {
	public String name;
	public List<Poker> playerpoker;
	public Player(){}
	public Player(String name){
		this.name=name;
		
		
	}
	

	
	
	public void add01(){
		Poker p=new Poker();
		p.add();
		Player p1=new Player();
		this.playerpoker= new ArrayList<Poker>();
		//Ëæ»ú·ÖÅÆ
		Random ra=new Random();
		Integer k;
		Integer k1;
		k=ra.nextInt(6);
		k1=ra.nextInt(6);
		Poker p0=p.pokers.get(k);
		Poker pp0=p.pokers.get(k1);
		System.out.println("Tom"+this.playerpoker.add(p0));
		System.out.println("Jack"+this.playerpoker.add(pp0));
		for(Poker pp:this.playerpoker){
			System.out.println(pp.huase+pp.shuzi);
		}
		
		
	}
//	public void compare01(){
//		
//		this.playerpoker= new ArrayList<Poker>();
//		Collections.sort(this.playerpoker);
//		for(Poker pp:this.playerpoker){
//			System.out.println("0"+pp.huase+pp.shuzi);
//		}
//	}
	
}


public  class PokerGame  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1=new Player();
		Poker p=new Poker();
		p1.add01();
		
		Collections.sort(p1.playerpoker);
		for(Poker pp:p1.playerpoker){
		System.out.println(pp.huase+pp.shuzi);
		}
	}
	
}
