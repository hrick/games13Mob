package br.com.henriquefernandes.games.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Game (val id: String, val urlImagem: String, val nome: String, val anoLancamento: Int)