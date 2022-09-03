package br.com.demo.quarkus.model.dto;

public class QuarkusUserDto {

    private String cpf;
    private String name;
    private String profession;
    private String email;
    private int age;

    public QuarkusUserDto(final String cpf,
                          final String name,
                          final String profession,
                          final String email,
                          final int age) {
        this.cpf = cpf;
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.age = age;
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
