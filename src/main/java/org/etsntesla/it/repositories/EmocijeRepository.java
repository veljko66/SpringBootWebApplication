package org.etsntesla.it.repositories;

import org.etsntesla.it.models.Emocije;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmocijeRepository extends JpaRepository<Emocije,Integer> {
}
