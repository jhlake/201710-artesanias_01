/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.artesanias.persistence;

import co.edu.uniandes.csw.artesanias.entities.UsuarioEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
/**
 *
 * @author jm.munoz14
 */

public class UsuarioPersistence {

    @PersistenceContext(unitName = "feriaPU")
    protected EntityManager em;

    public UsuarioEntity createUsuario(UsuarioEntity entity) {
        em.persist(entity);

        return entity;
    }

    public UsuarioEntity findUsuario(long id) {

        return em.find(UsuarioEntity.class, id);

    }

    public UsuarioEntity updateUsuario(UsuarioEntity entity) {

        return em.merge(entity);

    }

    public void deleteUsuario(long id) {

        UsuarioEntity entity = em.find(UsuarioEntity.class, id);
        em.remove(entity);
    }

    public List<UsuarioEntity> findAllUsuarios() {
        TypedQuery<UsuarioEntity> q = em.createQuery("select u from UsuarioEntity u", UsuarioEntity.class);
        return q.getResultList();

    }

}
