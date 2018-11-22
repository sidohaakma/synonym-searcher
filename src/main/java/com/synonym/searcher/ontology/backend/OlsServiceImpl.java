package com.synonym.searcher.ontology.backend;

import com.synonym.searcher.ontology.Ontology;
import com.synonym.searcher.ontology.aggregator.OntologyService;
import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.pride.utilities.ols.web.service.client.OLSClient;
import uk.ac.ebi.pride.utilities.ols.web.service.config.OLSWsConfig;
import uk.ac.ebi.pride.utilities.ols.web.service.model.Term;

public class OlsServiceImpl implements OntologyService {


  private static final String OLS_PROTOCOL = "https";
  private static final String OLS_HOST = "www.ebi.ac.uk/ols";
  private OLSClient olsClient;

  @Override
  public List<Ontology> fetchOntologies(String searchQuery) {
    olsClient = new OLSClient(new OLSWsConfig(OLS_PROTOCOL, OLS_HOST));
    List<uk.ac.ebi.pride.utilities.ols.web.service.model.Ontology> ontologies = olsClient.getOntologies();
    List<Term> terms = new ArrayList<>();
    for(uk.ac.ebi.pride.utilities.ols.web.service.model.Ontology ontology : ontologies) {
      terms.addAll(olsClient.getTermsByName(searchQuery, ontology.getId(), false));
    }
    return convertOlsOntologies(terms);
  }

  private List<Ontology> convertOlsOntologies(List<Term> terms) {
    List<Ontology> ontologies = new ArrayList<>();
    return ontologies;
  }

}
