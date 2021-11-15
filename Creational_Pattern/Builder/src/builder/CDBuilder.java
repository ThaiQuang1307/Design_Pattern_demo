package builder;

public class CDBuilder {
    public CDType buildSonyCD(){
        CDType cds = new CDType();
        cds.addItem(new Sony());
        return cds;
    }
    public CDType builderSamsung(){
        CDType cds = new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}


