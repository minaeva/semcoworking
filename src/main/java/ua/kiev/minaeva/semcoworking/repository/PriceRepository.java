package ua.kiev.minaeva.semcoworking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;
import ua.kiev.minaeva.semcoworking.entity.Price;

import java.util.List;
import java.util.Optional;

public interface PriceRepository extends JpaRepository<Price, Integer> {

    @Override
    Price save(Price price);

    @Override
    List<Price> findAll();

}
