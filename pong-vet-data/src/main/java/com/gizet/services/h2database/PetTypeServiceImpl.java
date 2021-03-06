package com.gizet.services.h2database;

import com.gizet.model.PetTypeEntity;
import com.gizet.services.interfaces.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeServiceImpl extends AbstractServiceImpl<PetTypeEntity, Long> implements PetTypeService {

    @Override
    public Set<PetTypeEntity> findAll() {
        return super.findAll();
    }

    @Override
    public PetTypeEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetTypeEntity save(PetTypeEntity object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetTypeEntity object) {
        super.delete(object);
    }
}
