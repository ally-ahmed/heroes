import java.util.*;
public class Squad{
	private String mName;
	private static List<Squad> instances = new ArrayList<Squad>();
	private int mId;
	private List<Hero> mHeroes;
	private String mCause;
	private int mMax;
	
	public Squad(String name, String cause){
		mName = name;
		mCause = cause;
		instances.add(this);
		mId = instances.size();
		mHeroes = new ArrayList<Hero>();
		mMax=4;
	}
	
	public String getName(){
		return  mName;
	}
	
	public static List<Squad> all(){
		return instances;
	}
	
	public static void clear(){
		instances.clear();
	}
	
	public int getId(){
		return mId;
	}
	
	public List<Hero> getHeroes(){
		return mHeroes;
	}
	
	public String getCause(){
		return mCause;
	}
	
	public static Squad find(int id){
		return instances.get(id - 1);
	}
	
	public void addHero(Hero hero){
		mHeroes.add(hero);
	}
	
	public boolean Check(){
		return mMax!= mHeroes.size();
	}
	

	
	
}