package br.com.kafkaconspoc.mapper

import br.com.kafkaconspoc.dto.PixDTO
import br.com.kafkaconspoc.model.Pix

interface PixMapper {

    fun convertDtoObjectToEntity(dtoObject : PixDTO) : Pix
}