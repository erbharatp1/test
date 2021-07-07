package com.iht.fbs.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iht.fbs.model.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
