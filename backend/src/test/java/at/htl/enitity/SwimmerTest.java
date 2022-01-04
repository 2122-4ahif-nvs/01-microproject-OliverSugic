package at.htl.enitity;

import at.htl.control.SwimmerRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class SwimmerTest {

    @Inject
    SwimmerRepository repository;

    @Test
    void createSwimmer() {
        Swimmer swimmer =
                new Swimmer(
                        "Oliver",
                        "Sugic",
                        LocalDate.parse("05.08.2004", DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                        "breast stroke",
                        0,
                        0
                );
        assertThat(swimmer.getFirstname()).isEqualTo("Oliver");
        assertThat(swimmer.getLastname()).isEqualTo("Sugic");
        assertThat(swimmer.getDob()).isEqualTo(LocalDate.parse("05.08.2004", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        assertThat(swimmer.getBestStroke()).isEqualTo("breast stroke");
    }
}