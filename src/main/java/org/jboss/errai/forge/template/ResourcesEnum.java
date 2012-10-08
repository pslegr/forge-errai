package org.jboss.errai.forge.template;


/**
 * @author pslegr
 */
public enum ResourcesEnum {
    SERVICE_REMOTE("@Service");
    		
    private String name;

    private ResourcesEnum(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
