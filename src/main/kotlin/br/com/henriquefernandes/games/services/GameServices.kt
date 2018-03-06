package br.com.henriquefernandes.games.services

import br.com.henriquefernandes.games.model.Game
import br.com.henriquefernandes.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired

class GameServices {
    @Autowired
    lateinit var gameRepository: GameRepository

    fun buscarTodos(): List<Game> {
        return gameRepository.findAll()
    }

    fun salvar(game: Game) {
        gameRepository.save(game)
    }

    fun buscarPor(nome: String): List<Game> {
        return gameRepository.findByNomeIgnoreCaseContaining(nome)
    }

    fun apagar(id: String) {
        gameRepository.deleteById(id)
    }
}