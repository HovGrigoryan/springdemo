package am.itspace.springdemo.repository;

import am.itspace.springdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

//    @Query(value = "select * from user where name = :name", nativeQuery = true)
//    List<User> findAllByName(@Param("name") String name);

}
