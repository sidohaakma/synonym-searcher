package com.synonym.searcher.synonymsearcher.controllers;

import com.synonym.searcher.ontology.Ontology;
import com.synonym.searcher.ontology.OntologyTerm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    // TODO consider taking ontologies/ontology versions in params rather than querying all ontologies all the time
    @RequestMapping("/search")
    public List<Ontology> search(@RequestParam(value="searchTerm", defaultValue="%") String searchTerm) {
        // TODO replace with real logic for getting the results from aggregator
        List<Ontology> searchResults = new ArrayList<>();

        // SNOMED-CT v25 sample data
        List<OntologyTerm> snomedOntologyResults = new ArrayList<>();
        snomedOntologyResults.add(new OntologyTerm("363358000", "Malignant tumor of lung"));
        snomedOntologyResults.add(new OntologyTerm("92649001", "Carcinoma in situ of lung"));

        // ICD-10 sample data
        List<OntologyTerm> icd10OntologyResults = new ArrayList<>();
        icd10OntologyResults.add(new OntologyTerm("C34", "Malignant neoplasm of bronchus and lung"));
        icd10OntologyResults.add(new OntologyTerm("C34.0", "Malignant neoplasm of bronchus and lung - Main bronchus"));
        icd10OntologyResults.add(new OntologyTerm("C34.1", "Malignant neoplasm of bronchus and lung - Upper lobe, bronchus or lung"));
        icd10OntologyResults.add(new OntologyTerm("C34.2", "Malignant neoplasm of bronchus and lung - Middle lobe, bronchus or lung"));
        icd10OntologyResults.add(new OntologyTerm("C34.3", "Malignant neoplasm of bronchus and lung - Lower lobe, bronchus or lung"));
        icd10OntologyResults.add(new OntologyTerm("C34.8", "Malignant neoplasm of bronchus and lung - Overlapping lesion of bronchus and lung"));
        icd10OntologyResults.add(new OntologyTerm("C34.9", "Malignant neoplasm of bronchus and lung - Bronchus or lung, unspecified"));

        searchResults.add(new Ontology("SNOMED-CT", "25", snomedOntologyResults));
        searchResults.add(new Ontology("ICD", "10", icd10OntologyResults));

        return searchResults;
    }
}
