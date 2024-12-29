
class LectRoom {

    public int classCode;
    public String name;
    public int capacity;
    public int currentSeats;

    public LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        this.currentSeats = 0;
    }

    public boolean reserveSeats(int c) {
        boolean b = true;
        if (currentSeats + c > capacity) {
            b = false;
            return b;
        }
        currentSeats += c;
        return b;
    }
}
