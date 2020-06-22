package com.example.nukeseeker;

public class Mine {

    private boolean revealed = false;
    private boolean present = false;

    public Mine(boolean revealed, boolean present) {
        this.revealed = revealed;
        this.present = present;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
    //ALT + INSERT
    public void populateMine(){

    }
}
