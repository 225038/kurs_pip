package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOSPITAL", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class Hospital {
    @Id
    @Column(name = "bed_number")
    private Integer bed_number;

    @Column(name = "comments")
    private String comments;

    public Hospital(Integer bed_number, String comments){
        this.bed_number = bed_number;
        this.comments = comments;
    }
}
