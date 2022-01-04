package at.htl.enitity;

import at.htl.control.SwimmerRepository;
import at.htl.control.TrainerRepository;
import io.agroal.api.AgroalDataSource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class TrainerTest {
    @Test
    void insertTest() {
        Trainer trainer =
                new Trainer(
                        "Testname",
                        "testname",
                        LocalDate.parse("01.01.1980", DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                );
        assertThat(trainer.getFirstname()).isEqualTo("Testname");
        assertThat(trainer.getLastname()).isEqualTo("testname");
        assertThat(trainer.getDob()).
                isEqualTo(LocalDate.parse("01.01.1980", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}