package com.clavrit.training.facades.courses;

import com.clavrit.training.core.model.CoursesModel;
import com.clavrit.training.core.service.CoursesService;
import com.clavrit.training.facades.courses.data.CoursesData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

public class CoursesImpl implements CoursesFacade{
    private Converter<CoursesModel, CoursesData> coursesConverter;
    private CoursesService coursesService;
    private ModelService modelService;

    @Override
    public List<CoursesData> getCoursesDetails() {
        final List<CoursesModel> coursesModels = getCoursesService().getCouresesDetails() ;
        return Converters.convertAll(coursesModels, getCoursesConverter());
    }

    public Converter<CoursesModel, CoursesData> getCoursesConverter() {
        return coursesConverter;
    }

    public void setCoursesConverter(Converter<CoursesModel, CoursesData> coursesConverter) {
        this.coursesConverter = coursesConverter;
    }
    public CoursesService getCoursesService() {
        return coursesService;
    }

    public void setCoursesService(CoursesService coursesService) {
        this.coursesService = coursesService;
    }
    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}

