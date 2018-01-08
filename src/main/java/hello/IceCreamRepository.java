package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IceCreamRepository extends CrudRepository <IceCream,Long> {
    List<IceCream> findById(String flavours);
}
