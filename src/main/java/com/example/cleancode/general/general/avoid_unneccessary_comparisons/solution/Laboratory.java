package com.example.cleancode.general.general.avoid_unneccessary_comparisons.solution;

import com.example.cleancode.general.Microscope;
import com.example.cleancode.general.Result;
import com.example.cleancode.general.Sample;

public class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample)) {
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (!microscope.isHumanoid(sample)) {
            return Result.ALIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}
