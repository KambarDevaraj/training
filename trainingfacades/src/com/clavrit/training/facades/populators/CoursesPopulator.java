package com.clavrit.training.facades.populators;

import com.clavrit.training.core.model.CoursesModel;
import com.clavrit.training.facades.courses.data.CoursesData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class CoursesPopulator implements Populator<CoursesModel, CoursesData> {
    @Override
    public void populate(final CoursesModel source, final CoursesData target) throws ConversionException {
        target.setCourseCode(source.getCourseCode());
        target.setCourseName(source.getCourseName());
        target.setCourseAmount(source.getCourseAmount());
        target.setCourseDuration(source.getCourseDuration());

    }
}

