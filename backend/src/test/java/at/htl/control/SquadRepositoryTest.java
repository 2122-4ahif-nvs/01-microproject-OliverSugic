package at.htl.control;

import at.htl.enitity.Squad;
import at.htl.enitity.Trainer;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class SquadRepositoryTest {
    @Inject
    SquadRepository squadRepository;

    @Test
    void findAllSquads() {
        List<Squad> squads = squadRepository.findAllSquads();
        assertThat(squads.size()).isEqualTo(3);
    }

    @Test
    void findByName() {
        Squad squad = squadRepository.findByName("A-Kader");
        assertThat(squad.getName()).isEqualTo("A-Kader");
    }
}