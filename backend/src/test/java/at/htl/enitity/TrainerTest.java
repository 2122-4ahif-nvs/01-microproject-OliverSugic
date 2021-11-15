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

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class TrainerTest {


    @Inject
    TrainerRepository repository;

    @Test
    @Transactional
    void insertTest() {
        Trainer trainer =
                new Trainer(
                        "Testname",
                        "testname",
                        LocalDate.parse("01.01.2009", DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                );
        repository.insert(trainer);
    }
}