package Comic;

import imonsh.Screen;
import imonsh.Colors;

public class Ramona extends Character implements RamonaActions{

    public Ramona(int age, String firstname, String lastname,String gender, String description){
        super(age, firstname, lastname, gender, description);
    }


    public void speak(Screen s, String diag){
        //s.setVisible(true);
        s.out( firtsname+": "+ diag + "\n", "Comic Sans Ms", 20, Colors.blue);
    }


}
