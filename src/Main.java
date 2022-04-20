import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      Human human1 = new Human("Ivan", "Ivanov", 21);
//      ObjectMapper objectMapper = new ObjectMapper();
//
//      try {
//          String strJson = objectMapper.writeValueAsString(human1);
//          System.out.println(strJson);
//
//          Human human2 = objectMapper.readValue(strJson, Human.class);
//          System.out.println(human2);
//
//      } catch (JacksonException e) {
//          e.printStackTrace();
//      }

        List<Alcohol> alcoholBar = new ArrayList<>();
        alcoholBar.add(new Alcohol("JackDaniels", 2007));
        alcoholBar.add(new Alcohol("RedLabel", 2008));
        Human barmen = new Human("Jenya", "Teachmeskillsovich", 1996);
        Bar bar = new Bar(barmen, "Eseneina 6", alcoholBar);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(bar);
            System.out.println("JSON STR: " + jsonStr);
            Bar bar2 = objectMapper.readValue(jsonStr, Bar.class);
            System.out.println("Расшифрованный класс: " + bar2);

        } catch (JacksonException e) {
            e.printStackTrace();
        }
    }
}
