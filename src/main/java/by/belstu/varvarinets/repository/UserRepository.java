package by.belstu.varvarinets.repository;
import by.belstu.varvarinets.model.*;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UsersEntity,Integer> {
}
