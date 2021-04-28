package Assignment6.Fabian;

public class AMG extends Mercedes{

    public AMG(String modelName) {
        super(modelName);
    }

    @Override
    public String getModel() {
        System.out.println("This Mercedes Model is an AMG baby!!!!!!");
        return super.getModel();
    }
}
