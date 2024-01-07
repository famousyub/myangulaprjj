package com.example.polls.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SettingsRequest {

    @NotBlank
    @Size(max = 40)
    private String myname;

    @NotBlank
    @Size(max = 15)
    private String avis;

    @NotBlank
    @Size(max = 75)
    private String description;

    
}
