import java.time.LocalDateTime;


public class Ticket {
    private Long id;
    private int departureZone;
    private int arrivalZone;
    private int routeNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Long buyerID;
    private boolean isUsed;
    private double price;
    private String place;

    public Ticket(Long id, int departureZone, int arrivalZone, int routeNumber,
                  LocalDateTime departureTime, LocalDateTime arrivalTime,
                  Long buyerID, boolean isUsed, double price, String place) {
        this.id = id;
        this.departureZone = departureZone;
        this.arrivalZone = arrivalZone;
        this.routeNumber = routeNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.buyerID = buyerID;
        this.isUsed = isUsed;
        this.price = price;
        this.place = place;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDepartureZone() {
        return departureZone;
    }

    public void setDepartureZone(int departureZone) {
        this.departureZone = departureZone;
    }

    public int getArrivalZone() {
        return arrivalZone;
    }

    public void setArrivalZone(int arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Long getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(Long buyerID) {
        this.buyerID = buyerID;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
