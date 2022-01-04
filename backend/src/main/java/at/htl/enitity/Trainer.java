package at.htl.enitity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NamedQueries({
          @NamedQuery(
                name = "Trainer.findByLastname",
                query = "select t from Trainer t where t.lastname LIKE :LASTNAME"
        ),
        @NamedQuery(
                name = "Trainer.findAll",
                query = "select t from Trainer t"
        )
})
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String firstname;
    String lastname;
    LocalDate dob;

    @OneToMany
    List<Squad> squads;

    public Trainer() {
    }

    public Trainer(String firstname, String lastname, LocalDate dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.squads = squads;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Squad> getSquads() {
        return squads;
    }

    public void setSquads(List<Squad> squads) {
        this.squads = squads;
    }
}
