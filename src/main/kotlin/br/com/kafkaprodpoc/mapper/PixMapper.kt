package br.com.kafkaprodpoc.mapper

import br.com.kafkaprodpoc.dto.PixDTO
import br.com.kafkaprodpoc.model.Pix

interface PixMapper {

    fun convertDtoObjectToEntity(dtoObject : PixDTO) : Pix
}