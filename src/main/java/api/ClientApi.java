package api;

import entities.Employee;
import entities.Person;
import entities.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class ClientApi {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction =null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            Person person= new Person();
            person.setName("Seddik");
            person.setGender("Male");

            Employee employee = new Employee();
            employee.setName("Mohamed");
            employee.setGender("Male");
            employee.setEmail("fredjmoh@gmail.com");
            employee.setSalary(2500.0);

            Student student = new Student();
            student.setName("Wafa");
            student.setGender("Femelle");
            student.setSchoolName("Fac centrale");

            transaction = session.beginTransaction();

            session.persist(person);
            session.persist(employee);
            session.persist(student);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if(transaction != null)  transaction.rollback();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();

            }
        }

    }
}