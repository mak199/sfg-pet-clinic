package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    void save(T object);

    void delete(T object);

    void deleteByid(ID id);
}
