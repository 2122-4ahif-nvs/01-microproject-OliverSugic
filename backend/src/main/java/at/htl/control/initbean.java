package at.htl.control;

import at.htl.enitity.Swimmer;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ApplicationScoped
public class initbean {

    @Inject
    SwimmerRepository srepo;

    void init(@Observes StartupEvent event) {
        Swimmer p =
                new Swimmer(
                        "Susi",
                        "hansi",
                        LocalDate.parse("01.01.2007", DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                        "Kraul",
                        360,
                        100
                        );
        srepo.insert(p);
    }

}
