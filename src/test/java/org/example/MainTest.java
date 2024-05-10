package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    public void isAnagramTest(){
        Main main = new Main();
        assertTrue(main.anagram("espada","pesada"));
    }
    @Test
    public void noIsAnagramByDiferentSize(){
        Main main = new Main();
        String a = "espada";
        String b = "pesada";
        assertFalse(main.anagram(a,b));
    }
    @Test
    public void anagramWordOneIsNull(){
        Main main = new Main();
        assertFalse(main.anagram(null,"pesada"));
    }
}
