package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Admin;

public interface IAdminRepository extends JpaRepository<Admin, String> {
}
