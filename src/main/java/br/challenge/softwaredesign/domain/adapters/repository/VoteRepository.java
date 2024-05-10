package br.challenge.softwaredesign.domain.adapters.repository;

import br.challenge.softwaredesign.infrastracture.Vote;

import java.util.UUID;

public interface VoteRepository {

    boolean existsVoteByCpfAndRulingUuid(String cpf, String rulingUuid);

    UUID save(Vote vote);

}
