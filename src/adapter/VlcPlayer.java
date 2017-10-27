package adapter;

/**
 * Created by maduar on 27/10/2017.
 */
public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //
    }
}
