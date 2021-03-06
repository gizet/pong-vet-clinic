package com.gizet.services.springdata;

import com.gizet.model.PetEntity;
import com.gizet.repositories.interfaces.PetRepository;
import com.gizet.services.interfaces.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDService implements PetService {

    private final PetRepository petRepository;

    public PetSDService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Set<PetEntity> findAll() {
        Set<PetEntity> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public PetEntity findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetEntity save(PetEntity object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(PetEntity object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
