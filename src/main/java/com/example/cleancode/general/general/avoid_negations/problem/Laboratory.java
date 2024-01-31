package com.example.cleancode.general.general.avoid_negations.problem;

import com.example.cleancode.general.Microscope;
import com.example.cleancode.general.Result;
import com.example.cleancode.general.Sample;

public class Laboratory {
    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isOrganic(sample)) {
            return analyzeOrganic(sample);
        } else {
            return Result.INORGANIC;
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample)) {
            return Result.HUMANOID;
        } else {
            return Result.ALIEN;
        }
    }
}
