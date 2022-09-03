package br.com.demo.quarkus.service.impl;

import br.com.demo.quarkus.model.QuarkusUser;
import br.com.demo.quarkus.model.dto.QuarkusUserDto;
import br.com.demo.quarkus.repository.UserRepository;
import br.com.demo.quarkus.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;

    @Override
    public QuarkusUser registerUser(QuarkusUserDto quarkusUserDto) {
        QuarkusUser quarkusUser = new QuarkusUser(quarkusUserDto);

        userRepository.persist(quarkusUser);

        return quarkusUser;
    }

    @Override
    public Optional<QuarkusUser> searchUser(String cpf) {
        return Optional.ofNullable(userRepository.findByCpf(cpf));
    }

    @Override
    public List<QuarkusUser> listAllUsers() {
        return userRepository.listAll();
    }

    @Override
    public QuarkusUser updateUser(QuarkusUserDto quarkusUserDto) {
        return null;
    }

    @Override
    public String deleteUser(String cpf) {
        return null;
    }
}
