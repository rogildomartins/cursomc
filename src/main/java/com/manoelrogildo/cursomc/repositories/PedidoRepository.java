package com.manoelrogildo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoelrogildo.cursomc.dominio.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
