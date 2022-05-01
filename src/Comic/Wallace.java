package Comic;

import imonsh.Screen;
import imonsh.Colors;
public class Wallace extends Character implements WallaceActions{

    public Wallace(int age, String firstname, String lastname,String gender, String description){
        super(age, firstname, lastname, gender, description);
    }
    public void speak(Screen s, String diag){


        s.out(firtsname + ": "+ diag + "\n", "Comic Sans Ms", 20, Colors.black);
    }
}
