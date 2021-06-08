package com.hotel.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hotel.modelos.Pagos;

public interface RepoPago extends CrudRepository<Pagos, Integer> {
		@Query(value="SELECT * FROM Pagos" , nativeQuery = true)
		ArrayList<Pagos> todos();

}
