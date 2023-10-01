package br.com.kafkaprodpoc.controller

import br.com.kafkaprodpoc.dto.PixDTO
import br.com.kafkaprodpoc.service.PixService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pix")
class PixController(private val service: PixService) {


    @PostMapping
    fun sendAndSavePixTransaction(dtoObject: PixDTO): ResponseEntity<PixDTO>{
        return ResponseEntity.ok(service.savePixTransaction(dtoObject))
    }
}