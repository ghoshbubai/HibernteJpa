package com.sony.JpaTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Students s2=new Students();
    	s2.setSid(51);
    	s2.setMarks(85);
    	s2.setSname("Sahil");
    	
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        EntityManager em=emf.createEntityManager();
        
        //Students s1=em.find(Students.class,4);
        em.getTransaction().begin();
        em.persist(s2);
        em.getTransaction().commit();
        
        System.out.println(s2);
        
    }
}
