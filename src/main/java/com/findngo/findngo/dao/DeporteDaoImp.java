package com.findngo.findngo.dao;

import com.findngo.findngo.models.Deporte;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class DeporteDaoImp implements DeporteDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Deporte> getDeportes() {
        String query = "FROM Deporte";
        return entityManager.createQuery(query).getResultList();
    }
}
