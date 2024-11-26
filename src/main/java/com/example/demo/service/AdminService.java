package com.example.demo.service;


import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Admin;
import com.example.demo.entity.User;
import com.example.demo.repo.AdminRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private ModelMapper modelMapper;

    public AdminDTO saveAdmin(AdminDTO adminDTO){
        adminRepo.save(modelMapper.map(adminDTO, Admin.class));
        return adminDTO;
    }

    public List<AdminDTO> getAllAdmins(){
        List<Admin>adminList=adminRepo.findAll();
        return modelMapper.map(adminList,new TypeToken<List<AdminDTO>>(){}.getType());

    }
}
