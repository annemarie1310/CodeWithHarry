package Interface;


interface Camera{

    void TakePic();
    void recordVideo();

    default void selfie(){
        System.out.println("taking selfie....");
    }

}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}

class Myphone{

    void callingnumber(int phonenumber){
        System.out.println("callling.."+phonenumber);
    }
    void pickupcall(int phonenumber){
        System.out.println("connecting ..."+phonenumber);
    }
    void reject(int phonenumber){
        System.out.println("rejecting the call .."+phonenumber);
    }

}

class Mysmartphone extends Myphone implements Camera,Wifi{
    @Override
    public void TakePic() {
        System.out.println("taking Picture...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video ....");
    }

    public String[] getNetworks(){
        System.out.println("getting the list of available Networks");
        String[] getNetworkslist={"Aitel","Jio"};
        return getNetworkslist;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to network"+network);
    }
}


public class phone {
    public static void main(String[] args) {
        Mysmartphone s21 = new Mysmartphone();
        String[] ar= s21.getNetworks();
        for (String temp:ar) {
            System.out.println(temp);
        }
        s21.TakePic();s21.recordVideo();s21.callingnumber(705688456);s21.selfie();


    }
}
