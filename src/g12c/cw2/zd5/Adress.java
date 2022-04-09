package g12c.cw2.zd5;

public class Adress {

    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) throws IllegalAccessException {
        if(country == null || country.isEmpty())
        {
            throw new IllegalAccessException("Country can't be empty");
        }
        this.country = country;
    }


    public String getCity() {
        return city;
    }
    public void setCity(String city) throws IllegalAccessException {
        if(city== null || city.isEmpty())
        {
            throw new IllegalAccessException("City can't be empty");
        }
        this.city = city;
    }


    public String getStreet() {
        return street;
    }
    public void setStreet(String street) throws IllegalAccessException {
        if(street == null || street.isEmpty())
        {
            throw new IllegalAccessException("Street can't be empty");
        }
        this.street = street;
    }


    public int getHouse() {
        return house;
    }
    public void setHouse(int house) throws IllegalAccessException {
        if(house == 0)
        {
            throw new IllegalAccessException("House can't be 0");
        }
        this.house = house;
    }


    public int getFlat() {
        return flat;
    }
    public void setFlat(int flat) throws IllegalAccessException {
        if(flat == 0)
        {
            throw new IllegalAccessException("Flat can't be 0");
        }
        this.flat = flat;
    }




}
