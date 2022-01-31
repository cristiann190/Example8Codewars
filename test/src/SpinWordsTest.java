package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {
    @Test
    public void testOneWord() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    }

    @Test
    public void testMultipleWords() {
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

    @Test
    public void testWithExtraCharacters() {
        assertEquals("Just gniddik ereht is llits one more", new SpinWords().spinWords("Just kidding there is still one more"));
    }
}