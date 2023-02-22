package br.com.dio.desafioreactor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public record User(Long id,
                   String name,
                   String email,
                   String password,
                   Boolean isAdmin) {

}
