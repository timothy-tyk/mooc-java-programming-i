
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object toCompare){
        if(this == toCompare){
            return true;
        }
        if(!(toCompare instanceof Song)){
            return false;
        }
        Song comparedSong = (Song)toCompare;
        if(comparedSong.artist == this.artist && comparedSong.name==this.name && comparedSong.durationInSeconds==this.durationInSeconds){
            return true;
        }
        return false;
    }


}
