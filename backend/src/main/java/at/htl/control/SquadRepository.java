package at.htl.control;

import at.htl.enitity.Squad;
import at.htl.enitity.Swimmer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class SquadRepository {

    @Inject
    EntityManager em;
    
    
    @Transactional
    public void insert(Squad squad) {
        em.merge(squad);
    }
}
