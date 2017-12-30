package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(null, "Denize", "denizeom@gmail.com");
        //Pessoa p2 = new Pessoa(null, "Fernando", "yankersantos@gmail.com");
        //Pessoa p3 = new Pessoa(null, "Teste", "teste@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        //salvar
        //em.getTransaction().begin();
        //em.persist(p1);
        //em.persist(p2);
        //em.persist(p3);
        //em.getTransaction().commit();

        //buscar
        //Pessoa p = em.find(Pessoa.class, 2);
        //System.out.println(p);

        //apagar
        //em.getTransaction().begin();
        //em.remove(p);
        //em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();


    }
}
