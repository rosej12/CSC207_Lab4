package usecase;

import api.GradeDataBase;
import entity.Grade;

public class DisplayGradesUseCase {
    private final GradeDataBase gradeDataBase;

    public DisplayGradesUseCase(GradeDataBase gradeDataBase) {
        this.gradeDataBase = gradeDataBase;
    }

    // Returns all grades of current(?) user
    public Grade[] getGrades() {
        return gradeDataBase.getGrades("");
    }
}
