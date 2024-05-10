package br.challenge.softwaredesign.domain.adapters.service;

import br.challenge.softwaredesign.application.controller.CreateRuling;
import br.challenge.softwaredesign.application.controller.ResultRuling;
import br.challenge.softwaredesign.application.controller.VoteOnRuling;

import java.util.List;
import java.util.UUID;

public interface RulingService {

    UUID createRuling(final CreateRuling createRuling);

    List<CreateRuling> listOfRuling(UUID uuid, Boolean available);

    ResultRuling resultOfRuling(UUID uuid);

    void openRuling(UUID uuid);

    void closeRuling(UUID uuid);

    UUID tallyVoteForRuling(VoteOnRuling voteOnRuling);
}
