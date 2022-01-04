package at.htl.enitity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Squad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    Integer ageForSquad;

    @ManyToOne
    Trainer trainer;

    @OneToMany
    List<Swimmer> swimmers;

    public Squad() {
    }

    public Squad(String name, Integer ageForSquad) {
        this.name = name;
        this.ageForSquad = ageForSquad;
    }
    public Squad(String name, Integer ageForSquad,Trainer trainer, List<Swimmer> swimmers)
    {
        this(name,ageForSquad);
        this.trainer = trainer;
        this.swimmers = swimmers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgeForSquad() {
        return ageForSquad;
    }

    public void setAgeForSquad(Integer ageForSquad) {
        this.ageForSquad = ageForSquad;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Swimmer> getSwimmers() {
        return swimmers;
    }

    public void setSwimmers(List<Swimmer> swimmers) {
        this.swimmers = swimmers;
    }
}
