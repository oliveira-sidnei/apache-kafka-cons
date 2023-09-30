package br.com.kafkaprodpoc.repository

import br.com.kafkaprodpoc.model.Pix
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PixRepository : JpaRepository<Pix, Long>{
}