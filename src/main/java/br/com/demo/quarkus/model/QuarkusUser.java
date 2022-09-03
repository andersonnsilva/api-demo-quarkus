package br.com.demo.quarkus.model;

import br.com.demo.quarkus.model.dto.QuarkusUserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuarkusUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String name;
    private String profession;
    private String email;
    private int age;

    public QuarkusUser() {
    }

    public QuarkusUser(QuarkusUserDto quarkusUserDto) {
        this.cpf = quarkusUserDto.getCpf();
        this.name = quarkusUserDto.getName();
        this.profession = quarkusUserDto.getProfession();
        this.email = quarkusUserDto.getEmail();
        this.age = quarkusUserDto.getAge();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
