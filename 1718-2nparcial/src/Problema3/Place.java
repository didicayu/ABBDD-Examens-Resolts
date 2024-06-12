package Problema3;

public final class Place {
    String placeName;
    public Place(String placeName) {
        if(placeName.isEmpty() || placeName == null ){ throw new RuntimeException(); }
        this.placeName = placeName;
    }
}
