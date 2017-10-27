package adapter;

/**
 * Created by maduar on 27/10/2017.
 */
public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
