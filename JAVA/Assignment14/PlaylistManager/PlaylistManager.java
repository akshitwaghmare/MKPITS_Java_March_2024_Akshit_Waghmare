package PlaylistManager;

import java.util.LinkedList;
import java.util.Scanner;

public class PlaylistManager {
    LinkedList<Playlist> playlist = new LinkedList<>();

    public void addSong(int songID,String title,String artist){
        playlist.add(new Playlist(songID,title,artist));
    }
    public void removeSong(String removesong){
        if(playlist.contains(removesong)){
            playlist.remove(removesong);
            System.out.println("Song Removed Successfully");
        }
        else
            System.out.println("Song Not Exists");
    }
    public Playlist searchsong(int ID){
        for(Playlist play : playlist){
            if(play.getSongID() == ID){
                return play;
            }
        }
        return null;
    }
    public void displaysongs(){
        System.out.println("PlayList Bollywood : ");
        for (Playlist playlist1 : playlist){
            System.out.println(playlist1);
        }
    }

    public static void main(String[] args) {
        PlaylistManager playlistManager = new PlaylistManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("PLAYLIST MANAGER");
            System.out.println("1-Add Song");
            System.out.println("2-Remove Song");
            System.out.println("3-Search Song");
            System.out.println("4-Display All Song");
            System.out.println("5-EXIT");

            System.out.println("Enter Choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Song ID");
                    int id = scanner.nextInt();
                    System.out.print("Enter Song Title Name : ");
                    String title = scanner.next();
                    System.out.print("Enter Song Artist Name: ");
                    String artist = scanner.next();
                    playlistManager.addSong(id,title,artist);
                    break;
                case 2:
                    System.out.println("Enter Song Name To Remove");
                    String removesong = scanner.next();
                    playlistManager.removeSong(removesong);
                    break;
                case 3:
                    System.out.println("Enter Song ID to Search");
                    int ID = scanner.nextInt();
                    playlistManager.searchsong(ID);
                    break;
                case 4:
                    playlistManager.displaysongs();
                case 5:
                    System.out.println("EXITING");
                    return;

            }
        }
    }
}
