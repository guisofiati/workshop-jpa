package github.guisofiati.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.guisofiati.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}