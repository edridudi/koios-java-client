package rest.koios.client.backend.api.address.model;

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
public class AssetInfo {

    /**
     * Asset Policy ID in hexadecimal format (hex)
     */
    private String assetPolicyHex;

    /**
     * Asset Name in hexadecimal format (hex)
     */
    private String assetNameHex;

    /**
     * Asset balance
     */
    private String quantity;
}
