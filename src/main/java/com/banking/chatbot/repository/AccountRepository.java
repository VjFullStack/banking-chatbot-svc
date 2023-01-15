package com.banking.chatbot.repository;

import com.banking.chatbot.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing and manipulating account data in the database.
 * This interface extends Spring's {@link JpaRepository} to provide convenient methods
 * for performing common database operations.
 *
 * @author Viraj Salokhe
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}


