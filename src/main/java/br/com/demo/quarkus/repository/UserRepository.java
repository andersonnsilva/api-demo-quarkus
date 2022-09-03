package br.com.demo.quarkus.repository;

import br.com.demo.quarkus.model.QuarkusUser;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<QuarkusUser> {

    public QuarkusUser findByCpf(String cpf) {
        return find("cpf", cpf).firstResult();
    }
}
