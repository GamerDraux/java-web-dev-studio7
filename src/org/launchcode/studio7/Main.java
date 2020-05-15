package org.launchcode.studio7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        ArrayList<BaseDisc> discCollection =
                new ArrayList<>();

        CD cd1 = new CD("Jason Mraz: Waiting For My " +
                "Rocket to Come", 200, 15);
        CD cd2 = new CD("Meatloaf: Bat out of Hell", 200,
                10);
        DVD dvd1 = new DVD("Cloverfield", 4000,
                new ArrayList<>(Arrays.asList("Fight Scene", "Love Scene")));
        DVD dvd2 = new DVD("Star Wars", 4000,
                new ArrayList<>(Arrays.asList("Scene 1", "Scene 2", "Scene 3", "Scene 4")));
        discCollection.add(cd1);
        discCollection.add(cd2);
        discCollection.add(dvd1);
        discCollection.add(dvd2);

        for (BaseDisc disc : discCollection){
            System.out.println("*************************");
            System.out.println("Name: "+disc.getName());
            System.out.println("Capacity: "+disc.getCapacity());
            System.out.println("Type: "+disc.getType());
            if (disc instanceof DVD){
                System.out.println("Chapter List:" + ((DVD) disc).getChapterList());
            }
            if (disc instanceof CD){
                System.out.println("Track Count: "+((CD) disc).getTrackCount());
            }
            System.out.println("********************");
            System.out.println("\n");
        }

        System.out.println("Results of findTrack() for " +
                "dvd, then cd:");
        dvd1.findTrack();
        cd1.findTrack();

        System.out.println("\n");
        System.out.println("Results of play(); for dvd, " +
                "then cd: ");
        dvd2.play();
        cd2.play();
    }
}
