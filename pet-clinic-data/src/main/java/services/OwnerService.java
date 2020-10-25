package services;

import br.com.aquarium.health.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findByid(Long id);
    void save (Owner owner);
    Set<Owner> findall();
}
