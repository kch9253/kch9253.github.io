package DB;

import java.io.InputStream;
 
public class Album {
 
    private int id;
    private String name;
    private String date;
    private String singer;
    private String title;
    private String genre;
    private String picName;
    private InputStream picture;
    private int picLength;
    private String musicName;
    private InputStream music;
    private int musicLength;
    
    public String getMusicName() {
        return musicName;
    }
    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }
    public InputStream getMusic() {
        return music;
    }
    public void setMusic(InputStream music) {
        this.music = music;
    }
    public int getMusicLength() {
        return musicLength;
    }
    public void setMusicLength(int musicLength) {
        this.musicLength = musicLength;
    }
    public String getPicName() {
        return picName;
    }
    public void setPicName(String picName) {
        this.picName = picName;
    }
    public int getPicLength() {
        return picLength;
    }
    public void setPicLength(int picLength) {
        this.picLength = picLength;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public InputStream getPicture() {
        return picture;
	}
	public void setPicture(InputStream picture) {
		this.picture = picture;
    }


}
