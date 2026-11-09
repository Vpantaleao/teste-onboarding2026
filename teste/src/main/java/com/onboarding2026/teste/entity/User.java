package com.onboarding2026.teste.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tabela_user")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(unique = true, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

}

