package Ailton78.com.gitHub.couse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Ailton78.com.gitHub.couse.entities.OrderItem;
import Ailton78.com.gitHub.couse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
