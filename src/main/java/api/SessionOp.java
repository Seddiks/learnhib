package api;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class SessionOp {
    static Session session = null;
    Transaction tx=null;

    public static Session getSession(){
        if(session ==null){
            Transaction transactionA = session.beginTransaction();
            Transaction transactionB = session.beginTransaction();

            return HibernateUtil.getSessionFactory().openSession();

        }
        return session;
    }

}
