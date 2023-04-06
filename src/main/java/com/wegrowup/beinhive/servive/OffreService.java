package com.wegrowup.beinhive.servive;

import com.wegrowup.beinhive.entities.OffreEmploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OffreService extends JpaRepository<OffreEmploi, Long> {

}
