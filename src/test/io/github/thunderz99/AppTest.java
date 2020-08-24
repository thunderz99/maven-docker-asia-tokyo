package io.github.thunderz99;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testApp(){
        assertThat("hello").isNotEmpty();
    }


}