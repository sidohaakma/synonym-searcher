package com.synonym.searcher.synonymsearcher.entities;

public class OntologyResult {

    private final String code;
    private final String term;

    public OntologyResult(String code, String term) {
        this.code = code;
        this.term = term;
    }

    public String getCode() {
        return code;
    }

    public String getTerm() {
        return term;
    }
}
