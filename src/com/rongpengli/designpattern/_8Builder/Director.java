package com.rongpengli.designpattern._8Builder;

import java.util.Collection;
import java.util.Map;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDateModel>> mapData,
            ExportFooterModel efm) {
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(efm);
    }
}
