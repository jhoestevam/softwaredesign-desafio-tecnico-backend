package br.challenge.softdesign.domain.adapters.repository;

import br.challenge.softdesign.infrastracture.Vote;

import java.util.UUID;

public interface VoteRepository {

    boolean existsVoteByCpfAndRulingUuid(String cpf, String rulingUuid);

    UUID save(Vote vote);

}
