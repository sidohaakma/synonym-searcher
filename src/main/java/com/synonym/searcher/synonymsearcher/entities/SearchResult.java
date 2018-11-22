package com.synonym.searcher.synonymsearcher.entities;

public class SearchResult {

    private final String ontology;
    private final String ontologyVersion;
    private final OntologyResult[] ontologyResults;

    public SearchResult(String ontology,
                        String ontologyVersion,
                        OntologyResult[] ontologyResults) {
        this.ontology = ontology;
        this.ontologyVersion = ontologyVersion;
        this.ontologyResults = ontologyResults;
    }

    public String getOntology() {
        return ontology;
    }

    public String getOntologyVersion() {
        return ontologyVersion;
    }

    public OntologyResult[] getOntologyResults() {
        return ontologyResults;
    }
}