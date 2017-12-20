package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ILLNESS_TYPE", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class IllnessType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type")
    private String type;

    public IllnessType(String type){
        this.type = type;
    }
}
