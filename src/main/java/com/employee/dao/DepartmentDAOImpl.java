package com.employee.dao;

import com.employee.model.Department;
import com.employee.dao.DepartmentDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository(value = "departmentDAO")
public class DepartmentDAOImpl implements DepartmentDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public DepartmentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<Department> listOfDepartment() {
        List<Department> list = null;
        Transaction tx = null;
        try {
            tx = sessionFactory.getCurrentSession().beginTransaction();
            list = sessionFactory.getCurrentSession().createQuery("from Department").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
        return list;
    }

    private SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private Session getCurrentSession() {
        Session session = getSessionFactory().getCurrentSession();
        if (session == null) {
            session = getSessionFactory().openSession();
        }
        return session;
    }
}
