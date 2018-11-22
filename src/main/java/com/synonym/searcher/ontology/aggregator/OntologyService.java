package com.synonym.searcher.ontology.aggregator;

import com.synonym.searcher.ontology.Ontology;
import java.util.List;

public interface OntologyService {

  List<Ontology> fetchOntologies(String searchQuery);

}
