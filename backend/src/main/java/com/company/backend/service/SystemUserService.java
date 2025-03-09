package com.company.backend.service;

import com.company.backend.entity.SystemUser;
import com.company.backend.repository.SystemUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SystemUserService {

    private final SystemUserRepository systemuserRepository;

    public SystemUserService(SystemUserRepository systemuserRepository) {
        this.systemuserRepository = systemuserRepository;
    }

    public List<SystemUser> getAllSystemUsers() {
        return systemuserRepository.findAll();
    }

    public Optional<SystemUser> getSystemUserById(int id) {
        return systemuserRepository.findById(id);
    }

    public SystemUser addSystemUser(SystemUser systemuser) {
        return systemuserRepository.save(systemuser);
    }

//    public Optional<SystemUser> updateSystemUser(int id, SystemUser newSystemUser) {
//        return systemuserRepository.findById(id).map(existingSystemUser -> {
//            existingSystemUser.setName(newSystemUser.getName());
//
//            return systemuserRepository.save(existingSystemUser);
//        });
//    }

    public boolean deleteSystemUser(int id) {
        if (systemuserRepository.existsById(id)) {
            systemuserRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
