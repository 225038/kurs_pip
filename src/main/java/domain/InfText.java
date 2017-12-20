package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INF_TEXT", schema = "s225038", catalog = "studs")
//@ToString(exclude={"id","statusEntities"})//??
//@EqualsAndHashCode(exclude={"weaponEntities"})//??
//@NoArgsConstructor
@Getter
@Setter
public class InfText {
    @Id
    @Column(name = "menu_tab_name")
    private String menu_tab_name;

    @Column(name = "inf_text")
    private String inf_text;

    public InfText(String menu_tab_name, String inf_text){
        this.menu_tab_name = menu_tab_name;
        this.inf_text = inf_text;
    }
}
