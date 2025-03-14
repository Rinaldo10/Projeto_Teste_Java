package my.project.example.userms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class User {

    private static final String NAME = "name";
    private static final String PHONE = "phone";
    private static final String ID = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    @Column(name = ID)
    private Long id;

    @Column(name = NAME)
    private String name;

    @Column(name = PHONE)
    private String phoneNumber;

    public User(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Construtor padrão (obrigatório para JPA)
    public User() {
    }
}