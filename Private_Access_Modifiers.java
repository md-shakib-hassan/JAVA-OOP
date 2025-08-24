public class Private_Access_Modifiers {
    public static void main(String [] args){
        Facebook p1 = new Facebook("Shakib","123456");
        Facebook p2 = new Facebook("Rifaz", "43294*-");
        
        p1.updataPass("3492350-");
        p1.showdetails();

    }
    
}

 class Facebook{
    String name;
    private String password;

     public Facebook(String name, String i ){
        this.name= name;
        password=i;

     }

     void updataPass(String pass){
        password= pass;

     }

     void showdetails(){
        System.out.println("Name: "+name);
        System.out.println("Password: "+password);

     }


}