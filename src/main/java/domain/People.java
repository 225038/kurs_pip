package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PEOPLE", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class People {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "login")
    private String login;

    @Column(name = "p_password")
    private String password;

    @Column(name = "health")
    private Integer health;

    @Column(name = "fatigue")
    private Integer fatigue;

    public People(String name, String surname, String login,
                String password, Integer health, Integer fatigue){
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.health = health;
        this.fatigue = fatigue;
    }
}
