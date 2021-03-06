package services;

import br.com.aquarium.health.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    void save(Vet vet);
    Set<Vet> findAll();
}
