package br.com.luanmissel.todolist.users;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    public final IUserRepository UserRepository;

    public UserController(IUserRepository userRepository) {
        UserRepository = userRepository;
    }

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.UserRepository.findByUsername(userModel.getUsername());

       if (user != null) {
            //mensagem de erro
            // status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O usuário já está cadastrado!");
        }

         var passwordHashed = BCrypt.withDefaults()
                 .hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashed);

        var createdUser = UserRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @DeleteMapping("/task/{id}")
    public ResponseEntity delete(@PathVariable UUID id) {
        UserRepository.deleteById(id);
        return ResponseEntity.ok("O usuário de Id: " + id + "foi excluída com sucesso!");
    }
}
