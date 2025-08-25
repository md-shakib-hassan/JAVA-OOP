
class Room {
    int roomNumber;
    boolean isBooked;
    double pricePerNight;
    int nightsBooked;

    Room(int rN, double pP) {
        roomNumber = rN;
        pricePerNight = pP;
        isBooked = false;
    }

    void bookRoom(int nights) {
        if (!isBooked) {
            isBooked = true;
            nightsBooked = nights;
        } else {
            System.out.println("Room already booked!");
        }
    }

    double calculateBill() {
        return pricePerNight * nightsBooked;
    }
}

public class HotelRoom {
    public static void main(String[] args) {
        Room r1 = new Room(101, 2000);
        r1.bookRoom(3);
        System.out.println("Bill: " + r1.calculateBill());
    }
}

