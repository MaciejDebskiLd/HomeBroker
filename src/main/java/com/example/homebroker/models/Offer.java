package com.example.homebroker.models;


final public class Offer extends AbstractModel{

    private int ownerId;
    private HomeType homeType;
    private City city;
    private String street;
    private float size;
    private int rooms;

    public Offer() {
        super();
    }

    public Offer (Client owner, HomeType homeType, City city, String street, float size, int rooms){

        this(owner.getId(), homeType, city, street, size, rooms);
    }

    public Offer(int clientId, HomeType homeType, City city, String street, float size, int rooms) {

        super();
        this.ownerId = clientId;
        this.homeType = homeType;
        this.city = city;
        this.street = street;
        this.size = size;
        this.rooms = rooms;
    }

    public static Offer of (Client owner,HomeType homeType, City city, String street, float size, int rooms ){

        return new Offer(owner, homeType, city, street, size, rooms);
    }

    public static Offer of(int clientId, HomeType homeType, City city, String street, float size, int rooms){

        return new Offer(clientId, homeType, city, street, size, rooms);
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Offer{" + "id=" + id + ", homeType=" + homeType + ", city=" + city +", street=" + street +", size=" + size +", rooms=" + rooms +", ownerId=" + ownerId + '}';
    }
}
