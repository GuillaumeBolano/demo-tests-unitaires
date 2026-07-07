package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TestMaison {
  Maison maison;

  @BeforeEach
  public void creerMaison() {
    maison = new Maison();
  }

  @Test
  public void testAjouterPiece() {
    maison.ajouterPiece(new WC(0, 5));
    assertEquals(1, maison.nbPieces());
  }

  @Test
  public void testAjouterPieceNulle() {
    assertThrows(IllegalArgumentException.class, () -> maison.ajouterPiece(null));
  }

  @Test
  public void testNbPieces0() {
    assertEquals(0, maison.nbPieces());
  }

  @Test
  public void testSuperficieEtage() {
    maison.ajouterPiece(new Chambre(1, 25));
    maison.ajouterPiece(new SalleDeBain(1, 15));
    maison.ajouterPiece(new Chambre(2, 25));
    maison.ajouterPiece(new SalleDeBain(2, 15));
    assertEquals(40, maison.superficieEtage(1));
  }

  @Test
  public void testSuperficieEtageOutOfBounds() {
    maison.ajouterPiece(new Chambre(1, 25));
    maison.ajouterPiece(new SalleDeBain(1, 15));
    maison.ajouterPiece(new Chambre(2, 25));
    maison.ajouterPiece(new SalleDeBain(2, 15));
    assertEquals(0, maison.superficieEtage(20));
  }

  @Test
  public void testSuperficieEtageMaisonVide() {
    assertEquals(0, maison.superficieEtage(1));
  }

  @Test
  public void testSuperficieTypePiece() {
    maison.ajouterPiece(new Chambre(1, 25));
    maison.ajouterPiece(new SalleDeBain(1, 15));
    maison.ajouterPiece(new Chambre(2, 25));
    maison.ajouterPiece(new SalleDeBain(2, 15));
    assertEquals(50, maison.superficieTypePiece("Chambre"));
  }

  @Test
  public void testSuperficieTypePieceNull() {
    assertThrows(IllegalArgumentException.class, () -> maison.superficieTypePiece(null));
  }

  @Test
  public void testSuperficieTypePieceVide() {
    assertThrows(IllegalArgumentException.class, () -> maison.superficieTypePiece(""));
  }

  @Test
  public void testCalculerSurface() {
    maison.ajouterPiece(new Chambre(1, 25));
    maison.ajouterPiece(new SalleDeBain(1, 15));
    maison.ajouterPiece(new Chambre(2, 25));
    maison.ajouterPiece(new SalleDeBain(2, 15));
    assertEquals(80, maison.calculerSurface());
  }

  @Test
  public void testCalculerSurfaceMaisonVide() {
    assertEquals(0, maison.calculerSurface());
  }
}
