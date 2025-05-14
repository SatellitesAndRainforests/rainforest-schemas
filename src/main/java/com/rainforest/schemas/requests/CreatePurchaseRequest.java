package com.rainforest.schemas.requests;

import com.rainforest.schemas.enums.PurchaseType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatePurchaseRequest {

    @NotNull
    private PurchaseType type;

    @NotNull
    private Map<String, Object> details;

}

