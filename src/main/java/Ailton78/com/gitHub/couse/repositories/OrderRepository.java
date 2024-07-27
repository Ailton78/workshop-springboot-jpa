package Ailton78.com.gitHub.couse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Ailton78.com.gitHub.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
