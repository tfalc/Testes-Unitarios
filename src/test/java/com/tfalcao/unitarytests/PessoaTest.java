package com.tfalcao.unitarytests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validateAgeCalculation() {
        Pessoa pessoa = new Pessoa("Thiago", LocalDate.of(2020, 1, 1));

        Assertions.assertEquals(2, pessoa.getAge());
    }
}
