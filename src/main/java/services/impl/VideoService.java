package services.impl;

import Entity.Video;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class VideoService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");

    public List<Video> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Video> videos = em.createNamedQuery("Video.findAll", Video.class).getResultList();
        em.close();
        return videos;
    }

    public void create(Video video) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(video);
        em.getTransaction().commit();
        em.close();
    }

    public Video find(String videoId) {
        EntityManager em = emf.createEntityManager();
        Video video = em.find(Video.class, videoId);
        em.close();
        return video;
    }

    public void update(Video video) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(video);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(String videoId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Video video = em.find(Video.class, videoId);
        if (video != null) {
            em.remove(video);
        }
        em.getTransaction().commit();
        em.close();
    }
}
