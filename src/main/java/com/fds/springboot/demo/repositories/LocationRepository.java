package com.fds.springboot.demo.repositories;

import com.fds.springboot.demo.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
