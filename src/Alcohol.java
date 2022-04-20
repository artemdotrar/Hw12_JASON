import java.time.LocalDate;

public class Alcohol {
    private String name;
    private int yearOfManufacture;

    public Alcohol(String name, int yearOfManufacture) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Alcohol(){

    }

    public String getName() {
        return name;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
