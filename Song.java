package realWorldPrograms;

public class Song {
 String title;
 double duration;
 
 public Song(String title, double duration) {
	this.title = title;
	this.duration = duration;
}
public Song() {
	// TODO Auto-generated constructor stub
}

 public String getTitle() {
	return title;
}

public double getDuration() {
	return duration;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Songs{" + "title:'"+title +'\''+", duration="+ duration+'}';
	}
}
