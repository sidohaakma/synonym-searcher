package com.synonym.searcher.ontology;

import java.util.List;

public class Ontology {

  private String ontology;
  private String ontologyVersion;
  private List<OntologyTerm> ontologyResults;

  public Ontology(String ontology, String ontologyVersion, List<OntologyTerm> ontologyResults) {
    this.ontology = ontology;
    this.ontologyVersion = ontologyVersion;
    this.ontologyResults = ontologyResults;
  }

  public String getOntology() {
    return ontology;
  }

  public void setOntology(String ontology) {
    this.ontology = ontology;
  }

  public String getOntologyVersion() {
    return ontologyVersion;
  }

  public void setOntologyVersion(String ontologyVersion) {
    this.ontologyVersion = ontologyVersion;
  }

  public List<OntologyTerm> getOntologyResults() {
    return ontologyResults;
  }

  public void setOntologyResults(
      List<OntologyTerm> ontologyResults) {
    this.ontologyResults = ontologyResults;
  }
}
