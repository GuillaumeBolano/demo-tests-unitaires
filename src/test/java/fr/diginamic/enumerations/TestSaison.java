package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSaison {

  @Test
  void testPrintemps() {
    assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
  }

  @Test
  void testEte() {
    assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
  }

  @Test
  void testAutomne() {
    assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
  }

  @Test
  void testHiver() {
    assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
  }

  @Test
  void testNull() {
    assertNull(Saison.valueOfLibelle(null));
  }

  @Test
  void testEmpty() {
    assertNull(Saison.valueOfLibelle(""));
  }

  @Test
  void testMinuscule() {
    assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("automne"));
  }

  @Test
  void testMajuscule() {
    assertEquals(Saison.HIVER, Saison.valueOfLibelle("HIVER"));
  }

  @Test
  void testAutreString() {
    assertNull(Saison.valueOfLibelle("toto"));
  }
}
