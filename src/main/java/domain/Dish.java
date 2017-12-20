package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "DISH", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class Dish {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "cooking_time")
    private LocalTime cooking_time;

    public Dish(String name, String description, LocalTime cooking_time){
        this.name = name;
        this.description = description;
        this.cooking_time = cooking_time;
    }
}
