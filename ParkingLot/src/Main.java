public class Main {
    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to ParkingLot Design");
    }
    /**
     * ParkingLot clas is used a singleton design pattenr , because there will only be a
     * single instance of the parking lot system
     *
     * we composed of smaller object that we have already designed, like entrace, exit and parking spots,
     * parking rate etc.
     *
     * Therefore good practice to use the Abstract Factory and Factory design
     *
     * pattern to instantiate all those objects.
     *--------------------------------------------------------
     * 1.
     * Let’s say that the interviewer asks you that the parking lot should assign a
     * parking spot closest to the entrance. How do you go about solving this requirement?
     *
     * This requirement is more about how you implement this parking assignment
     * strategy rather than designing it. The interviewer is really looking at
     * your data structures and algorithms skills in this requirement.
     *
     * In this scenario, let’s say we have four entrances and would like to return
     * to the parking spot which is nearest to the entrance from where the customer
     * is entering the parking lot. The best approach is to implement it using a min-heap.
     *
     * We will declare four min-heaps. We will add all parking spots to these min-heaps,
     * so there will be a min-heap for each entrance. These min-heaps will store the
     * parking spots in the order of the shortest distance from the entrance.
     * We will also declare the following two sets of parking spots:
     * A set of available parking spots
     * A set of reserved parking spots
     * We have a map of min-heaps where the key is the entrance ID, and the value
     * is a min-heap. When the user calls the getParkingSpot method, we get the
     * entrance ID which gives us the min-heap for that entrance and allows us
     * to pop the top element to get the parking spot.
     * We mark the parking spot as reserved and remove it from the available set.
     * We also remove it from the min-heaps of other entrances
     */
}