package quoters;

import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Person {
    private String name;
    private String family;

    public Person(String имя, String фамилия) {
        this.name = имя;
        this.family = фамилия;
    }
}
