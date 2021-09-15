package github.guisofiati.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import github.guisofiati.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}