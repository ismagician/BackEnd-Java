package LineUp;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

public class Jamiroquai extends Artist implements Actions{
    int time1 =18489;
    int time2 = 28623;
    int time3 = 40162;
    String playlist = "./songs/jamiroquai.wav";

    public Jamiroquai(String name, String genre, String country, String type){
        super(name, genre, country, type);
    }



    @Override
    public void show(Screen screen, String file){
        screen.cls();
        screen.showImage(file);
    }
}
