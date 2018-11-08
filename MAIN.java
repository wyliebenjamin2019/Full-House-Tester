import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(" Your Die rolls are as shown below ");
        System.out.println("<><><><><><><><><><><><><><><><><><><>");
        
        //RANDOM DICE ROLES BELOW
        
        int die1 = rand.nextInt(6) + 1;
        System.out.print("     " + die1);

        int die2 = rand.nextInt(6) + 1;
        System.out.print("     " + die2);

        int die3 = rand.nextInt(6) + 1;
        System.out.print("     " + die3);

        int die4 = rand.nextInt(6) + 1;
        System.out.print("     " + die4);

        int die5 = rand.nextInt(6) + 1;
        System.out.println("     " + die5);

        System.out.println("<><><><><><><><><><><><><><><><><><><>");

        //ACTUAL TESTING CODE:

            boolean fullHouse = true;
        if(die1==die2&&die1==die3&&die4==die5&&die1!=die5){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die1==die2&&die1==die4&&die3==die5&&die1!=die5){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die1==die3&&die1==die4&&die2==die5&&die1!=die5){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die3==die2&&die4==die3&&die1==die5&&die2!=die5){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die2==die3&&die2==die5&&die1==die4&&die2!=die4){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die1==die3&&die1==die5&&die2==die4&&die1!=die4){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die1==die2&&die1==die5&&die3==die4&&die1!=die4){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die2==die4&&die2==die5&&die1==die3&&die1!=die4){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die1==die4&&die1==die5&&die2==die3&&die1!=die2){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}
        if(die3==die4&&die3==die5&&die1==die2&&die1!=die4){
        System.out.println("You got a Full House!\n [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]  (▀̿Ĺ̯▀̿̿)  [̲̅$̲̅(̲̅100̲̅)̲̅$̲̅]");}

    }
}
