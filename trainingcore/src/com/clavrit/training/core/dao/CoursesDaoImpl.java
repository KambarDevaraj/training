package com.clavrit.training.core.dao;

import com.clavrit.training.core.model.CoursesModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.List;

public class CoursesDaoImpl implements CoursesDao{

    private static final String COURSES_QUERY = "SELECT{" + CoursesModel.PK+ "}FROM{"+CoursesModel._TYPECODE+ "}";

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CoursesModel> getCourseDetails() {
        final SearchResult<CoursesModel> search = getFlexibleSearchService().search(COURSES_QUERY);
        return search.getResult() == null? Collections.emptyList():search.getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}

