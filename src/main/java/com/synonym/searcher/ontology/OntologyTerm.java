package com.synonym.searcher.ontology;

public class OntologyTerm {

  private String code;
  private String term;

  public OntologyTerm(String code, String term) {
    this.code = code;
    this.term = term;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }
}
