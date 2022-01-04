package at.htl.control;

import at.htl.enitity.Squad;
import at.htl.enitity.Trainer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class TrainerRepository {
    @Inject
    EntityManager em;

    @Transactional
    public void insert(Trainer trainer) {
        em.merge(trainer);
    }

    public List<Squad> findAllSquads(){
        TypedQuery<Trainer> query = em.createNamedQuery("Trainer.findAll",Trainer.class);
        List<Trainer> trainers = query.getResultList();
        List<Squad> squads = new ArrayList<>();
        for (Trainer trainer: trainers){
            squads.addAll(trainer.getSquads());
        }
        return squads;
    }

    public Trainer findByLastname(String lastname){
        TypedQuery<Trainer> query = em
                .createNamedQuery("Trainer.findByLastname",Trainer.class)
                .setParameter("LASTNAME",lastname);
        return query.getSingleResult();

    }
    public List<Trainer> findAll(){
        TypedQuery<Trainer> query = em
                .createNamedQuery("Trainer.findAll",Trainer.class);
        return query.getResultList();

    }
}
