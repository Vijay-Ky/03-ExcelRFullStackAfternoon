package com.spring.data.jpa.main.dao;

import com.spring.data.jpa.main.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Specialized annotation for repositories
//Supports component scanning
//Translates JDBC exceptions
/*
- The @Repository annotation in the Spring framework is used to mark a class as a repository. A repository is a class that provides access to data.
- The @Repository annotation is a specialization of the @Component annotation. This means that any class annotated with @Repository will also be automatically detected by Spring's dependency injection mechanism
- When using the @Repository annotation, you typically need to extend one of the Spring Data repository interfaces.
- These interfaces provide common methods for performing CRUD operations (create, read, update, delete) on data.
-
* */
@Repository
public class StudentDAOImplementation implements StudentDAO
{
    //define field for entity manager
    /*
    - EntityManager is an interface provided by the Java Persistence API (JPA) specification. It is used to manage the lifecycle of entities, which are objects that represent data in a database. EntityManager provides methods for creating, updating, deleting, and querying entities.
    - Here are some of the things you can do with EntityManager:

    Create a new entity.
    Update an existing entity.
    Delete an existing entity.
    Find an entity by its primary key.
    Query for entities that match a certain criteria.
    Persist changes to entities to the database.
    Roll back changes to entities.
    */
    private EntityManager entityManager;


    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImplementation(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    //implement save method
    //@Transactional annotation since we are performing an update
    //Be sure to select SpringFramework @Transactional
    /*
    The @Transactional annotation in the Spring Framework is used to declaratively manage transactions.
    - rollbackFor: This attribute specifies the exceptions that will cause the transaction to be rolled back.
    - noRollbackFor: This attribute specifies the exceptions that will not cause the transaction to be rolled back.
     */
    @Override
    public List<Student> findByLastName(String theLastName)
    {
        // create query
        //lastName is a field of JPA entity
        //The :theData placeholder in Spring Data JPA is used to represent the data that is returned from a query. It is a special placeholder that is recognized by Spring Data JPA and is used to bind the results of the query to a variable
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "FROM Student WHERE lastName=:theData", Student.class);

        // set query parameters
        theQuery.setParameter("theData", theLastName);

        // return query results
        return theQuery.getResultList();
    }

}

