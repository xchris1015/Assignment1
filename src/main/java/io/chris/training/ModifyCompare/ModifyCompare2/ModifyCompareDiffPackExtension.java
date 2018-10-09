package io.chris.training2;

import io.chris.training.ModifyCompare;

public class ModifyCompareDiffPackExtension extends ModifyCompare {
    private String trainingPrivate4 = "trainingPrivate44444";
    protected String trainingProtected4 = "trainingProtected44444";
    public String trainingPublic4 = "trainingPublic4444444";

    private String getTrainingPrivate4() {
        return trainingPrivate4;
    }

    protected String getTrainingProtected4() {
        return trainingProtected4;
    }

    public String getTrainingPublic4() {
        return trainingPublic4;
    }
}
