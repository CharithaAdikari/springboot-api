package com.example.nexa.repo;


import com.example.nexa.entity.Generate;
import com.example.nexa.entity.InteriorImage;
import com.example.nexa.entity.InteriorKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InteriorImageRepo extends JpaRepository<InteriorImage, InteriorKey> {
    @Query(value = "SELECT * FROM interior_image WHERE email =?1 AND id =?2",nativeQuery = true)
    InteriorImage getInteriorBYEmailAndId(String email, String id);

    List<InteriorImage> findByEmail(String email);

    List<InteriorImage> findByClientEmail(String email);
}