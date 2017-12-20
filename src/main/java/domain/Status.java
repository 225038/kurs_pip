package domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "STATUS", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter @Setter
public class Status {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_status")
    private Integer id;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "job", cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    private Set<People> peopleEntities;

    public Status(String status){
        this.status = status;
    }
}
