package com.poly.hangnt169.B8_CRUDHibernate.repository;

import com.poly.hangnt169.B8_CRUDHibernate.entity.Category;
import com.poly.hangnt169.B8_CRUDHibernate.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt169
 */
public class CategoryRepository {

    // CRUD <=> CREATE , READ, UPDATE , DELETE
    // GET ALL
    public List<Category> getAll() {
        List<Category> lists = new ArrayList<>();
        // code
        // try..with resource
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM Category", Category.class);
            lists = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    // GET ONE
    public Category getOne(Long id) {
        Category category = null;
        // Code
        // try..with resource
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM Category WHERE id =: id1", Category.class);
            query.setParameter("id1", id);
            category = (Category) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }

    // ADD
    public Boolean add(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Add : save/ saveOrUpdate/ persist
            session.persist(category);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Update
    public Boolean update(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Update :saveOrUpdate/ merge
            session.merge(category);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Delete
    public Boolean delete(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Delete : delete
            session.delete(category);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
//        new CategoryRepository().getAll().forEach(s -> System.out.println(s.toString()));
        System.out.println(new CategoryRepository().getOne(1L));
    }
}
