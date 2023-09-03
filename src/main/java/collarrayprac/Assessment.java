package collarrayprac;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assessment {
    @JsonProperty("ASSESSMENTID")
    private int assessmentId;

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }
}
