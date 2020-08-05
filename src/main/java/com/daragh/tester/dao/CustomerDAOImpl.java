package com.daragh.tester.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daragh.tester.entity.loanCust;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < loanCust > getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < loanCust > cq = cb.createQuery(loanCust.class);
        Root < loanCust > root = cq.from(loanCust.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        loanCust book = session.byId(loanCust.class).load(id);
        session.delete(book);
    }

    @Override
    public void saveCustomer(loanCust theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public loanCust getCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        loanCust theCustomer = currentSession.get(loanCust.class, theId);
        return theCustomer;
    }
}