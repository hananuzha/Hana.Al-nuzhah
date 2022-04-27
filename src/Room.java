import java.util.Arrays;

public class Room implements Comparable<Room> {
    private double width;
    private double length;
    private int floor;

    public Room() {
        this.width = 10;
        this.length = 12.5;
        this.floor = 1;
    }

    public Room(double parameter1, double parameter2, int parameter3) {
        if (parameter1 > parameter2) {
            setLength(parameter1);
            setWidth(parameter2);
        } else {
            setLength(parameter2);
            setWidth(parameter1);
        }
        setFloor(parameter3);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return
                length + " x " +
                        width + ", " +
                        "floor " + floor;
    }

    @Override
    public int compareTo(Room room) {
        if (this.floor > room.floor) {
            return 1;
        } else if (this.floor < room.floor) {
            return -1;
        } else {
            if (this.length > room.length) {
                return 1;
            } else if (this.length < room.length) {
                return -1;
            } else {
                if (this.width > room.width) {
                    return 1;
                } else if (this.width < room.width) {
                    return -1;
                } else
                    return 0;
            }
        }
    }

    public static void main(String[] args) {

        Room room1 = new Room(3.5, 9.5, 6);
        Room room5 = new Room(4, 29, 9);
        Room room6 = new Room(3.5, 29, 9);
        Room room7 = new Room(6, 29, 9);
        Room room8 = new Room(3.5, 5.5, 9);
        Room room2 = new Room(27, 3.5, 6);
        Room room3 = new Room(3.3, 5.5, 4);
        Room room4 = new Room(3.3, 5.6, 4);
        Room[] rooms = {room1, room2, room3, room4, room5,room6,room7, room8};

        Arrays.sort(rooms);
        for(int i=0;i<rooms.length;i++){
            System.out.println( rooms[i].toString());
        }
    }



}


