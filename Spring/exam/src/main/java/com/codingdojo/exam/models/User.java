package com.codingdojo.exam.models;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Username is required!")
    @Size(min=3, max=30, message="Username must be between 3 and 30 characters")
    private String userName;

    @NotBlank(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;

    @NotBlank(message="Password is required!")
    @Size(min=6, max=128, message="Password must be between 8 and 128 characters")
    private String password;

    @Transient
    @NotBlank(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirm;

    @OneToMany(mappedBy="manager", fetch=FetchType.LAZY)
    private List<Celebrity> celebrities;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "celebrities_followers",
            joinColumns = @JoinColumn(name = "follower_id"),
            inverseJoinColumns = @JoinColumn(name = "celebrity_id")
    )

    private List<Celebrity> followings;
}