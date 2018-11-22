package com.synonym.searcher.ontology.backend;

import com.synonym.searcher.ontology.Ontology;
import com.synonym.searcher.ontology.aggregator.OntologyService;
import java.util.ArrayList;
import java.util.List;

public class HL7ServiceImpl implements OntologyService {

  @Override
  public List<Ontology> fetchOntologies(String searchQuery) {
    // TODO: consume HL7

    // TODO: Convert HL7 results to ontologies
    List<Ontology> ontologies = new ArrayList<>();
    return ontologies;
  }
}
