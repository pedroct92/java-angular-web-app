package com.spring.h2.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.h2.models.SimpleTimeJPA;
import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.repositories.SimpleTimeRepository;

/**
 *
 * @author amanganiello90
 */

@Repository
public class SimpleTimeDAO implements SimpleTimeRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public SimpleTime findById(String id) {
		// TODO Auto-generated method stub
		return entityManager.find(SimpleTimeJPA.class, id);

	}

	@Override
	@Transactional
	public SimpleTime save(SimpleTime time) {
		// TODO Auto-generated method stub
		SimpleTime object = this.findById(time.getId());
		if (object != null) {
			if (object.getId().equals(time.getId())) {
				entityManager.merge(time);
				return time;
			}
		}
		entityManager.persist(time);
		return time;
	}

	@Override
	public List<SimpleTime> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT t FROM SimpleTimeJPA t");
		return query.getResultList();
	}

}
