package nl.han.toetsapplicatie.apimodels.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class KlaargezetTentamenDto {
    private UUID id;
    private String naam;
    private String beschrijving;
    private String toegestaandeHulpmiddelen;
    private String tijdsduur;
    private long startdatum;

    private String vragen;
    private VersieDto versie;
}
