package com.greenfoxacademy.learningrest.repo;

import com.greenfoxacademy.learningrest.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
