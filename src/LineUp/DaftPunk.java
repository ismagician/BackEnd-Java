package LineUp;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

public class DaftPunk extends Artist implements Actions {
    int time1 =84098;
    int time2 = 62025;
    int time3 = 174907;

    String playlist ="./songs/dp.wav";

    public DaftPunk(String name, String genre, String country, String type){
        super(name, genre, country, type);
    }


    @Override
    public void show(Screen screen, String file){
        screen.cls();
        screen.showImage(file);
    }
}
