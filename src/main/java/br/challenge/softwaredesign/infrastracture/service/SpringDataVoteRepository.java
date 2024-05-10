package br.challenge.softwaredesign.infrastracture.service;

import br.challenge.softwaredesign.infrastracture.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataVoteRepository extends JpaRepository<Vote, String>{
    boolean existsVoteByCpfAndRulingUuid(String cpf, String rulingUuid);
}
