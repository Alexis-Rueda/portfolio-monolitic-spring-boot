package com.porfolio.my_porfolio_backend.repository;

import com.porfolio.my_porfolio_backend.model.Experience;

import java.util.List;
import java.util.Optional;

public interface IExperienceRepository {
    List<Experience> findAll();
    Optional<Experience> findById(Long id);
    Experience save(Experience experience);
    void deleteById(Long id);
    List<Experience> findByPersonalInfoId(Long personalInfoId);
}
