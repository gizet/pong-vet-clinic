package com.gizet.services.h2database;

import com.gizet.model.OwnerEntity;
import com.gizet.services.interfaces.OwnerService;
import com.gizet.services.interfaces.PetService;
import com.gizet.services.interfaces.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile({"default", "map"})
public class OwnerServiceImpl extends AbstractServiceImpl<OwnerEntity, Long> implements OwnerService {


    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceImpl(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<OwnerEntity> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(OwnerEntity object) {
        super.delete(object);
    }

    @Override
    public OwnerEntity save(OwnerEntity object) {

        if (object != null) {
//            if(object.getPets() != null) {
//                        object.getPets().forEach(pet -> {
//                            if (pet.getPetType() != null) {
//                                if (pet.getPetType().getId() == null) {
//                                    pet.setPetType(petTypeService.save(pet.getPetType()));
//                                }
//                            } else {
//                                throw new RuntimeException("Pet Type is required");
//                            }
//
//                    if (pet.getId() == null) {
//                        PetEntity savedPet = petService.save(pet);
//                        pet.setId(savedPet.getId());
//                    }
//                });
//            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public OwnerEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public OwnerEntity findByLastName(String lastName) {
        return null;
    }
}
