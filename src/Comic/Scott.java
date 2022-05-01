package Comic;

import imonsh.Screen;
import imonsh.Colors;

public class Scott extends Character implements ScottActions {

    public Scott(int age, String firstname, String lastname,String gender, String description){
        super(age, firstname, lastname, gender, description);
    }


    @Override
    public void speak(Screen s, String diag){
        s.setVisible(true);
    s.out( firtsname+": "+ diag + "\n", "Comic Sans Ms", 20, Colors.orange);
        //s.showImage("frostshot.gif");
        //s.setBounds(200, 100, 1000, 900);
    }
}
