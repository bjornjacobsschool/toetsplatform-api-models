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
public class VragenbankVraagDto {
    private UUID id;
    private String naam;
    private String vraagtype;
    private String thema;
    private int punten;
    private String correcteAntwoorden;
    private String mogelijkeAntwoorden;
    private String nakijkInstructies;

    private VersieDto versie;
}
