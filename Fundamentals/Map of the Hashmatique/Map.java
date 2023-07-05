import java.util.*;

class map {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        
        trackList.put("Song1", "Lyrics1");
        trackList.put("Song2", "Lyrics2");
        trackList.put("Song3", "Lyrics3");
        trackList.put("Song4", "Lyrics4");

        String song = trackList.get("Song1");
        System.out.println(song);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}