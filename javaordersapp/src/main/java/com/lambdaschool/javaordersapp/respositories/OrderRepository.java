package com.lambdaschool.javaordersapp.respositories;

import com.lambdaschool.javaordersapp.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
