package br.com.kafkaconspoc.repository

import br.com.kafkaconspoc.model.Pix
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PixRepository : JpaRepository<Pix, Long>{
}