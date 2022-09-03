package br.com.demo.quarkus;

import br.com.demo.quarkus.model.QuarkusUser;
import br.com.demo.quarkus.model.dto.QuarkusUserDto;
import br.com.demo.quarkus.service.UserService;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    @Transactional
    public Response registerUser() {
        QuarkusUserDto quarkusUserDto = new QuarkusUserDto(
                "40460565842",
                "Anderson",
                "Analista de Engenharia de TI",
                "anderson.nunes-silva@gmail.com",
                28
        );
        return Response.ok(userService.registerUser(quarkusUserDto)).build();
    }

    @GET
    public Response listAllUsers() {
        return Response.ok(userService.listAllUsers()).build();
    }

    @GET
    @Path("/{cpf}")
    public Response searchUser(@PathParam("cpf") String cpf) {
        Optional<QuarkusUser> optionalUser = userService.searchUser(cpf);

        if (optionalUser.isPresent()) {
            return Response.ok(userService.searchUser(cpf)).build();
        }

        return Response.noContent().build();
    }
}
