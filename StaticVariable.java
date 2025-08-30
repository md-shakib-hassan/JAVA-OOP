public class StaticVariable {
    public static void main(String[] args){
        Player p1 = new Player("Shakib");
        Player p2 = new Player("Hasib");

        p1.hitFour();
        p1.hitSix();

        p2.hitSix();
        p2.hitSix();


        System.out.println("Shakib Run: "+p1.run);
        System.out.println("Hasib Run: "+p2.run);

        System.out.println("Team Run: "+Player.team);


    }
}
class Player{
    String name;
    
    public int run=0;
   public static int team=0;

   void hitSix(){
    run+=6;
    team+=6;
   }

   void hitFour(){
    run+=4;
    team+=4;
   }

    Player(String n){
        name = n;
    }
}