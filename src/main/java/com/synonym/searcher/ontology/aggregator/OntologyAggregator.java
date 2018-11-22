package com.synonym.searcher.ontology.aggregator;

import com.synonym.searcher.ontology.Ontology;
import com.synonym.searcher.ontology.OntologyTerm;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import org.springframework.stereotype.Service;

@Service
public class OntologyAggregator {

  public List<Ontology> aggregateOntologies(String searchQuery) {
    List<Ontology> ontologies = new ArrayList<>();
    ServiceLoader<OntologyService> loader = ServiceLoader.load(OntologyService.class);
    for (OntologyService implClass : loader) {
      ontologies.addAll(implClass.fetchOntologies(searchQuery));
    }
    return ontologies;
  }



}
