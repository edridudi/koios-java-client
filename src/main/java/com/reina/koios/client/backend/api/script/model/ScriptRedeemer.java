package com.reina.koios.client.backend.api.script.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScriptRedeemer {

    /**
     * Hash of Transaction for which details are being shown
     */
    private String scriptHash = null;

    /**
     * List of {@link Redeemer}
     */
    private List<Redeemer> redeemers = null;
}
