package com.employee.dao;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employees;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository(value = "employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addEmployees(Employees employee) {
        Transaction tx = null;
        try{
            tx = sessionFactory.getCurrentSession().beginTransaction();
            sessionFactory.getCurrentSession().save(employee);
            tx.commit();
        }catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public void editEmployees(Employees employee) {
        Employees employeeForUpdate= getEmployees(employee.getId());
        employeeForUpdate.setId(employee.getId());
        employeeForUpdate.setName(employee.getName());
        employeeForUpdate.setDepartment(employee.getDepartment());
        employeeForUpdate.setAddress(employee.getAddress());
        employeeForUpdate.setPhone(employee.getPhone());
        employeeForUpdate.setsalary(employee.getsalary());
        Transaction tx = null;
        try{
            tx = sessionFactory.getCurrentSession().beginTransaction();
            sessionFactory.getCurrentSession().update(employeeForUpdate);
            tx.commit();
        }catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public Employees getEmployees(int id) {
        Transaction tx = null;
        Employees employee = null;
        try{
            tx = sessionFactory.getCurrentSession().beginTransaction();
            employee = (Employees) sessionFactory.getCurrentSession().get(Employees.class, id);
            tx.commit();
        }catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
        return employee;
    }

    public void removeEmployees(int id) {
        Transaction tx = null;
        Employees employee = getEmployees(id);
        try{
            tx = sessionFactory.getCurrentSession().beginTransaction();
            sessionFactory.getCurrentSession().delete(employee);
            tx.commit();
        }catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    public List<Employees> listOfEmployees() {
        List<Employees> list = null;
        Transaction tx = null;
        try {
            tx = sessionFactory.getCurrentSession().beginTransaction();
            list = sessionFactory.getCurrentSession().createQuery("from Employees").list();
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
