package io.chris.training;

import io.chris.training2.ModifyCompareDiffPackExtension;

public class ModifyCompare {
    private String trainingPrivate = "trainingPrivate";
    protected String trainingProtected = "trainingProtected";
    public String trainingPublic = "trainingPublic";

    private String getTrainingPrivate() {
        return trainingPrivate;
    }

    protected String getTrainingProtected() {
        return trainingProtected;
    }

    public String getTrainingPublic() {
        return trainingPublic;
    }

    public static void main(String args[]){
        ModifyCompare modifyCompare = new ModifyCompare();
        System.out.println(modifyCompare.getTrainingPrivate());
        System.out.println(modifyCompare.getTrainingProtected());
        System.out.println(modifyCompare.getTrainingPublic());

        ModityCompareExtension modifyCompareExtension = new ModityCompareExtension();
        //System.out.println(modifyCompareExtension.getTrainingPrivateExtend());
        System.out.println(modifyCompareExtension.getTrainingProtectedExtend());
        System.out.println(modifyCompareExtension.getTrainingPublicExtend());

        ModifyCompareNonExtension modifyCompare3 = new ModifyCompareNonExtension();
        //System.out.println(modifyCompare3.getTrainingPrivate3());
        System.out.println(modifyCompare3.getTrainingProtected3());
        System.out.println(modifyCompare3.getTrainingPublic3());

        ModifyCompareDiffPackExtension modifyCompare4 = new ModifyCompareDiffPackExtension();
        //System.out.println(modifyCompare4.getTrainingPrivate4());
        //System.out.println(modifyCompare4.getTrainingProtected4()); this is a static method, thus this happened
        System.out.println(modifyCompare4.getTrainingPublic4());

        //ModifyCompareDIffPackNonExtension modifyCompare5 = new ModifyCompareDIffPackNonExtension();
        //System.out.println(modifyCompare5.getTrainingPrivate3());
        //System.out.println(modifyCompare5.getTrainingProtected3());
        //System.out.println(modifyCompare5.getTrainingPublic3());


    }
}
