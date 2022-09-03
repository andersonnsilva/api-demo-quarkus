package br.com.demo.quarkus.service;

import br.com.demo.quarkus.model.QuarkusUser;
import br.com.demo.quarkus.model.dto.QuarkusUserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    QuarkusUser registerUser(QuarkusUserDto quarkusUserDto);

    Optional<QuarkusUser> searchUser(String cpf);

    List<QuarkusUser> listAllUsers();

    QuarkusUser updateUser(QuarkusUserDto quarkusUserDto);

    String deleteUser(String cpf);
}
