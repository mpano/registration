/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entity.Student;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author kenny
 */
public class Dao {
    Session session = null;
   
  public void addStudent(Student st){
      try{
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(st);
        tr.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "student saved successfully");
      }catch(Exception ex){
        //ex.printStackTrace();
          JOptionPane.showMessageDialog(null, ex.getMessage(),"Student Error", JOptionPane.ERROR_MESSAGE);
      }
  }
  public ArrayList<Student>getStudent(){
     ArrayList<Student> list = new ArrayList<>();
     session = HibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     list = (ArrayList)session.createQuery("from Student").list();
     session.getTransaction().commit();
     session.close();
     return list;
  }
  public void updateStudent(Student st){
      try{
      session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      session.update(st);
      session.getTransaction().commit();
      session.close();
      JOptionPane.showMessageDialog(null, "Student update successfully");  
      }catch(Exception ex){
          ex.printStackTrace();
      }
  }
  public void deleteStudent(Student st){
      try{
          session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      session.delete(st);
      session.getTransaction().commit();
      session.close();
      JOptionPane.showMessageDialog(null, "Record deleted successfully");
      }catch(Exception ex){
          ex.printStackTrace();
      }
  }
}
