package com.hotel.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hotel.modelos.Reservacion;



public interface RepoReservacion extends CrudRepository<Reservacion, Integer> {
	@Query(value="SELECT * FROM Reservacion" , nativeQuery = true)
	ArrayList<Reservacion> todos();

}
