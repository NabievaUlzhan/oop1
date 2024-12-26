class Booking {
    private Room room;
    private Guest guest;
    private String checkInDate;
    private String checkOutDate;

    String newLine = System.getProperty("line.separator");

    public Booking(Room room, Guest guest, String checkInDate, String checkOutDate) {
        if(guest == null && checkInDate == null && checkOutDate == null) {
            this.room = room;
        }
        else{
            this.room = room;
            this.guest = guest;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            room.setBooked(true);
        }
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return  room + newLine +
                (guest == null ? "Room is available" : guest) + newLine +
                (checkInDate == null || checkOutDate == null ? "" : "Check-in Date: " + checkInDate + " | " + "Check-out Date: " + checkOutDate + newLine)
                ;
    }
}