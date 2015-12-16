package vega_3_cesarsgame;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Vega_3_CesarsGame extends Application {
    
    static String username;
    static boolean playagain;
    static Scanner cesarneedsinfo = new Scanner(System.in);
    static String answer;
    static Scanner Name = new Scanner(System.in);
    static String name;
    static String enter;
    static String Next;
    static String userguess;
    
    public static void main(String[] args) {
        playagain = true;
        System.out.println("Howdy");
        System.out.println("What's your name?");
        name = Name.nextLine();
        System.out.println("Hello " + name + " this is a story about a man who lives in a small town that wasn't eradicated by the nuclear war"
                + ", to continue when you are reading just press enter");
        enter = cesarneedsinfo.nextLine();
        System.out.println("Its a post apocalyptic world and the last thing you "
                + "remember is the nukes falling from the sky and killing most of "
                + "humanity. So far all there is,");
        System.out.println("is fallout in certain places of "
                + "the world and dead lands. Some parts of the world wasnt hit by "
                + "the nukes and luckily you were in one of them. ");
        System.out.println("After a year the world was changing and everyone who was in the town your in either "
                + "died or ran away. Your all alone and with no family,so you decide "
                + "to move out and look for humanity.");
        System.out.println("You can either go North, South, East, or West.");
        start();       
    }

   static void start() {
        
        answer = cesarneedsinfo.nextLine().toLowerCase();
        if (answer.contains("north")) {
            North();
        } else if (answer.contains("south")) {
            South();
        } else if (answer.contains("west")) {
            West();
        } else if (answer.contains("east")) {
            East();
        }
        playagain = false;
        
    }

    static void North() {  
        System.out.println("So you start moving all you have with you is all sorts of seeds to start a colony, 2 gallons of water, ");
        System.out.println("radiation pills two weeks of rationed food");
        answer = cesarneedsinfo.nextLine();
        System.out.println("So after a day of walking you have found nothing but dead lands");
        answer = cesarneedsinfo.nextLine();
        System.out.println("After a week you feel hopeless, you've seen nothing but deadlands");
        System.out.println("But in the far distance you see people so you start have hope.");
        System.out.println("After confronting them they were nice people and they asked for you to stay"
                + "Do you say yes or no");
        answer = cesarneedsinfo.nextLine();
         if (answer.contains("yes")) {
            YouWin();
        } else if (answer.contains("no")) {
            No();
        
        }
    }
    public static void YouWin() {
        System.out.println("You Win, you decided to stay with them and start a life");
    }
    public static void No() {
        System.out.println("Then do you wish to continue on you path or choose a diffrent direction? Type 'Yes' to continue and 'No' to choose a diffrent direction.");
        answer = cesarneedsinfo.nextLine();
        if (answer.contains("yes")) {
            Yes();
        } else if (answer.contains("no")) {
            no();
    }
    }
    public static void Yes() {
        System.out.println("So you die late on because you died from starvation and thirst");
    
    }
    public static void no() {
        System.out.println("Which path do you which to choose");
        answer = cesarneedsinfo.nextLine().toLowerCase();
         if (answer.contains("south")) {
            South();
        } else if (answer.contains("west")) {
            West();
        } else if (answer.contains("east")) {
            East();
        }
    }
    
    
    static void South() {
        System.out.println("So you start moving South and all you have with you is all sorts of seeds to start a colony, 2 gallons of water,");
        System.out.println("radiation pills and two weeks of rationed food.");
        answer = cesarneedsinfo.nextLine();
        System.out.println("So after a day of walking you have found nothing but dead lands");
        answer = cesarneedsinfo.nextLine();
        System.out.println("You finnaly find a what it looks to be an abandoned village. You can either go and search it or just ignore it.");
        System.out.println("Type 'search' if you wanna search the village and 'ignore' if you wanna ignore it");
        answer = cesarneedsinfo.nextLine().toLowerCase();
        if (answer.contains("search")) {
            Search();
        } else if (answer.contains("ignore")) {
            Ignore();
        }
        

    }
    public static void Search() {
         System.out.println("So you decide to go and search the village and you get ambushed by raiders and "
                 + "you can either fight back or let them take your stuff.");
         System.out.println("Type 'fight back' if you want to fight back and 'let them take your stuff' if you give up");
         answer = cesarneedsinfo.nextLine();
         if (answer.contains("fight back")) {
            FightBack();
        } else if (answer.contains("let them take your stuff")) {
            Take();
    }
    }
    
    public static void FightBack() {
        System.out.println("After fighting back you were shot and killed.");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Game Over you died");
    }
    
    public static void Take() {
        System.out.println("After the raiders took your stuff you were beaten up and your dog was killed.");
        System.out.println("So you have nothing with you and cant walk, so you died a week later with hunger and thirst starvation.");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Game Over you died");
    }
    
    public static void Ignore() {
         System.out.println("So you keep moving on and find nothing for another week. "
                 + "Your ration is running low and your running out of radiation pills");
         answer = cesarneedsinfo.nextLine();
         System.out.println("Do you choose to continue on your path or choose a diffrent direction? Type 'diffrent' to choose a diffrent path and "
                 + "'continue' to continue on your path");
         answer = cesarneedsinfo.nextLine();
         if (answer.contains("diffrent")) {
            DiffrentDirection();
        } else if (answer.contains("continue")) {
            Continue();
        }
    }
    public static void DiffrentDirection() {
        System.out.println("So which path do you wish to choose? North, West"); 
        answer = cesarneedsinfo.nextLine();
        if (answer.contains("north")) {
            north();
        } else if (answer.contains("west")) {
            west();
        } 
    }
    public static void north(){
        System.out.println("So you start to move north, its a rough path because you are limited on supplies"
                + " and your just risking it choosing a diffrent path");
        answer = cesarneedsinfo.nextLine();
        System.out.println("After continuing in the path you find a dog and luckily its not rabbid. You choose"
                + " whether or not to keep it. Type 'dont' to not keep the dog and 'keep' to keep the dog");
        answer = cesarneedsinfo.nextLine();
        if (answer.contains("dont")) {
            DontKeepTheDog();
        } else if (answer.contains("keep ")) {
            KeepTheDog();
        }
    }
    
    public static void DontKeepTheDog(){
        System.out.println("Its pretty ruthless being alone and not having a pet.");
        answer = cesarneedsinfo.nextLine();
        System.out.println("");
    }
    public static void KeepTheDog(){
        System.out.println("The dog seems excited to be with you");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Now you have 2 mouths to feed so your very limited on the amount of food you have");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Its been another week, you and your dog has bonded and he responds to your commands."
                + " Your living on eating sticks and drinking you pee.");
        System.out.println("You have a choice to eat your dog or let live, Type 'eat your dog to eat it' or 'let it live'");
        answer = cesarneedsinfo.nextLine();
        if (answer.contains("eat your dog to eat it")) {
            DontEatTheDog();
        } else if (answer.contains("let it live")) {
            LetItLive();
        }
     }
        
    public static void DontEatTheDog(){
        System.out.println("You live and find civilization and an organized community, You Win");
    }
    
    public static void LetItLive(){
        System.out.println("You die from starvation a day later, Game Over");
    }
    
    public static void west(){
        System.out.println("After choosing to move west you died within a day with radiation poisining");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Game Over you died");
    }
         
    public static void Continue() {
        System.out.println("After continuing in the same path you are in, you died from radiation poisining");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Game Over you died");
    }
    
    static void West() {
        System.out.println("You decide to go West and after a day of walking you died of radiation because that direction is a dead zone");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Game Over you died");
    
    }
    
    static void East(){
        System.out.println("You cant go this direction because its unsafe territory");
        answer = cesarneedsinfo.nextLine();
        System.out.println("Which path do you wish to choose? north, south or west");
        answer = cesarneedsinfo.nextLine();
        if (answer.contains("north")) {
            North();
        } else if (answer.contains("south")) {
            South();
        } else if (answer.contains("west")) {
            West();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }