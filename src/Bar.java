import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

public class Bar {

   @JsonProperty(value = "men")
    private Human barmen;

    @JsonIgnore
    private String address;

    @JsonProperty(value = "alco")
    private List<Alcohol> alcoholForDrink;

    public Bar() {

    }

    public Bar(Human barmen, String address, List<Alcohol> alcoholForDrink) {
        this.barmen = barmen;
        this.address = address;
        this.alcoholForDrink = alcoholForDrink;
    }

    public Human getBarmen() {
        return barmen;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "barmen=" + barmen.getFirstName() +
                ", address='" + address + '\'' +
                ", alcoholForDrink=" + alcoholForDrink.size() + " шт. " +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public List<Alcohol> getAlcoholForDrink() {
        return alcoholForDrink;
    }

    public void setBarmen(Human barmen) {
        this.barmen = barmen;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAlcoholForDrink(List<Alcohol> alcoholForDrink) {
        this.alcoholForDrink = alcoholForDrink;
    }
}
