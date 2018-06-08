package nl.han.toetsapplicatie.apimodels.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class NagekekenVraagDto {
    private UUID id;
    private int punten;
    private int behaaldePunten;
    private String nakijkComment;

    private VersieDto versie;
}
