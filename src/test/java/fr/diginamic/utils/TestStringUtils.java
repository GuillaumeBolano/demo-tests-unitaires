package fr.diginamic.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static fr.diginamic.utils.StringUtils.levenshteinDistance;

public class TestStringUtils {

  @Test
  void testMemeChaine() {
    assertEquals(0, levenshteinDistance("chat", "chat"));
  }

  @Test
  void testAjouterUneSeuleLettre() {
    assertEquals(1, levenshteinDistance("chat", "chats"));
  }

  @Test
  void testRemplacerUneSeuleLettre() {
    assertEquals(1, levenshteinDistance("machins", "machine"));
  }

  @Test
  void testRetirerUneSeuleLettre() {
    assertEquals(1, levenshteinDistance("aviron", "avion"));
  }

  @Test
  void testRemplacerPlusieursLettres() {
    assertEquals(2, levenshteinDistance("Chine", "Chien"));
  }

  @Test
  void testUneChaineVide() {
    assertEquals(4, levenshteinDistance("chat", ""));
  }

  @Test
  void testDeuxChainesVides() {
    assertEquals(0,  levenshteinDistance("", ""));
  }

  @Test
  void testUneChaineNulle() {
    assertEquals(4, levenshteinDistance("chat", null));
  }

  @Test
  void testDeuxChainesNulles() {
    assertEquals(0, levenshteinDistance(null, null));
  }
}
