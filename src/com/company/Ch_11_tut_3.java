package com.company;
// ------------------------------------- Interfaces Example & Default Methods --------------------------------- //
public class Ch_11_tut_3 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }
//     used when u don't want to add interface function in every extended class. u can declare it here and all extend class will use
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class MyCellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling to "+ PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting to........");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

//    @Override
//    public void record4KVideo() {
//        System.out.println("Recording 4k Video with snap");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List Of Networks");
        String[] networkList = {"Harry", "Nirdesh", "Akash", "JioFi"};
        return networkList;
    }

    @Override
    public void connectToNetworks(String network) {
        System.out.println("Connecting to "+ network);
    }
}
