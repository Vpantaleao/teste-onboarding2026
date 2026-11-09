package com.onboarding2026.teste.service;

import com.onboarding2026.teste.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.onboarding2026.teste.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }

    public User update(UUID id,User user) {
        return userRepository.save(user);

    }
    public void delete(UUID id) {
        if (!userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else { throw new RuntimeException("User com id " + id + "nao encontrado");
        }
    }
}
