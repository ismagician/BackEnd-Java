package LineUp;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.io.File;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

public class LineUp {


    public static void main(String[] args) throws InterruptedException {

        lineUpGenerator();
        show();

    }

    static void lineUpGenerator () throws InterruptedException{

        Screen screen = new Screen("Line Up");
        screen.setBounds(200, 0, 800,400);
        screen.setVisible(true);


        Artist array[] = new Artist[16];

        array[0] = new Artist("Daft Punk", "French House", "FR", "Band");
        array[1] = new Artist("Earth Wind & Fire", "Disco", "US","Band");
        array[2] = new Artist("Jamiroquai","Pop","UK" ,"Band" );
        array[3] =  new Artist("Alewya", "Dance/Electronic", "SA", "Solo");
        array[4] = new Artist("Little Simz", "Hip-Hop/Rap", "UK", "Solo");
        array[5] = new Artist("Rosalía", "Pop", "ES", "Solo");
        array[6] = new Artist("DJ Premier", "Hip-Hop/Rap", "US", "Solo");
        array[7] = new Artist ("Gorillaz", "Alternative/Indie", "UK","Band");
        array[8] = new Artist("Artic Monkeys", "Alternativa/Indie", "UK", "Band");
        array[9] = new Artist("The Commodores", "R&B/Soul", "US", "Band");
        array[10] = new Artist("BadBadNotGood","Jazz", "CA","Band");
        array[11] = new Artist("Koffee","Reggae", "JM","Solo");
        array[12] = new Artist("Jungle","Neo Soul", "UK","Band");
        array[13] = new Artist("Daniel Caesar","R&B/Soul", "CA","Solo");
        array[14] = new Artist("Disclosure","Dance/Electronic", "UK","Dou");
        array[15] = new Artist("Purple Disco Machine","Dance/Electronic", "DE","Solo");


        int rest = array.length;
        lineUpAnimation(array,screen, rest);
        screen.setVisible(false);


    }
    static void lineUpAnimation(Artist array[], Screen screen, int rest) throws InterruptedException{
        /*
        for (int i=0;i < array.length;i++){
            screen.out(array[i].name,"Ebrima", 30, Color.WHITE);
            screen.out(" "+ array[i].country+" ","Ebrima", 12, Color.WHITE);
        }
        */

        int size1=38;
        int size2=12;
        int counter = 0;
        int limit = 30;

        screen.out("\t\t    LAUNCHELLA", "Ebrima", 50, Color.BLACK);
        screen.out("\nLAUNCHELL A\n", "Ebrima", 26, Color.WHITE);

        Thread.sleep(5);
        for (int i=0;i < array.length;i++) {

            if (counter > limit ){
                screen.out("\n","Ebrima", size1, Color.WHITE);
                size1=size1-4;

                // limits[indice] = i;
                counter = 0;
                limit += 4;
            }

            /*
            if (i == limit[index] && limit[index]!=0){
                    screen.out("\n","Ebrima", size1, Color.WHITE);
                    size1=size1-4;

                    index+
            }

             */
            if (i < rest) {
                screen.out(array[i].name,"Ebrima", size1, Color.WHITE);
                screen.out(" "+ array[i].country+" ","Ebrima", size2, Color.WHITE);

            }else {
                screen.out(array[i].name, "Ebrima", size1, Color.BLACK);
                screen.out(" " + array[i].country + " ", "Ebrima", size2, Color.BLACK);
            }
            counter +=  array[i].name.length();

        }

        rest--;


        if (rest >=0){
            Thread.sleep(1000);
            screen.cls();
            lineUpAnimation(array,screen,rest);
        }

        else
            Thread.sleep(3000);
    }

