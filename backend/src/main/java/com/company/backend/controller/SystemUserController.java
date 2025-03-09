package com.company.backend.controller;

import com.company.backend.entity.SystemUser;
import com.company.backend.service.SystemUserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class SystemUserController {

    private final SystemUserService userService;

    public SystemUserController(SystemUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<SystemUser> getAllSystemUsers() {
        return userService.getAllSystemUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemUser> getSystemUserById(@PathVariable int id) {
        return userService.getSystemUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SystemUser> addSystemUser(@Valid @RequestBody SystemUser user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addSystemUser(user));
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<SystemUser> updateSystemUser(@PathVariable int id, @Valid @RequestBody SystemUser user) {
//        return userService.updateSystemUser(id, user)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSystemUser(@PathVariable int id) {
        return userService.deleteSystemUser(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
