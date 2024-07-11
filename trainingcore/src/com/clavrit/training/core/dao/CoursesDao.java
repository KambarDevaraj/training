package com.clavrit.training.core.dao;

import com.clavrit.training.core.model.CoursesModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface CoursesDao extends Dao {
    public List<CoursesModel> getCourseDetails();
}

