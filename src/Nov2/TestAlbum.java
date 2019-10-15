package Nov2;

class Song{
	private int duration;
	private String title;
	public Song(String title, int duration){
		this.duration = duration;
		this.title = title;
	}

	/**
	 * 
	 * @return the duration
	 * 
	 */

	public int getDuration(){
		return duration;
	}

	/**
	 * 
	 * @return the title
	 * 
	 */

	public String getTitle(){
		return title;
	}

	public String toString(){
		String res = title + ": ";
		int min = duration / 60;
		int seconds = duration % 60;
		if (seconds < 10){
			res += min + ":0" + seconds;
		}
		else{
			res += min + ":" + seconds;
		}
		return res;
	}

}
class Album{
	private Song songs[];
	private int numberOfSongs;
	private String title;
	public Album(String aTitle, int size) {
		super();
		title = aTitle;
		songs=new Song[size];
		numberOfSongs=0;
	}
	void addSong(Song s){
		songs[numberOfSongs++]=s;
	}
	int getDuration(){
		int sum=0;
		for(int i=0;i<numberOfSongs;i++)
			sum+=songs[i].getDuration();
		
		return sum;
	}
	public int getNumberOfSongs(){
		return numberOfSongs;
	}
	public int getSiz(){
		return songs.length;
	}
	public Song getSong(int i){
		return songs[i];
	}
	public String getTitle(){
		return title;
	}
}
public class TestAlbum {

}
