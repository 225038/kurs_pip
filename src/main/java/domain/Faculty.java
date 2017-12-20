package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FACULTY", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class Faculty {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "points")
    private Integer points;

    public Faculty(String name, Integer points){
        this.name = name;
        this.points = points;
    }
}
