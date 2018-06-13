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
public class SamengesteldTentamenVraagDto {
    private UUID id;
    private String naam;
    private String vraagtype;
    private String thema;
    private int punten;
    private String mogelijkeAntwoorden;
    private String vraagData;

    private VersieDto versie;
}
