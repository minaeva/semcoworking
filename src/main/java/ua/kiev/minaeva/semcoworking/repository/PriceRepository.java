package ua.kiev.minaeva.semcoworking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kiev.minaeva.semcoworking.entity.Price;

import java.util.Optional;

public interface PriceRepository extends JpaRepository<Price, Integer> {

    Optional<Price> findById(Integer id);

    @Override
    Price save(Price price);

}
