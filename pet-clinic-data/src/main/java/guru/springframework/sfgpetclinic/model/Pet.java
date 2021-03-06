package guru.springframework.sfgpetclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pets")
public class Pet extends BaseEntity{

    @Builder
    public Pet(Long id, PetType petType, Owner owner, String name, LocalDate birthday, Set<Visit> visits){
        super(id);
        this.petType = petType;
        this.owner = owner;
        this.name = name;
        this.birthday = birthday;
        if(visits!=null && visits.size()>0){
            this.visits = visits;
        }


    }

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="type_id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    @Column(name="birth_date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();


}
