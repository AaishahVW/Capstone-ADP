package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
