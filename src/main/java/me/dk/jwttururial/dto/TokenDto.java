package me.dk.jwttururial.dto;

// Token 정보를 Respose

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {
    private String token;
}
