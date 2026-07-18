package br.com.felipe.springoteca.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "editora")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditoraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
