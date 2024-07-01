package com.example.nexa.repository;

import com.example.nexa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Transactional
    @Query(value = "SELECT * FROM client WHERE email = ?1 AND password = ?2", nativeQuery = true)
    Client getClientByClientEmailAndPassword(String email, String password);
    Client findByEmail(String email);
    boolean existsByEmail(String email);


    //feedback save
//    @Query(value = "INSERT INTO feedback (email, comment, s3url, question1, question2, question3, question4) VALUES (:email, :comment, :s3url, :question1, :question2, :question3, :question4)", nativeQuery = true)
//    void insertFeedback(@Param("email") String email, @Param("comment") String comment, @Param("question1") String question1, @Param("question2") String question2, @Param("question3") String question3, @Param("question4") String question4, @Param("s3url") String s3url);

    //Feedback save new
    @Modifying
    @Query(value = "UPDATE client SET feedback = :comment, question1 = :question1, question2 = :question2, question3 = :question3, question4 = :question4, feedback_url = :s3url WHERE email = :email", nativeQuery = true)
    void insertFeedback(@Param("email") String email, @Param("comment") String comment, @Param("question1") String question1, @Param("question2") String question2, @Param("question3") String question3, @Param("question4") String question4, @Param("s3url") String s3url);

}
