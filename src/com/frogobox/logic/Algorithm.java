package com.frogobox.logic;

import com.frogobox.helper.comparator.EngagementComp;
import com.frogobox.helper.comparator.FollowerComp;
import com.frogobox.model.Data;
import com.frogobox.view.AlgorithmView;

import java.util.Comparator;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-fuzzy-logic
 * Copyright (C) 04/12/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.logic
 */
public class Algorithm {

    private AlgorithmView algorithmView;

    public Algorithm(AlgorithmView algorithmView) {
        this.algorithmView = algorithmView;
    }

    public void setupShowDataOri(){
        for (Data data : new DataChecker().rawDataArray()) {
            algorithmView.outputData(data);
        }
    }

    public void setupSortByComparator(Comparator<Data> comparator) {
        for (Data data : new DataChecker().rawDataArraySort(comparator)) {
            algorithmView.outputData(data);
        }
    }



}
