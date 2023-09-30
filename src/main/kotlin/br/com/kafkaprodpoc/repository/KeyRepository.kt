package br.com.kafkaprodpoc.repository

import br.com.kafkaprodpoc.model.Key
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface KeyRepository : JpaRepository<Key, Long>{
}