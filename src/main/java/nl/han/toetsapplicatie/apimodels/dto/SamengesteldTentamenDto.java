package nl.han.toetsapplicatie.apimodels.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SamengesteldTentamenDto {
    private UUID id;
    private String naam;
    private String beschrijving;
    private String toegestaandeHulpmiddelen;
    private String tijdsduur;
    private boolean isVerzegeld;
    private String sleutel;
    private DateTime startdatum;

    private List<VragenbankVraagDto> vragen;
    private VersieDto versie;
}
