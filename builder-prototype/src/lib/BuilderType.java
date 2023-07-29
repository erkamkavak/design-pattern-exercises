package lib;

public class BuilderType {
    public static BuilderType computerBuilder = new BuilderType("ComputerBuilder", Computer.class);
    public static BuilderType computerValueBuilder = new BuilderType("ComputerValueBuilder", Integer.class);

    public String builderTypeName; 
    public final Class builderReturnType;

    public BuilderType(String builderTypeName, Class builderReturnType) {
        this.builderTypeName = builderTypeName;
        this.builderReturnType = builderReturnType;
    }
}
