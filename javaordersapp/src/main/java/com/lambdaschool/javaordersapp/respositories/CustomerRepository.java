package com.lambdaschool.javaordersapp.respositories;

import com.lambdaschool.javaordersapp.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
