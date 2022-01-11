package at.htl.control;

import at.htl.enitity.Swimmer;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class SwimmerRepositoryTest {

    @Inject
    SwimmerRepository swimmerRepository;

    @Test
    void findAll() {
        List<Swimmer> swimmers = swimmerRepository.findAll();
        assertThat(swimmers.size()).isEqualTo(4);
    }

    @Test
    void findByLastname() {
        Swimmer swimmer = swimmerRepository.findByLastname("Sugic");
        assertThat(swimmer).isNotNull();
    }
}