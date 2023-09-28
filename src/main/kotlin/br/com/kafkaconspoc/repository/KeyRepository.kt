package br.com.kafkaconspoc.repository

import br.com.kafkaconspoc.model.Key
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface KeyRepository : JpaRepository<Key, Long>{
}