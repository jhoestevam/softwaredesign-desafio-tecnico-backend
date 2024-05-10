package br.challenge.softdesign.infrastracture.service;

import br.challenge.softdesign.infrastracture.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataVoteRepository extends JpaRepository<Vote, String>{
    boolean existsVoteByCpfAndRulingUuid(String cpf, String rulingUuid);
}
