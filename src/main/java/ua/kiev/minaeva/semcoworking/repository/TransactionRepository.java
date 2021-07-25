package ua.kiev.minaeva.semcoworking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kiev.minaeva.semcoworking.entity.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Override
    Transaction save(Transaction transaction);

    @Override
    List<Transaction> findAll();

    @Override
    Optional<Transaction> findById(Integer id);

    Optional<List<Transaction>> findAllByVisitor_Id(Integer id);

    Optional<List<Transaction>> findAllByDate(LocalDate date);
}
