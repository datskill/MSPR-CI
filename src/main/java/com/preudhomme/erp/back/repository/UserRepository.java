package com.preudhomme.erp.back.repository;

import com.preudhomme.erp.back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
