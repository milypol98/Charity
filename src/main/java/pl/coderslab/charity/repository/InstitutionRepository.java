package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.entity.Institution;

import java.util.List;

public interface InstitutionRepository extends JpaRepository <Institution , Long> {

    @Query(value = "SELECT * FROM institution limit 4",nativeQuery = true)
    List<Institution> fourElements();
}
