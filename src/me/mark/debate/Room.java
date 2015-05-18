package me.mark.debate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volkovma on 5/13/15.
 */
public class Room {

    private int roomNum;
    private List<Boolean> available;
    public static List<Room> rooms = new ArrayList<Room>();

    public static Room getRoom(int num) {
        for (Room r : rooms) {
            if (r.getRoomNum() == num) {
                return r;
            }
        }
        return null;
    }

    public Room(int roomNum) {
        this.roomNum = roomNum;
        this.available = new ArrayList<Boolean>();
        for (int i = 0; i<4; i++) {
            available.add(false);
        }
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setAvailable(int round, boolean bool) {//Round will come in as 1, 2, 3, or 4, not 0
        available.set(round-1, bool);
    }

    public List<Boolean> getAvailable() {
        return available;
    }
}
