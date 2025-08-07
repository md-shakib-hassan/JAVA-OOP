public class This_keyW {
    public static void main(String[] args){
         Cat c1 = new Cat();
        c1.Color="white";
      //  c1.Origins="persian";
        c1.changeOrigin("Arabian");
        //for experment
        c1.change2("Indian");
        
        
    }
}
 class Cat{
     String Color ;
     String Origins="persian";
     public void changeOrigin(String change){
        Origins = change;
        System.out.println("cat is " + change);
     }
     public void change2(String Origin){
       this.Origins = Origin;
        System.out.println("THIS CAT FORM :"+Origins);
     }

}
