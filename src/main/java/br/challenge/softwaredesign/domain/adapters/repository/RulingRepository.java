package br.challenge.softwaredesign.domain.adapters.repository;

import br.challenge.softwaredesign.infrastracture.Ruling;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RulingRepository {

    List<Ruling> listAll(Boolean available);

    Optional<Ruling> findById(UUID uuid);

    UUID save(Ruling ruling);

}
