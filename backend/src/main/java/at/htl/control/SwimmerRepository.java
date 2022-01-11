package at.htl.control;

import at.htl.enitity.Swimmer;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SwimmerRepository {

    @Inject
    EntityManager em;

    public List<Swimmer> findAll() {
        TypedQuery<Swimmer> query = em.createNamedQuery("Swimmer.findAllSwimmer", Swimmer.class);
        return query.getResultList();
    }

    public Swimmer findByLastname(String lastname) {
        TypedQuery<Swimmer> query = em
                .createNamedQuery("Swimmer.findByLastname", Swimmer.class)
                .setParameter("LASTNAME", lastname);
        return query.getSingleResult();
    }

    public Swimmer findSwimmer(Long id) {
        List<Swimmer> list = findAll();
        for (Swimmer swimmer : list
        ) {
            if (swimmer.getId().equals(id)) {
                return swimmer;
            }
        }
        return null;
    }

    @Transactional
    public void insert(Swimmer swimmer) {
        em.merge(swimmer);
    }
}
