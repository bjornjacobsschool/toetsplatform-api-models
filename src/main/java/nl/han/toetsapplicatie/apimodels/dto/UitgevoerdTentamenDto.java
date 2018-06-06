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
public class UitgevoerdTentamenDto {
    private UUID id;
    private String naam;
    private String hash;

    private StudentDto student;
    private VersieDto versie;
    private List<IngevuldeVraagDto> vragen;
}
