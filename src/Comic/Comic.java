package Comic;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

public class Comic {
    public static void main(String[] args) {

        Scene();


    }

    private static void Scene () {

        Screen screen = new Screen("Comic | SCOTT PILGRIM");
        Scott scott = new Scott( 23, "Scott", "Pilgrim", "M", "Indecisive loser-hero hybrid");
        Ramona ramona = new Ramona( 800, "Ramona", "Flowers", "F", "American expatriate ninja courier");
        Wallace wallace = new Wallace(25, "Wallace", "Wells", "G", "Scott Pilgrim's gay roommate");
        Hailey hailey = new Hailey(16, "Hailey", "Winifred", "F", "Action Star / Oiginal", "Pink");
        Hailey hailey1 = new Hailey(16, "Hailey", "Winifred", "F", "Action Star / Clone", "Green");
        Hailey hailey2 = new Hailey(16, "Hailey", "Winifred", "F", "Action Star / Clone", "Red");
        Hailey hailey3 = new Hailey(16, "Hailey", "Winifred", "F", "Action Star / Clone", "Blue");
        Hailey hailey4 = new Hailey(16, "Hailey", "Winifred", "F", "Action Star / Clone", "Purple");

        int time0,time1, time2, time3, time4;
        time0 = 4000;
        time1 = 3500;
        time2 = 3000;
        time3 = 2500;
        time4 = 500;


        screen.setVisible(true);
        screen.setBounds(400,50, 700,600);
        screen.setBackground(Colors.RoyalBlue);
        screen.showImage("./img_comic/scott1.png");


        Runnable scenes = new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(time1);
                    screen.cls();


                    wallace.speak(screen, "COME ON, SCOTT...");
                    Thread.sleep(time3);
                    ramona.speak(screen, "COME ON");
                    Thread.sleep(time3);
                    scott.speak(screen, "JUST... GIMME A SECOND I NEED TO PICK THE BEST DRINK OKAY??");
                    screen.showImage("./img_comic/scott2.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    wallace.speak(screen, "THE MOVIE STARTS IN 20 MINUTES, AND I STILL NEED TO GO TO THE CANDY STORE...");
                    Thread.sleep(time3);
                    ramona.speak(screen, "MAKE UP YOUR MIND !! WHATS THE DIFFERENCE ANYWAY?");
                    screen.showImage("./img_comic/scott3.png");
                    Thread.sleep(time3);
                    screen.cls();

                    scott.speak(screen, "THE ARE TONS OF DIFFERENCES BESIDES, I DONT' T REALLY LIKE THE TASTE OF SOFT DRINKS, THEY'RE ALL WEIRD AND BUBBLY I JUST GOTTA DO THE MATH ON THESE POWER-UPS");
                    screen.showImage("./img_comic/scott4.png");
                    Thread.sleep(time0);
                    screen.cls();
                    Thread.sleep(time4);


                    ramona.speak(screen, "WALLACE GOT US FREE TICKETS TO THE GAY COWBOY MOVIE OUT OF THE GOODNESS HIS HEART! THIS IS IMPORTANT TO HIM!");
                    Thread.sleep(time2);
                    scott.speak(screen, "WHAT! HA WALLACE DOESN'T HAVE GOODNESS IN HIS HEART!!");
                    Thread.sleep(time3);
                    wallace.speak(screen, "SCOTT'S ALWAYS LIKE THIS YOU KNOW. NOT JUST ON SPECIAL OCCASIONS");
                    screen.showImage("./img_comic/scott5.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen, "OKAY, OKAY! I'LL GET THE PEPSI LIME WITH +3 TO WILL");
                    Thread.sleep(time3);
                    wallace.speak(screen, "GREAT. NOW HURRY UP AND PAY FOR IT, AND-");
                    screen.showImage("./img_comic/scott6.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    scott.speak(screen, "... PAY?");
                    screen.showImage("./img_comic/scott7.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    wallace.speak(screen, "SCOTT! 15 MINUTES IN THERE AND YOU DIDN'T EVEN GET ANYTHING!?");
                    Thread.sleep(time3);
                    wallace.speak(screen, "WE'RE RUNNING TO CANDY STORE! FOLLOW ME!");
                    Thread.sleep(time3);
                    scott.speak(screen, "RUNNING? BUT I DIDN'T EVEN GET A DRINK! I'LL DEHYDRATE!");
                    screen.showImage("./img_comic/scott8.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    ramona.speak(screen, "IT'S YOUR OWN FAULT! I CAN'T BELIEVE YOU DIDN'T BRING YOUR WALLET...");
                    Thread.sleep(time3);
                    scott.speak(screen, "I THOUGHT TODAY WAS ALL ABOUT FREE STUFF!");
                    screen.showImage("./img_comic/scott9.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    ramona.speak(screen, "THERE'S NO SUCH THING AS A FREE RIDE, DUDE!");
                    Thread.sleep(time3);
                    wallace.speak(screen, "YEAH! UNLESS YOU HAVE FRIENDS WHO WORK AT THE CANDY STORE, LIKE ME");
                    screen.showImage("./img_comic/scott10.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen, "CAN I GET SOME FREE CANDY? CAN YOU MAKE IT HAPPEN? JUST SOME CHOCOLATE, MAYBE?");
                    Thread.sleep(time3);
                    wallace.speak(screen, "NO, BECAUSE (A) YOU'LL TAKE HALF AN HOUR TO DECIDE WHAT YOU WANT, AND (B) NO SUGAR FOR YOU!!");
                    screen.showImage("./img_comic/scott11.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    scott.speak(screen, "NO SUGAR?!");
                    Thread.sleep(time4);
                    wallace.speak(screen, "YEAH! ACTUALLY WE'RE SITTING IN A MOVIE THEATHER FOR TWO HOURS, DUDE... I DON'T WANT YOU GETTING ALL GRABBY");
                    screen.showImage("./img_comic/scott12.png");
                    Thread.sleep(time1);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen,"THESE POSTERS ARE KIND OF CREEPING ME OUT");
                    Thread.sleep(time3);
                    scott.speak(screen, "WHO'S THAT GIRL? LINSDAY ... DORFF ...? HUFFMAN ...? WILFORD...BRIMLEY?");
                    screen.showImage("./img_comic/scott15.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    ramona.speak(screen, "IT'S WINIFRED HAILEY. ISN'T SHE LIKE SIXTEEN? SHE'S SUPPOSED TO BE AN ACTION STAR NOW?");
                    Thread.sleep(time3);
                    wallace.speak(screen, "YEAH, I WOULDN'T KNOW.");
                    screen.showImage("./img_comic/scott16.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen, "GUYS, I'M SERIOUSLY CREEPED OUT NOW-");
                    screen.showImage("./img_comic/pre_creeped.png");
                    screen.showImage("./img_comic/creeped.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    hailey.attack(screen);
                    screen.out("\n");
                    wallace.speak(screen, "SOMETHING WEIRD IS GOING ON");
                    Thread.sleep(time3);
                    ramona.speak(screen, "THAT'S VERY ASTUTE, SCOTT");
                    screen.showImage("./img_comic/scott17.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    scott.speak(screen, "IS THIS REAL? ... ARE THEY GOING TO MAKE?!?!");
                    Thread.sleep(time3);
                    ramona.speak(screen, "THEY CAME OUT OF MOVIE POSTERS. AND THERE'S LOT OF THEM AND THEY'RE ALL THE SAME");
                    screen.showImage("./img_comic/scott18.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    wallace.speak(screen, "ANY IDEAS WHY FAMOUS TEEN ACTRESS WINIFRED HAILEY WOULD BE SO MAN AT YOU THAT HER MOVIE POSTERS WOULD COME ALIVE AND HURT YOUR FRIENDS?");
                    Thread.sleep(time2);
                    ramona.speak(screen, "IT CAN'T BE JUST HER. THIS IS STRONG NINJA-TYPE STUFF AND THERE'S NO HAY SOME 16- YEAR OLD INGENUE IS SECRETLY");
                    screen.showImage("./img_comic/scott19.png");
                    Thread.sleep(time2);
                    screen.cls();
                    Thread.sleep(time4);


                    hailey.speak(screen, "SCOTT PILGRIM PREPARE TO DIE \n");
                    Thread.sleep(time4);
                    hailey.attack(screen);
                    hailey1.attack(screen);
                    hailey2.attack(screen);
                    hailey3.attack(screen);
                    hailey4.attack(screen);
                    screen.out("\n");
                    screen.showImage("./img_comic/scott20.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak( screen, "AAA! THEY'RE COMING AFTER ME! WHAT'D I DO? WHAT DO I DO?");
                    Thread.sleep(time3);
                    scott.speak(screen, "S: I CANT'T HIT A 16 YEAR OLD GIRL!!");
                    screen.showImage("./img_comic/scott21.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    //screen.out("Halies continues hitting Scott\n");

                    wallace.speak(screen,"WHY ARE THE WINIFREDS IGNORING US?");
                    screen.showImage("./img_comic/scott23.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);



                    ramona.speak( screen,"THE'RE JUST FOR SCOTT, IT LOOKS LIKE. CUTE AS A BUTTOB, THOIGH, AREN'T THEY?");
                    Thread.sleep(time3);
                    scott.speak(screen, "GUYS ANY TIPS? ANY HELP?");
                    screen.showImage("./img_comic/scott24.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    wallace.speak(screen,"MAYBE SOME KIND OF NINJA MAGIC TRIGERRED WHEN HE WALKED BY THE POSTERS?");
                    Thread.sleep(time3);
                    ramona.speak(screen, "YOUR GUESS IS MORE OR LESS AS BAD AS MINE, DUDE ");
                    screen.showImage("./img_comic/scott25.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);



                    wallace.speak(screen, "IS ONE OF YOUR SEVEN EVIL EX BOYFRIENDS A NINJA?");
                    Thread.sleep(time3);
                    ramona.speak(screen, "ONE OR MORE OF MY EXES MIGHT BE A NINJA, YEAH...");
                    screen.showImage("./img_comic/scott27.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen, " GUYS HELP ...");
                    screen.showImage("./img_comic/scott26.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);





                    scott.speak(screen, "GUYS! I ACCIDENTALLY KICKED THE INNOCENT TENNAGED GIRL AND SHE WENT VOOP!!");
                    screen.showImage("./img_comic/acc_hit.png");
                    Thread.sleep(time3);
                    screen.cls();


                    ramona.speak(screen, "WHAT IS THAT SHE'S DROPPING? IS THAT A SCRAP OF PAPER?");
                    screen.showImage("./img_comic/voop.png");
                    Thread.sleep(time3);
                    screen.cls();


                    ramona.speak(screen, "IT COULLD BE LIKE A NINJA SCROLL OR SOMETHING");
                    Thread.sleep(time4);
                    wallace.speak(screen, "YEAH, THAT'S HOW NINJA STUFF WORKS, RIGHT? SCOTT BEAT THEM ALL! I THINK THE PAPER MIGHT BE A CLUE!");
                    screen.showImage("./img_comic/ninja_scroll.png");
                    //scott graps
                    //hailey appears
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    //ramona.speak(screen, "IT COULLD BE LIKE A NINJA SCROLL OR SOMETHING");
                    //Thread.sleep(time3);
                    //wallace.speak(screen, "YEAH, THAT'S HOW NINJA STUFF WORKS, RIGHT? ... SCOTT THE PAPER MIGHT BE A CLUE!");
                    //screen.showImage("ninja_scroll.png");




                    scott.speak(screen, "I DON'T WANNA!");
                    screen.showImage("./img_comic/dont_wanna.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    wallace.speak(screen, "HURRY UP THE MOVIE STARTS IN EIGHT MINUTES!!");
                    screen.showImage("./img_comic/hurry.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    scott.speak(screen,"I DON'T LIKE HITTING THEM");
                    Thread.sleep(time3);
                    ramona.speak(screen, "YOU'RE GONNA HAVE TO LEARN TO HIT GIRLS  EVENTUALLY, SCOTT!");
                    screen.showImage("./img_comic/learn.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    ramona.speak(screen, "JUST RELAX OKAY?");
                    Thread.sleep(time3);
                    scott.speak(screen, "HUH? WAIT WHAT?");
                    screen.showImage("./img_comic/relax.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    ramona.speak(screen, "SEE? THAT WASN'T SO DIFFICULT, NOW, WAS IT?");
                    Thread.sleep(time3);
                    scott.speak(screen, "I... I DON'T WANNA HIT THEM");
                    screen.showImage("./img_comic/difficult.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    wallace.speak(screen, "SO WHAT'S THE DEAL WITH THE PIECES OF PAPER, MAN?");
                    screen.showImage("./img_comic/deal.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);




                    scott.speak(screen, "IT'S A ... CUPPON");
                    screen.showImage("./img_comic/coupon.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    ramona.speak(screen, "FREE DRINK COUPONS? THERE ARE THE SAME THEN");
                    screen.showImage("./img_comic/free_drink.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);



                    scott.speak(screen, "THEY EXPIRE TODAY!!!");
                    Thread.sleep(time3);
                    scott.speak(screen, "I'M REEEEEEEEEALLY THIRSTY AFTER ALL PUNCHING");
                    screen.showImage("./img_comic/expire.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);



                    screen.showImage("./img_comic/minutes.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen, "OH DUDE, THIS ONE HAS +4 TO SPEED! HA HAHA AH");
                    screen.showImage("./img_comic/plus_speed.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    wallace.speak(screen, "I HATE YOU SO MUCH, SCOTT PILGRIM");
                    Thread.sleep(time3);
                    ramona.speak(screen, "SCOTT, WHY DO YOU RUIN EVERYTHING? DID YOU NEED EIGHT COMPLETELY DIFFERENT DRINKS?");
                    screen.showImage("./img_comic/hate.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);

                    scott.speak(screen, " ... ");
                    screen.showImage("./img_comic/blah.png");
                    Thread.sleep(time3);
                    screen.cls();
                    Thread.sleep(time4);


                    screen.out("\n\n\t\t THE END", "Comic Sans Ms",60, Colors.Desire);
                    Thread.sleep(time0);
                    screen.cls();
                    screen.setVisible(false);


                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread sceneRun = new Thread(scenes);
        sceneRun.start();

    }
}
