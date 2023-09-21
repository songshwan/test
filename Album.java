package com.example.mypaging;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Album {
    private int userId;
    @Id
    private int id;
    private String title;
}
