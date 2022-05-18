package com.miu.swa.project.shoppingcartservice.repo;

import com.miu.swa.project.shoppingcartservice.model.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface ShoppingCartRepo extends MongoRepository<ShoppingCart, BigInteger> {
    Optional<ShoppingCart> findByShoppingCartID(BigInteger shoppingCartID);
}
