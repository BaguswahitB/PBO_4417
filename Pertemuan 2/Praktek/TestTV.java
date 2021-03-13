public class TestTV {
    public static void main(String[] args) {
        myTV tv1 = new myTV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        myTV tv2 = new myTV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println(" tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println(" tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);

        Manusia man1 = new Manusia("\nErik");
        System.out.println(man1.namaSaya());
        myTV tvku = new myTV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
    }
}
