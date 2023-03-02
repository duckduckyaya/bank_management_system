public class City {
    String cityName;
    String regionName;

    // create constructor for city and region
    public City(String cityName, String regionName) {
        this.cityName = cityName;
        this.regionName = regionName;
    }

    // toString
    @Override
    public String toString() {
        return cityName + " - " + regionName;
    }

}
