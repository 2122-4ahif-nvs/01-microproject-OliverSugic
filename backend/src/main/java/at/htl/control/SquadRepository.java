package at.htl.control;

import at.htl.enitity.Squad;
import at.htl.enitity.Swimmer;
import at.htl.enitity.Trainer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class SquadRepository {

    @Inject
    EntityManager em;
    
    
    @Transactional
    public void insert(Squad squad) {
        em.merge(squad);
    }

    public List<Squad> findAllSquads(){
        TypedQuery<Squad> query = em.createNamedQuery("Squad.findAll",Squad.class);
        return query.getResultList();
    }

    public Squad findByName(String name){
        TypedQuery<Squad> query = em
                .createNamedQuery("Squad.findByName",Squad.class)
                .setParameter("NAME",name);
        return query.getSingleResult();
    }
}
