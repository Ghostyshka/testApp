package com.dev.testApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "created", columnDefinition = "BIGINT")
    private Long created;

    @Column(name = "updated", columnDefinition = "BIGINT")
    private Long updated;

    @Column(name = "full_name", columnDefinition = "VARCHAR")
    private String fullName;

    @Column(name = "email", columnDefinition = "VARCHAR")
    private String email;

    @Column(name = "phone", nullable = true ,columnDefinition = "VARCHAR")
    private String phone;

    @Column(name = "is_active", columnDefinition = "BOOL")
    private Boolean isActive = true;

    public void setActive(Boolean active) {
        isActive = active;
    }
}