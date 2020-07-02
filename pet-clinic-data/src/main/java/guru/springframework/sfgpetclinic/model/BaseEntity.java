package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

// Base class of JPA
// Doing inheritance, we dont need this specific class capped to the database
@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    public BaseEntity(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
