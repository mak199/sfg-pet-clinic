package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);

    //@Query("SELECT u FROM Owner u WHERE u.lastName = :lastName")
    List<Owner> findAllByFirstNameLike(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
