package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "RAID", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class Raid {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "expired_fatidue")
    private Integer expired_fatigue;

    @Column(name = "min_expired_health")
    private Integer min_expired_health;

    @Column(name = "max_expired_health")
    private Integer max_expired_health;

    @Column(name = "illness_probability")
    private Integer illness_probability;

    public Raid(String name, String description, Integer expired_fatigue,
                Integer min_expired_health, Integer max_expired_health, Integer illness_probability){
        this.name = name;
        this.description = description;
        this.expired_fatigue = expired_fatigue;
        this.min_expired_health = min_expired_health;
        this.max_expired_health = max_expired_health;
        this.illness_probability = illness_probability;
    }
}
