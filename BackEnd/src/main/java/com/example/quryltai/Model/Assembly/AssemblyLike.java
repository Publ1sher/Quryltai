package com.example.quryltai.Model.Assembly;

import com.example.quryltai.Model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "assembly_likes")
public class AssemblyLike {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "assembly_id")
    private Assembly assembly;

    private LocalDateTime createdAt;
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

}
