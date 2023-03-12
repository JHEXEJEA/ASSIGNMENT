package chetana;

import java.util.ArrayList;

public class Music {

	public static void main(String[] args) {
		
		ArrayList<String>song=new ArrayList<String>();
		System.out.println("Is song list empty:"+song);
		
		
		song.add(" dil chahata hai");
		song.add(" hum hai rahi pyar ke");
		song.add(" sathiya");
		song.add(" dost dost");
		// TODO Auto-generated method stub
		System.out.println("song list is:"+song);
		   song.add(2,"dil ka rishta");
			   System.out.println("updated song list is :"+song);
			   System.out.println("size of song list :"+song.size());
			   System.out.println("first song in list :"+song.get(0));
			   
			   String LastSong= song.get(song.size()-1);
			   System.out.println("Last song in list empty:"+ LastSong);
			   
			   
			   song.remove("sathiya");
			   System.out.println("size of song list :"+song.size());
			   song.remove(1);
			   System.out.println("size of song list :"+song.size());
	}

}
