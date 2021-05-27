package br.com.devaria.projetos.gerenciadortarefas.controllers

import br.com.devaria.projetos.gerenciadortarefas.dtos.LoginDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/login")
class LoginController {

    @PostMapping
    fun efetuarLogin(@RequestBody dto: LoginDTO) : ResponseEntity<Any>{
        try {

        }catch (e: Exception){

        }

    }

}