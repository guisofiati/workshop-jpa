package github.guisofiati.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.guisofiati.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}