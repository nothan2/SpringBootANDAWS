package com.boot.web.start.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 룸복_기능_테스트(){
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloReponseDto dto = new HelloReponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
