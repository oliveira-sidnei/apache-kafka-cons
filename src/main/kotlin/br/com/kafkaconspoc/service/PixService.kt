package br.com.kafkaconspoc.service

import br.com.kafkaconspoc.dto.PixDTO

interface PixService {

    fun savePixTransaction(dtoObject: PixDTO) : PixDTO
}