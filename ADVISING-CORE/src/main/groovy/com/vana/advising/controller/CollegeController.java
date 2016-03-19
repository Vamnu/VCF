package com.vana.advising.controller;

import com.vana.advising.core.college.businesslogic.College;
import com.vana.advising.core.college.businesslogic.impl.CollegeImpl;
import com.vana.advising.core.college.data.CollegeVO;
import com.vana.vcf.core.controller.VcfController;
import com.vana.vcf.core.vcfresponserequest.businesslogic.Request;
import com.vana.vcf.core.vcfresponserequest.businesslogic.Response;
import com.vana.vcf.core.vcfresponserequest.businesslogic.impl.ResponseImpl;

public class CollegeController extends VcfController<CollegeVO> {
    private College college = new CollegeImpl();

    @Override
    public Response getDefault(Request request) {
        return null;
    }

    @Override
    public Response read(Request request) {
        return null;
    }

    @Override
    public Response add(Request request) {
        Response response = new ResponseImpl();
        long collegeID = request.extractLongParameter("COLLEGEID");
        CollegeVO collegeVO = new CollegeVO();
        collegeVO.setCollegeID(collegeID);
        college.add(collegeVO);
        bindResponse(request, response, collegeVO);
        return response;
    }

    @Override
    public Response update(Request request) {
        return null;
    }

    @Override
    public Response delete(Request request) {
        return null;
    }
}
