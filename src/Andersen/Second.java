package Andersen;

public class Second {
    void shouldReplyToVyacheslavOnly(String name) {
        if (name == "Вячеслав") {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
