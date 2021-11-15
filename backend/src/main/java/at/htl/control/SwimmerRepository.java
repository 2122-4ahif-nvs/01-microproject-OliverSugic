package at.htl.control;

import at.htl.enitity.Swimmer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.lang.annotation.Inherited;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ApplicationScoped
public class SwimmerRepository {

    @Inject
    EntityManager em;
    
    
    @Transactional
    public void insert(Swimmer swimmer) {
        em.merge(swimmer);
    }
}
