package cl.duoc.ms_characters.dto;

import cl.duoc.ms_characters.enums.EquipmentSlot;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EquipItemDto {
    @NotNull
    private Long userId;

    @NotNull
    private Long baseCharacterId;

    @NotNull
    private Long itemId;

    @NotNull
    private EquipmentSlot slot;
}