package Praktik;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    
    
    public TV(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setChannel( int newChannel ){
        if (newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
        else{
            System.out.println("=======Channel Not Ready, Channel Between 1 to 120======");
        }
    }
    
    public void setVolume(int newVolume){
        if (newVolume < 1 && newVolume > 7){
            System.out.println("======Volume Not Ready, Volume Between 1 to 7=======");
        }
        else{
            volumeLevel = newVolume;
        }
    }
    
    public void channelUP(){
        channel++;
    }
    
    public void channelDOWN(){
        channel--;
    }
    
    public void volumeUP(){
        volumeLevel++;
    }
    
     public void volumeDOWN(){
        volumeLevel--;
    }

  
}
