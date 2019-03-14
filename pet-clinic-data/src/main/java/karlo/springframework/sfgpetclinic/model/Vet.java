package karlo.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToOne(fetch =  FetchType.EAGER)
    @JoinTable(name = "vet_specialitites", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
