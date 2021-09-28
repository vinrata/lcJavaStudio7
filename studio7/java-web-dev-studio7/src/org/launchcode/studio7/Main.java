package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){


        CD myCD = new CD();
        DVD myDvd = new DVD("2021 home videos");
        // TODO: Declare and initialize a CD and a DVD object.
        myCD.spinDisc();
        myDvd.spinDisc();
        myCD.writeData("WRITTEN DATA");
        System.out.println(myCD.readData());
        // TODO: Call each CD and DVD method to verify
        //  that they work as expected.

    }
}
