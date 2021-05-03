package com.company.DataDomain;

public class Door {
    private boolean isDoorOpen = false;

    public void isOpen(boolean isOpen) {
        isDoorOpen = isOpen;
        if (isOpen) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }
}
