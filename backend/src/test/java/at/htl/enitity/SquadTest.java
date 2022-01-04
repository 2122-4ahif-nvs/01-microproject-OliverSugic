package at.htl.enitity;

import at.htl.control.SquadRepository;
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
class SquadTest {

    @Inject
    SquadRepository repository;


    @Test
    @Transactional
    void insertTest() {
        Squad squad =
                new Squad(
                        "A-Kader",
                        LocalDate.parse("01.01.2009", DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                );
        assertThat()
    }

}