package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
