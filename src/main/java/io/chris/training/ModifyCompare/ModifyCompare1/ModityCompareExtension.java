package io.chris.training;

public class ModityCompareExtension {
    private String trainingPrivateExtend = "trainingPrivateExtend";
    protected String trainingProtectedExtend = "trainingProtectedExtend";
    public String trainingPublicExtend = "trainingPublicExtend";

    private String getTrainingPrivateExtend() {
        //this.trainingprivate could not be accessed in this case
        return trainingPrivateExtend;
    }

    protected String getTrainingProtectedExtend() {
        //this.trainingProtected could be accessed in this case
        return trainingProtectedExtend;
    }

    public String getTrainingPublicExtend() {
        return trainingPublicExtend;
    }

}
