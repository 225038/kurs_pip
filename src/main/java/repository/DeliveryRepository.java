package repository;

import domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

//    List<Delivery> findByLogin(String login);
//    List<Delivery> findByPresent(boolean present);
//    @Modifying
//    @Transactional
//    @Query("delete from Human  human where human.login =?1")
//    void removeByLogin(String login);
//    @Modifying
//    @Transactional
//    @Query(" update Human set  login=:login, password=:password where login=:prevLog")
//    void updateHuman( @Param("login") String login, @Param("password") String passw, @Param("prevLog") String prevLOg);
//    @Modifying
//    @Transactional
//    @Query(" update Human set  present=:present ")
//    void update( @Param("present") boolean pres);
}
