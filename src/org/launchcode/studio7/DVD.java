package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{
    private final String aType="DVD";
    private final ArrayList<String> chapterList;

    public DVD(String aName, double aCapacity,
               ArrayList<String> aChapterList){
        super(aName, aCapacity);
        this.type=aType;
        this.chapterList=aChapterList;
    }

    public ArrayList<String> getChapterList() {
        return chapterList;
    }

    @Override
    public void spinDisc() {
        System.out.println("Whirr");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding");
    }

    @Override
    public void play() {
        System.out.println("Playing Movie");
    }

    @Override
    public void findTrack() {
        System.out.println("Select Chapter");
    }
}
