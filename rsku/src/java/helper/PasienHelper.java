/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Pasien;
import util.NewHibernateUtil;

/**
 *
 * @author basisa18
 */
public class PasienHelper {
    public PasienHelper(){
        
    }
    public List<Pasien> getAllPasien(){
    List<Pasien> result = null;
    Session session = new NewHibernateUtil().getSessionFactory().openSession();
    String query = "from Pasien p";
    Query q = session.createQuery(query);
    result = q.list();
    session.close();
    return result;
}
}
