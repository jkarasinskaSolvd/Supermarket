package org.solvd;

public abstract class Dairy extends Food{
    private boolean LactoseFree;

    public Dairy() {
        super();
        LactoseFree = false;
    }

    public Dairy(double price, String description, String expirationDate, boolean LactoseFree) {
        super(price, description, expirationDate);
        this.LactoseFree = LactoseFree;
    }

    public boolean isLactoseFree() {
        return LactoseFree;
    }

    public void setLactoseFree(boolean lactoseFree) {
        LactoseFree = lactoseFree;
    }
}
