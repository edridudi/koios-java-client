package com.reina.koios.client.backend.api.epoch.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EpochInfo {

    /**
     * Epoch number
     */
    private Long epochNo = null;

    /**
     * Total output value across all transactions in epoch
     */
    private Long outSum = null;

    /**
     * Total fees incurred by transactions in epoch
     */
    private Long fees = null;

    /**
     * Number of transactions submitted in epoch
     */
    private Long txCount = null;

    /**
     * Number of blocks created in epoch
     */
    private Integer blkCount = null;

    /**
     * Timestamp for first block created in epoch
     */
    private String firstBlockTime = null;

    /**
     * Timestamp for last block created in epoch
     */
    private String lastBlockTime = null;

    /**
     * Rewards accumulated as of given epoch (in lovelaces)
     */
    private Long activeStake = null;
}
