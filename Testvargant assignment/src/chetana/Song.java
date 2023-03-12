package chetana;

public class Song {
	String title ;
	double duration;
	
	public Song (String title, double duration ) {
		this. title = title ;
		this. duration = duration;
		
	}
public Song() {
		// TODO Auto-generated constructor stub
	}

	

public String gettitled() {
	return title;
	
}
public double getDuration() {
	return duration;
}	
	@Override
	public String toString() {
		return "Song{"+
	        "title"+ title + '\''+
	        ",duration"+duration+ 
	        '}';
	}

}
