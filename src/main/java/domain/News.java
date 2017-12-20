package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NEWS", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class News {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public News(String name, String description){
        this.name = name;
        this.description = description;
    }
}
