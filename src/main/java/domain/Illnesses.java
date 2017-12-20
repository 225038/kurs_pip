package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ILLNESSES", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class Illnesses {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "illness")
    private String illness;

    @Column(name = "cause")
    private String cause;

    public Illnesses(String illness, String cause){
        this.illness = illness;
        this.cause = cause;
    }
}
