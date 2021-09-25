package tacos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
// <-- These two here provide getters and setters along with constructor with arguments

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Entity
public class Ingredient {

    @Id
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}