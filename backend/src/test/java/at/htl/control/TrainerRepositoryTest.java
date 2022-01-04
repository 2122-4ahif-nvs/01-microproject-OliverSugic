package at.htl.control;

import at.htl.enitity.Squad;
import at.htl.enitity.Trainer;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class TrainerRepositoryTest {

    @Inject
    TrainerRepository trainerRepository;

    @Test
    void findAllSquadsOfActivTrainer() {
        List<Squad> squads = trainerRepository.findAllSquads();
        assertThat(squads.size()).isEqualTo(3);
    }

    @Test
    void findByLastname() {
        Trainer trainer = trainerRepository.findByLastname("Nachname");
        assertThat(trainer.getLastname()).isEqualTo("Nachname");
    }

    @Test
    void findAll(){
        List<Trainer> persons = trainerRepository.findAll();
        assertThat(persons.size()).isEqualTo(3);
    }
}