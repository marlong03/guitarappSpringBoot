package com.guitarapp.guitarapp.Repostory;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guitarapp.guitarapp.Model.Pulsada;
@Repository
public interface PulsadaRepository extends CrudRepository<Pulsada,Integer> {
    @Autowired
    @Query(value = "select * from pulsada where idacorde = :id",nativeQuery = true)
    Iterable<Pulsada> findByIdacorde(Integer id);
} 