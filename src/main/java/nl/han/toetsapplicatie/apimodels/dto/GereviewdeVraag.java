package nl.han.toetsapplicatie.apimodels.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GereviewdeVraag {
    private UUID id;
    private int punten;
    private String gereviewdDoor;
    private String reviewComment;

    private VersieDto versie;
}
