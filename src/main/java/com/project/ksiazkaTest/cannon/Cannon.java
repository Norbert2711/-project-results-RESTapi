package com.project.ksiazkaTest.cannon;

public class Cannon {

    public boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public String toString() {
        return "Cannon{" +
                "loaded=" + loaded +
                '}';
    }

    public void fire() {

        if (loaded) {
            System.out.println("Cannon ready to fire! FIRE!");
        } else {
            System.out.println("Need ammo, reload the cannon!");
        }

    }



}
