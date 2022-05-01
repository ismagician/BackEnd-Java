package Comic;

import java.awt.*;
import imonsh.Screen;
import imonsh.Colors;


public class Hailey extends Character implements HaileyActions {
    String color;

    public Hailey(int age, String firstname, String lastname,String gender, String description, String color){
        super(age, firstname, lastname, gender, description);
        this.color=color;
    }


    public void speak(Screen s, String diag){
        //s.setVisible(true);
        s.out( firtsname+": "+ diag + "\n", "Comic Sans Ms", 22, Colors.blue);
    }

    public void attack(Screen s){

        if (color== "Pink"){
            s.out(firtsname  + " REAL ATTACKS " , "Comic Sans Ms",  22, Color.PINK );
        } else
            s.out(firtsname  + " ATTACKS " , "Comic Sans Ms", 22 , Color.darkGray);



    }
}


