package domain;

import javax.persistence.*;

@Entity
@Table(name = "DELIVERY", schema = "s225038", catalog = "studs")
public class Delivery {

    @Column(name = "number_of_servings")
    private int number_of_servings;

    public Delivery(int number_of_servings){
        this.number_of_servings = number_of_servings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Delivery delivery = (Delivery) o;

        if (number_of_servings != delivery.number_of_servings) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number_of_servings;
//        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}
