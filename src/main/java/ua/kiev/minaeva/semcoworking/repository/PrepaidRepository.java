package ua.kiev.minaeva.semcoworking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kiev.minaeva.semcoworking.entity.Prepaid;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PrepaidRepository extends JpaRepository<Prepaid, Integer> {

    @Override
    List<Prepaid> findAll();

    Optional<Prepaid> findById(Integer id);

    Optional<Prepaid> findByStartDate(LocalDate date);

    @Override
    void deleteById(Integer id);

}
