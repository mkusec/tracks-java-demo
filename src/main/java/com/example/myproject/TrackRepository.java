package com.example.myproject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


/**
 * Spring Data repository interface to manage {@link Track} instances.
 */
@CrossOrigin(origins = { "http://localhost", "http://localhost:1234" })
public interface TrackRepository extends CrudRepository<Track, Long> {}
