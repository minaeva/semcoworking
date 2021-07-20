package ua.kiev.minaeva.semcoworking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kiev.minaeva.semcoworking.entity.Prepaid;
import ua.kiev.minaeva.semcoworking.entity.Visitor;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface VisitorRepository extends JpaRepository<Visitor, Integer> {

    @Override
    List<Visitor> findAll();

    @Override
    Optional<Visitor> findById(Integer integer);

    Optional<Visitor> findByPrepaid(Prepaid prepaid);

    @Override
    Visitor save(Visitor visitor);

    void deleteById(Integer id);
}
