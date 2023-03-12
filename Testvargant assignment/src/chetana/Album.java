package chetana;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Album {
	
		private static final String title = null;
		private String name;
		private String artist;
		private ArrayList<Song> songs;
		
		public Album(String name,String artist,ArrayList<String> songs) {
			this.name= name;
			this.artist=artist;
			this.songs=new ArrayList<Song>();
		}
	     public Album() {
	    	 
}
          
			// TODO Auto-generated constructor stub
		
		public Song findSong(String title){ 
        	 for (Song checkedSong:songs) {
        		 if (checkedSong.gettitled().equals(title))return checkedSong;
        	 }
			return null;
         }
	 	public boolean addSong(String tittle,double duration) {
	     	
	 		if(findSong(title)==null) {
	     		songs.add( new Song(title,duration));
	     		System.out.println(title +"successfully added to the List");
	          return true;
	     	}
	 		else { 
	 			System.out.println("Song with name"+title+"already exist in the List");
	 			return false; 
	 		}
	 	}  
	     
			// TODO Auto-generated method stub
			
		
		public boolean addToPlayList( int trackNumber,LinkedList<Song> PlayList) {
	 	   int index = trackNumber-1;
	 	    if (index > 0 && index <= this.songs.size()) {
	 	    	PlayList.add(this.songs.get( index));
	 	     return true;
	 	    }
	 	    System.out.println("this album does not have song with tracknumber"+trackNumber);
	 	
	 	    return false;
		}
	 	 public boolean addToPlayList(String title,LinkedList<Song>PlayList) { 
	 		 for(Song checkedSong: this.songs) {
	 			 if (((Song) checkedSong).gettitled().equals(title));
	 		
}
	 		 
	 		 
	 		 
	 		 
	 		 
	System.out.println( title+" there is no such song in album");
	return false;
	 		 
	 	 }		 
	 	 }