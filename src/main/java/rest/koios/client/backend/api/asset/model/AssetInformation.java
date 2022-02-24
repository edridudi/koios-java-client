package rest.koios.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Asset Information
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInformation {

    /**
     * Asset Policy ID (hex)
     */
    private String policyId;

    /**
     * Asset Name (hex)
     */
    private String assetName;

    /**
     * Asset Name (ASCII)
     */
    private String assetNameAscii;

    /**
     * The CIP14 fingerprint of the asset
     */
    private String fingerprint;

    /**
     * Minting Transaction Metadata
     */
    private MintingTxMetadata mintingTxMetadata;

    /**
     * Asset metadata registered on the Cardano Token Registry
     */
    private TokenRegistryMetadata tokenRegistryMetadata;

    private String totalSupply;

    private String creationTime;
}
