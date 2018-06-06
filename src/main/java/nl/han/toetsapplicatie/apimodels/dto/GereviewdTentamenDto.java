package nl.han.toetsapplicatie.apimodels.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GereviewdTentamenDto {
    private UUID id;
    private String reviewComment;

    private VersieDto versie;
    private List<GereviewdeVraag> vragen;
}
