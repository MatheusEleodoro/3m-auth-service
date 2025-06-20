package com.threembank.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tokens")
public class TokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "refresh_token", nullable = false, length = 2048)
    private String token;

    @Column(name = "expire_at", nullable = false)
    private Instant expiresAt;

    @Column(name = "revoked",nullable = false)
    private boolean revoked;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private UserEntity user;
}
