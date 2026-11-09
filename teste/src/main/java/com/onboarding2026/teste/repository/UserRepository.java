package com.onboarding2026.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import com.onboarding2026.teste.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
