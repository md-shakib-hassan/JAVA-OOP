import java.util.Scanner;

public class RoomBooking {
    public static void main(String[] args) {

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();

        room1.pricePernight=3500.00;
        room2.pricePernight=4000.00;
        room3.pricePernight=4500.00;

        
        System.out.println("Room 1 price 3500.00");
        System.out.println("Room 2 price 4000.00");
        System.out.println("Room 3 price 4500.00");
        System.out.print("Enter Room Number:");
        int choice;

        Scanner input = new Scanner(System.in);
         choice = input.nextInt();
         
         switch (choice) {
            case 1:
                System.out.print("Enter night :");
                Double night;
                night = input.nextDouble();
                room1.BookRoom(night);

                System.out.println("Bill:"+room1.calculateBill());

                break;

            case 2 :

            System.out.print("Enter night :");
               
                night = input.nextDouble();
                room2.BookRoom(night);

                System.out.println("Bill:"+room2.calculateBill());
            break;

            case 3:

            System.out.print("Enter night :");
                
                night = input.nextDouble();
                room3.BookRoom(night);

                System.out.println("Bill:"+room3.calculateBill());

            break;
         
            default:
                break;
         }



    }
    
}
 class Room{
    int roomNumber;
    int isBooked;
    double pricePernight;
    double nightBooked;

    void BookRoom(double night){

        nightBooked=night;
        //isBooked++;

    }

    double calculateBill(){
        double bill =pricePernight*nightBooked;
        return bill;
    }

   
}