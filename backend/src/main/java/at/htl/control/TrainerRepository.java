package at.htl.control;

import at.htl.enitity.Squad;
import at.htl.enitity.Trainer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class TrainerRepository {
    @Inject
    EntityManager em;


    @Transactional
    public void insert(Trainer trainer) {
        em.merge(trainer);
    }
}
