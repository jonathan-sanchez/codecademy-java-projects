import java.util.ArrayList;

public class Playlist {
    
    public static void main(String[] args) {
        
        //Creating a new ArrayList
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // adding songs to playlist
        desertIslandPlaylist.add("War pigs - Black Sabbath");
        desertIslandPlaylist.add("Holy Diver - Dio");
        desertIslandPlaylist.add("Master Exploder - Tenacious D");
        desertIslandPlaylist.add("Sadistic Magician - Municipal Waste");
        desertIslandPlaylist.add("Enemy - Imagine Dragons");
        desertIslandPlaylist.add("Antivist - Bring me the Horizon");
        desertIslandPlaylist.add("I've just seen a face - The Beatles");
        desertIslandPlaylist.add("In these streets - Zro");
        desertIslandPlaylist.add("Wait - Maroon 5");
        desertIslandPlaylist.add("Earth - Lil Dicky");
        
        // printing playlist
        // System.out.println(desertIslandPlaylist);
        
        // checking playlist size
        // System.out.println(desertIslandPlaylist.size());
        
        // removing songs
        desertIslandPlaylist.remove("Sadistic Magician - Municipal Waste");
        desertIslandPlaylist.remove("I've just seen a face - The Beatles");
        desertIslandPlaylist.remove("Antivist - Bring me the Horizon");
        desertIslandPlaylist.remove("Wait - Maroon 5");
        desertIslandPlaylist.remove("Earth - Lil Dicky");

        // System.out.println(desertIslandPlaylist);
        // System.out.println(desertIslandPlaylist.size());

        // Swapping Songs
        int indexA = desertIslandPlaylist.indexOf("Holy Diver - Dio");
        int indexB = desertIslandPlaylist.indexOf("Master Exploder - Tenacious D");

        String tempA = "Holy Diver - Dio";

        desertIslandPlaylist.set(indexA, "Master Exploder - Tenacious D");
        // System.out.println(desertIslandPlaylist);  
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);  
    }
}
