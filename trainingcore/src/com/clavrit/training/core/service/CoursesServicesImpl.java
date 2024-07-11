package com.clavrit.training.core.service;

import com.clavrit.training.core.dao.CoursesDao;
import com.clavrit.training.core.model.CoursesModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

public class CoursesServicesImpl implements CoursesService{
    private CoursesDao coursesDao;
    private ModelService modelService;


    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public List<CoursesModel> getCouresesDetails() {
        final List<CoursesModel> coursesModels = getCoursesDao().getCourseDetails();
        return coursesModels;
    }

    public CoursesDao getCoursesDao() {
        return coursesDao;
    }

    public void setCoursesDao(CoursesDao coursesDao) {
        this.coursesDao = coursesDao;
    }
}

