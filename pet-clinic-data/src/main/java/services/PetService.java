package services;

import br.com.aquarium.health.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    void save(Pet pet);
    Set<Pet> findAll();
}
