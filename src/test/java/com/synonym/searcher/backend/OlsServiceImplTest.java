package com.synonym.searcher.backend;

import com.synonym.searcher.ontology.backend.OlsServiceImpl;
import org.junit.Test;

public class OlsServiceImplTest {

  private OlsServiceImpl olsService = new OlsServiceImpl();

  @Test
  public void testGetTerms() {
    olsService.fetchOntologies("");
  }

}
