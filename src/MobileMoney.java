import java.util.Objects;

public class MobileMoney {
    public static void displayChoices(String[] choices) {
        for (int i = 0; i < choices.length; i++) {
            String output;
            if (choices.length == (i + 1) && Objects.equals(choices[i], "Back")) {
                output = "0) " + choices[i];
            } else
                output = (i + 1) + ") " + choices[i];
            System.out.println(output);
        }
    }
}
