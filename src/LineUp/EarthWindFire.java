package LineUp;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;
public class EarthWindFire extends Artist implements Actions {
    int time1 =36747;
    int time2 = 29470;
    int time3 = 38945;
    String playlist= "./songs/ewf.wav";

    public EarthWindFire(String name, String genre, String country, String type){
        super(name, genre, country, type);
    }



    @Override
    public void show(Screen screen, String file){
        screen.cls();
        screen.showImage(file);
    }
}
