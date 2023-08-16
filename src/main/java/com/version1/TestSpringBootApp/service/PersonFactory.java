package com.version1.TestSpringBootApp.service;

import org.springframework.stereotype.Service;

@Service
public class PersonFactory {

    private final PrintDetailsPersonService printDetailsPersonService;
    private final SaveToDBPersonService saveToDBPersonService;
    private final RenamePersonService renamePersonService;

    public PersonFactory(PrintDetailsPersonService printDetailsPersonService, SaveToDBPersonService saveToDBPersonService, RenamePersonService renamePersonService) {
        this.printDetailsPersonService = printDetailsPersonService;
        this.saveToDBPersonService = saveToDBPersonService;
        this.renamePersonService = renamePersonService;
    }

    public PersonService returnService(String handleCode) {
        if ("db".equals(handleCode)) {
            return saveToDBPersonService;
        } else if ("print".equals(handleCode)) {
            return printDetailsPersonService;
        }
        return renamePersonService;
    }

}
