package realWorldPrograms;

import java.util.ArrayList;

import java.util.LinkedList;

public class Album {
     private String name;
      private String  artist;
	  private ArrayList<Song> song;
	  
	  
public Album(String name, String artist) {
		
		this.name = name;
		this.artist = artist;
		this.song = new ArrayList<Song>();
	}

public Album() {
	
}

public Song findSong(String title) {
	for(Song checkedSongs:song) {
	if(checkedSongs.getTitle().equals(title))return  checkedSongs;
	}
	return null;
	}
		
public boolean addSong(String title,double duration) {
	if (findSong(title)==null) {
		song.add(new Song(title,duration));
	//	System.out.println(title +" Successfully added to the list");
		return true;
	}

else {
	//System.out.println("Songs with name"+title+" already exist");
	return false;
}
}
public  boolean addToPlayList(int trackNumber,LinkedList<Song>PlayList) {
	int index=trackNumber-1;
	if(index > 0 && index <= this.song.size()) {
		PlayList.add(this.song.get(index));
		return true;
		
	}
	//System.out.println("This Album does not have song with that trackNumber"+trackNumber);
	return false;
}
public boolean addToPlayList(String title,LinkedList<Song>Playlist) {
	for(Song checkedSongs:this.song) {
		if(checkedSongs.getTitle().equals(title)) {
			Playlist.add(checkedSongs);
			return true;
		}
	}
	//System.out.println(title+"There is no such song in album");
	return false;
}


}

 

 






	