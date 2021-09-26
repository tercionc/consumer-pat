package br.com.alelo.consumer.consumerpat.repository;

import br.com.alelo.consumer.consumerpat.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    Optional<Card> findByCardNumber(Integer cardNumber);
}
