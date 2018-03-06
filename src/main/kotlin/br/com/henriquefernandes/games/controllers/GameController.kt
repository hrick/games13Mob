package br.com.henriquefernandes.games.controllers

import br.com.henriquefernandes.games.services.GameServices
import br.com.henriquefernandes.games.model.Game
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class GameController {

    @Autowired
    lateinit var gameService: GameServices

    @GetMapping
    fun buscarTodos(): List<Game> {
        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game) {
        gameService.salvar(game)
    }

    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo: String): List<Game> {
        return gameService.buscarPor(nome = titulo)
    }

    @DeleteMapping("{id}")
    fun apagar(@PathVariable("id") id : String ) {
        gameService.apagar(id)
    }
}
