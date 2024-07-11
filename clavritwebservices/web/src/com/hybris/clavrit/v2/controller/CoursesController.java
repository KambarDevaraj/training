package com.hybris.clavrit.v2.controller;

import com.clavrit.training.facades.courses.CoursesFacade;
import com.hybris.clavrit.courses.data.CoursesDataList;
import com.hybris.clavrit.courses.data.CoursesDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.springframework.security.access.annotation.Secured;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class CoursesController extends BaseCommerceController{
    private CoursesFacade coursesFacade;

    @Secured("ROLE_TRUSTED_CLIENT")

    @RequestMapping(value="/getCoursesDetails", method= RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname="getCoursesDetails", value="Get Courses Details",
            notes="Return a Courses details",authorizations={@Authorization
            (value="oauth2_client_credentials")})

    @ApiBaseSiteIdParam
    public CoursesDataListWSDTO getCoursesDetails(
            @ApiParam(value="Response configuaration. This is the list of filelds that should be returned in the response body",allowableValues="BASIC,DEFAULT,FULL")
            @RequestParam(defaultValue=DEFAULT_FIELD_SET) final String fields)
    {
        final CoursesDataList coursesDataList = new CoursesDataList();
        coursesDataList.setCourses(coursesFacade.getCoursesDetails());
        return  getDataMapper().map(coursesDataList, CoursesDataListWSDTO.class, fields);
    }
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public String showCourses(Model model) {
        final CoursesDataList coursesDataList = new CoursesDataList();
        coursesDataList.setCourses(coursesFacade.getCoursesDetails());
        model.addAttribute("courses", coursesDataList.getCourses());
        return "courses";
    }
}

