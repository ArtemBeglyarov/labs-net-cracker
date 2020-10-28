package Task2.buildings;


import Task3.InvalidRoomsCountException;
import Task3.InvalidSpaceAreaException;

public class Flat {

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", room=" + room +
                '}';
    }
    private static final int AREA_DEFAULT = 50;
    private static final int ROOM_DEFAULT = 2;

    private int area;
    private int room;

    public Flat() {
        this.area = AREA_DEFAULT;
        this.room = ROOM_DEFAULT;
    }

    public Flat(int area) throws InvalidSpaceAreaException {
        if (area <= 0) {
            throw new InvalidSpaceAreaException("incorrect Area \n area must be greater than 0");
        }
        room = 1;
        this.area = area;

    }

    public Flat(int room, int area) throws InvalidRoomsCountException, InvalidSpaceAreaException {
        if (area <= 0 & area > 200) {
            throw new InvalidSpaceAreaException("incorrect Area \n area must be greater than 0");
        }
        if (room <= 0 & room > 5) {
            throw new InvalidRoomsCountException("incorrect Room \n area must be greater than 0");
        }
        this.room = room;
        this.area = area;

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) throws InvalidSpaceAreaException {
        if (area <= 0 & area > 200) {
            throw new InvalidSpaceAreaException("incorrect Area \n area must be greater than 0");
        }
        this.area = area;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) throws InvalidRoomsCountException {
        if (room <= 0 & room > 5) {
            throw new InvalidRoomsCountException("incorrect Room \n area must be greater than 0");
        }
        this.room = room;
    }
}
