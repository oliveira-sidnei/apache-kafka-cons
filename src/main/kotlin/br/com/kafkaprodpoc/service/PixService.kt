package br.com.kafkaprodpoc.service

import br.com.kafkaprodpoc.dto.PixDTO

interface PixService {

    fun savePixTransaction(dtoObject: PixDTO) : PixDTO
}