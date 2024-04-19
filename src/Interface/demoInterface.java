package Interface;

/*
1) Interface is a group of related methods with empty bodies .
2) Interface contains only abstract methods with empty bodies & cannot have non-abstract methods with bodies.
     INTERFACE VS ABSTRACT
3) We can implement multiple parent interface to a class, but we cannot create a class with multiple parent abstract class
*/


interface Remote {

    void On();
    void Off();

    default void VolumeUp()
    {
        System.out.println("Increasing volume...");
    }
    //In interface we can write a default method and its body and use it any where;  if we override it in another class this method..
    // ... will not work but the overridden method will work.
    // default method is not compulsory to be implemented in below implemented classes .
}

class TataskyRemote implements Remote{

    @Override
    public void On() {
        System.out.println("Tv is Turned on ...");
        int button=1;
    }
    @Override
    public void Off() {
        System.out.println("Tv is Turned Off ...");
    }

    public void ChannelChange(){
        System.out.println("channel has been changed :) ");
    }

    public void VolumeUp()
    {
        System.out.println("Increasing volume..........");
    }
}

class AcRemote implements Remote{

    @Override
    public void On() {
        System.out.println("Ac is Turned On ..");
    }

    @Override
    public void Off() {
        System.out.println("Ac is Turned Off ..");
    }

    public void IncreaseTemp(){
        System.out.println("temperature has been increased .. ");
    }
}


public class demoInterface {
    public static void main(String[] args) {
        TataskyRemote ts1 =new TataskyRemote();
        ts1.On();ts1.ChannelChange();ts1.Off();ts1.VolumeUp();
        System.out.println("\n");
        AcRemote bluestar = new AcRemote();
        bluestar.On();bluestar.IncreaseTemp();bluestar.Off();



    }
}
