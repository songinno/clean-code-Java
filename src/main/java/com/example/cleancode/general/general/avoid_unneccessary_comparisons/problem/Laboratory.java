package com.example.cleancode.general.general.avoid_unneccessary_comparisons.problem;

import com.example.cleancode.general.Microscope;
import com.example.cleancode.general.Result;
import com.example.cleancode.general.Sample;

public class Laboratory {
    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample) == true) {
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample) == false) {
            return Result.ALIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}