    static void show(){
        int time1= 87274;
        int time2= 105162;

        Screen screen  = new Screen("Line Up");
        screen.setBounds(200,0,1000,800);

        Jamiroquai jam = new Jamiroquai("Jamiroquai","Pop","UK" ,"Band"  );
        EarthWindFire ewf = new EarthWindFire("EarthWind&Fire", "Disco", "US","Band");
        DaftPunk dp = new DaftPunk("Daft Punk", "French House", "FR", "Band");



        //final float[] time = new float[1];
        Runnable sound1 = new Runnable(){
            @Override
            public void run() {
                try {
                    File song =  new File(jam.playlist);
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(song));
                    clip.start();
                    //time[0] = clip.getMicrosecondLength()/1000;
                    //System.out.println(time[0]);
                    Thread.sleep(clip.getMicrosecondLength()/1000);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        };

        Runnable sound2 = new Runnable(){
            @Override
            public void run() {
                try {

                    File song = new File(ewf.playlist);
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(song));
                    Thread.sleep(time1);
                    clip.start();
                    //time[0] = clip.getMicrosecondLength()/1000;
                    //System.out.println(time[0]);
                    Thread.sleep(clip.getMicrosecondLength()/1000);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        };


        Runnable sound3 = new Runnable(){
            @Override
            public void run() {
                try {

                    File song = new File(dp.playlist);
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(song));
                    Thread.sleep(time1+time2);
                    clip.start();
                    //time[0] = clip.getMicrosecondLength()/1000;
                    //System.out.println(time[0]);
                    Thread.sleep(clip.getMicrosecondLength()/1000);
                    clip.stop();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        };



        Runnable screenShow1 = new Runnable(){
            @Override
            public void run() {
                try {

                    screen.setVisible(true);
                    //screen.showImage("./img/jam1.jpg");
                    jam.show(screen,"./img/jam1.jpg");
                    Thread.sleep(jam.time1);
                    screen.cls();
                    jam.show(screen,"./img/jam2.jpg");
                    Thread.sleep(jam.time2);
                    screen.cls();
                    jam.show(screen,"./img/jam3.jpg");
                    Thread.sleep(jam.time3);
                    //screen.setVisible(false);



                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        };

        Runnable screenShow2 = new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(time1);
                    screen.setVisible(true);
                    //screen.showImage("./img/jam1.jpg");
                    jam.show(screen,"./img/ewf1.jpg");
                    Thread.sleep(ewf.time1);
                    screen.cls();
                    jam.show(screen,"./img/ewf2.jpg");
                    Thread.sleep(ewf.time2);
                    screen.cls();
                    jam.show(screen,"./img/ewf3.jpg");
                    Thread.sleep(ewf.time3);
                    //screen.setVisible(false);



                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        };


        Runnable screenShow3 = new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(time1+time2);
                    screen.setVisible(true);
                    //screen.showImage("./img/jam1.jpg");
                    jam.show(screen,"./img/dp1.jpg");
                    Thread.sleep(dp.time1);
                    screen.cls();
                    jam.show(screen,"./img/dp2.jpg");
                    Thread.sleep(dp.time2);
                    screen.cls();
                    jam.show(screen,"./img/dp3.jpg");
                    Thread.sleep(dp.time3);
                    screen.setVisible(false);



                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        };

        Thread showJam =new Thread(sound1),
                showEwf =new Thread(sound2),
                showDP = new Thread(sound3),
                screen1 = new Thread(screenShow1),
                screen2 = new Thread(screenShow2),
                screen3 = new Thread(screenShow3);


        showJam.start();
        screen1.start();

        showEwf.start();
        screen2.start();

        showDP.start();
        screen3.start();

    }



    static int[] limitCheck(Artist array[], int limits[]){
        int indice = 0;
        int cuenta = 0;
        int limit = 30;

        for (int i=0;i < array.length;i++){

            if (cuenta > limit ){

                limits[indice]  = i;
                cuenta = 0;
                indice++;
                limit += 4;
            }

            //System.out.println(limite);
            cuenta = cuenta + array[i].name.length();
        }

        return limits;

    }

}
