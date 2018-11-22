package com.synonym.searcher.ontology.backend;

import com.synonym.searcher.ontology.Ontology;
import com.synonym.searcher.ontology.OntologyTerm;
import com.synonym.searcher.ontology.aggregator.OntologyService;
import java.util.ArrayList;
import java.util.List;

public class HL7ServiceImpl implements OntologyService {

  @Override
  public List<Ontology> fetchOntologies(String searchQuery) {
    return generateOntologies();
  }

  private List<Ontology> generateOntologies() {


    // TODO consume HL7

    // TODO compile ontology results
    Ontology ontology = new Ontology(null, null, null);
    OntologyTerm ontologyTerm = new OntologyTerm(null, null);
    List<OntologyTerm> ontologyTerms = new ArrayList<>();
    ontology.setOntologyResults(ontologyTerms);
    List<Ontology> ontologies = new ArrayList<>();

//    ontologies.add();
    return ontologies;
  }
}
