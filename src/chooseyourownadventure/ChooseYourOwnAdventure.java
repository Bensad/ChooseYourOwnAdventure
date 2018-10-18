/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseyourownadventure;
import java.util.Scanner;
/**
 *
 * @author besad0473
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyedInput = new Scanner (System.in);
         
         String name;
         String Anwser;
         String Start;
         String s;
         String Cave;
         int lol,death;
         System.out.println("When you are givin a question you will be given 3 things awnser with A B or C");
         System.out.println("What is your name?");
          name = keyedInput.nextLine ();
          
          System.out.println(name +" the P.I. was enjoying a cigar and whisky? (idk you do) in his/her/others office. When the door goes flying open and a fat man with a katana, neck beard and fedora, bursts in  ");
           System.out.println("What do you do");
          System.out.println("A) Take out your Tommy Gun and shoot the man");
          System.out.println("B) Try and talk your way out");
          System.out.println("C) Jump out your window");
             Start = keyedInput.nextLine ();
          
        switch (Start) {
            case "A":
                System.out.println("You unload the clip into his chest and he falls with such a force he breaks through the floor ");
                System.out.println("You then see below on the next floor down a fronzen Hitler Steve Jobs and Shakespeare");
                System.out.println("Who do you wake up");
                System.out.println("A) Hitler");
                System.out.println("B)Steve Jobs");
                System.out.println("C) Shakespere");
                 Anwser = keyedInput.nextLine ();
                  if (Anwser.equals("A")){
                      System.out.println("Hitler really you die you just die you nazi you die die die die die");
                  }
                  if (Anwser.equals("B")){
                      System.out.println("he is blad and you are blinded by light hitting it you then smell skunk and elon musk walks in and yeets you to death with his tesla");
                  }
                  if (Anwser.equals("C")){
                      System.out.println("How Arth thee where am thy i arth very conufizzed sir He says as he walks up");
                      System.out.println("A) ask him about his plays ");
                      System.out.println("B) why is he here who is behind this");
                       if (Anwser.equals("A")){
                           System.out.println("Shakespere had a ghost writer lol ");
                           System.out.println("He beggins monologing as you here the doors open behind you and there is elon musk");
                           System.out.println("A) Scream for help");
                           System.out.println("B)Talk to him about space X");
                           System.out.println("C) say your sorry"); 
                          if (Anwser.equals("C")){      
                              System.out.println("He crys and gives you a hug all his money and vanishes like luke at the end of last jedi");
                           if (Anwser.equals("B")){
                               System.out.println("You have a nice chat with elon and he gives you some shares in his company and shows you around his secret lab that smell of cannabis he then shows you a white board how he wanted to save the kids in the cave for money");
                               System.out.println("What do u do");
                               System.out.println("A) you dont care");
                               System.out.println("B) Make an angry tweeter post");
                               if (Anwser.equals("B")){
                                   System.out.println("HE SCREAMS THAT TESLA IS GOING PRIVATE AND ITS ALL YOUR FAULT then he lets loose Robot monkeys to attack you ");
                                   System.out.println("A) run");
                                   System.out.println("B) fight");
                                   System.out.println("C) say your sorry");
                                   if (Anwser.equals("C")){
                                       System.out.println("Elon calls off the killer robot monkeys and gives you a hug and all his money and shares and runs away into the sunset");
                                   }
                                   if (Anwser.equals("B")){
                                       System.out.println("They have lasers and YEET u THE END");
                                   }
                                   if (Anwser.equals("A")){
                                       System.out.println("You can't out run killer robot monkeys silly");
                                   }
                               }
                               if (Anwser.equals("A")){
                                   System.out.println("You keep walking and he gives a tesla and walks with you to the exit where he then feeds you to his hidden trapdoor sharks cause you have seen to MUCH THE END");
                                   
                               }
                           }
                           if (Anwser.equals("A")){
                               System.out.println("No one is coming to help u shakespere does nothing as elon launches a rocket at you THE END");
                           }
                       }
                       if (Anwser.equals("B")){
                           System.out.println("As you think these words elon musk walks in with  a flame thrower buring you alive");
                       }
                       }
                       break;
            
                  }
                
            case "B":
                System.out.println("He looks you tips his fedora and say \"m\'lady\"as your secratry pokes her head through the door. He then stares at you screams help me find my tendies!");
                System.out.println("What do you do");
                System.out.println("A) go find tendies");
                System.out.println("B) Shoot him ");
                System.out.println("C) tell him to get out");
                s = keyedInput.nextLine ();
                if (s.equals("C")){
                    System.out.println("you tell him to get out he then says something in japanese and grabs his body pillow but just as he is leaving you notice the Rick and Morty shirt he is wearing");
                    System.out.println("A) mention how high of an IQ you need to watch the show");
                    System.out.println("B) Do nothing and let him walk out");
                    System.out.println("C) shoot him");
                    Anwser = keyedInput.nextLine ();
                    if (Anwser.equals("A")){
                        System.out.println("This is an old meme lets do a diffrent story");  
                        System.out.println("You are a cave person named" + name );
                        System.out.println("You live in a nice caves the walls are read with the blood of your newest kill a mamoth ");
                        System.out.println("A) Eat the mamoth");
                        System.out.println("B) make a coat out f the mamoth");
                        System.out.println("C) make a finger painting");
                           Cave = keyedInput.nextLine ();
                           if (Anwser.equals("A")){
                               System.out.println("you get sick cause you have no fire to cook it GAME OVER");
                           }
                           if (Anwser.equals("B")){
                               System.out.println("You create a GUCCI coat you are now king of the cave men GG YOU WIN");
                           }
                           if (Anwser.equals("C")){
                               System.out.println("no one likes our painting art only has value when the artist dies GAME OVER ");
                           }
                        
                    }
                    if (Anwser.equals("B")){
                        System.out.println("He leaves as he is walking you hear something behind you saying egg egg egg egg egg eggg egg egggggggg egggg egegegegegegegggeggg egg egg eggg ITS DANNY DEVITO");
                        System.out.println("A) Talk to him and ask for instructions on how to eat an egg like him");
                        System.out.println("B)offer him a coffee");
                        System.out.println("C) Take  a photo with him");
                        Anwser = keyedInput.nextLine ();
                        switch (Anwser) {
                            case "A" :
                                System.out.println("You and Danny Devito become best friends ");
                                break;
                            case "B" :
                                System.out.println("He only drinks nesspreso and leaves (if you were a real fan you would no)");
                              break;
                            case "C":
                                System.out.println("You snap selfie with danny but when you at it he is not there and he is gone you must investegate YOUR PI for goodness sake. You walk around the building and there you see a black van pulling a short man with a bag over his head inside ");
                                System.out.println("A) Shoot the guys");
                                System.out.println("B) Scream for help");
                                System.out.println("C) play tug of war with danny devito and his kidnappers");
                                Anwser = keyedInput.nextLine ();
                               
                                 if (Anwser.equals("A")){
                                     System.out.println("BANG BANG BANG you shoot all of them saving Danny Devito he then goes home to see his family and follows you on Twitter THE END");
                                 }
                                 if (Anwser.equals("B")){
                                     System.out.println("You scream for help and Ben Shapiro shows up and screams at the left wing of there van destroying it saving Danny Devito. You Danny and Ben Shaprio have a weird love triangle till you all die of a drug overdose");
                                 }
                                
                               if (Anwser.equals("C")){
                                   System.out.println("You rip him in half and rainbows come out and his legs are still in your hands so you beat the guys to death with them for revenge attend his funeral and spend the rest of your life as a vigilante saving Gothem city from crimanals dressed as a bat");
                               }
                               
                                break;
                        }
                        
                    }
                    if (Anwser.equals("C")){
                        System.out.println("you shoot him but his fedora is bullet proof and it bounces off and hit you in the head");
                    }
                
                }
                if (s.equals("B")){
                    System.out.println("you shoot him but his fedora is bullet proof and it bounces off and hit you in the head");
                }
                if (s.equals("A")){
                    System.out.println("you walk out of the building it raining you take out your umbrella and neck beard gets in his moblity scooter you walk the city streets then you arrive at wallmart you walk down the aisles till you get to the frozen food section and you see the tendies and feel the pure stalinium blade touch the back of your neck");
                    System.out.println("A) you jab your umbrella through your stomach to hit the  behind you");
                    System.out.println("B) Unsheth the hidden umbrella blade and fight");
                    System.out.println("C) you duck and run down the isle to escape");
                    Anwser = keyedInput.nextLine ();
                    if (Anwser.equals("A")){
                        System.out.println("You kill your self and the neckbeard GAME OVER");
                    }
                    if (Anwser.equals("B")){
                        System.out.println("you battle in an epic fight parrying and jabing your way to victory when you land a hit you stab his body pillow and he lets loose a reeeeeeeeeee flailing his blade when he connects with your throat as you here on the PA clean up on is aisle 10");
                    }
                    if (Anwser.equals("C")){
                        System.out.println("The blade flys over you as you do a dark souls roll and dash down the next isle throwing food behind you then you reach the toy aisle");
                        System.out.println("A) nab a nerf gun");
                        System.out.println("B) go to the electronic section and arm your self with a Iphone X");
                        System.out.println("C) go to the cooking section and grab a knife");
                        Anwser = keyedInput.nextLine ();
                        if (Anwser.equals("A")){
                            System.out.println("you shoot him with your nerf gun as he keeps charging at you and slashes you GAME OVER");
                        }
                        if (Anwser.equals("B")){
                            System.out.println("Neckbeard sees your Iphone and then start telling you why android is better for the next hour giving you time to get him in cuffs and send him to jail where he dies from lack of hentai");
                         if (Anwser.equals("C")){
                             System.out.println("You grab a knife and run at him as your attacks do nothing against him he laughs but then dies from lack of tendies he tried to rob the wrong PI");
                         }
                         }
                       
                   }
                } break;
            case "C":
                System.out.println("You fall from the top story and hit the cenment and get run truck i win jajajajajajaajajajajajajajajajaja lolololololol XDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
                break;
        }
    }
}
       

