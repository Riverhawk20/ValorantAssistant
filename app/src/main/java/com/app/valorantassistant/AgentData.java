package com.app.valorantassistant;


public class AgentData {
    String name, type, description;
    String[] abilityNames, abilityDescriptions, cost;

    public AgentData(String NAME, String TYPE, String DESCRIPTION, String[] ABILITYNAMES, String[] ABILITYDESCRIPTIONS, String [] COST){
        name=NAME;
        type=TYPE;
        description=DESCRIPTION;
        abilityNames=ABILITYNAMES;
        abilityDescriptions=ABILITYDESCRIPTIONS;
        cost=COST;
    }

}
