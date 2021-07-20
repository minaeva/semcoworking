package ua.kiev.minaeva.semcoworking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kiev.minaeva.semcoworking.entity.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Override
    Optional<Transaction> findById(Integer id);

    List<Transaction> findAll();

    Optional<List<Transaction>> findAllByDate(LocalDate date);

    Optional<List<Transaction>> findAllByVisitor_Id(Integer id);

    @Override
    Transaction save(Transaction transaction);
}
