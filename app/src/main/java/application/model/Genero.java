package application.model;

import jakarta.persistence.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="generos")
Public class Genero {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private string nome;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public string getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}