package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
   private final String aType = "CD";
   private final int trackCount;

    public CD(String aName, double aCapacity,
              int aTrackCount) {
        super(aName, aCapacity);
        this.type = aType;
        this.trackCount = aTrackCount;
    }

    public String getaType() {
        return aType;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public void spinDisc() {
        System.out.println("Buzzzzzzz..");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding");
    }

    @Override
    public void play() {
        System.out.println("Music Plays");

    }

    @Override
    public void findTrack() {
        System.out.println("Select Song");
    }

}
