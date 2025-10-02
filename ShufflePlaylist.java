/*
Name: Madeline Puryear
Date: 10/2/25
Description: Shuffles an array of 7 songs then displays them
*/

import java.lang.Math;

public class ShufflePlaylist {

    public static void shuffle(String[] playlist){ // Shuffle

        int[] order = {1,2,3,4,5,6,7};

        for(int i = 0; i < playlist.length;i++) {
            int j = (int)Math.random() * playlist.length;

            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }

        System.out.println("Shuffled Playlist:");
        int count = 0;
        for(String song : playlist){
            count++;
            System.out.println(count + ". " + song);
        }
    }

    public static void main(String[] args) {

        String[] Slaylist = {"Shake it Off - Taylor Swift","I Love You - Barney","Baby Shark - Pinkfong","Never gonna give you up - Rick Astley","Axel F (Crazy Frog) - Crazy Frog", "Gangnam Style - PSY", "What Does the Fox Say? - Ylvis"};
        shuffle(Slaylist);




    }

}
