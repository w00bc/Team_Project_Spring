package com.dormitory.service;


import com.dormitory.dto.DormitoryDTO;
import com.dormitory.mapper.DormitoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    DormitoryMapper mapper;
    // 메인화면 숙소 정보 조회
    //=====================MAIN======================

    @Override
    public List<DormitoryDTO> getDormitoryList(int pageNum, String keyword, String type, String star, LocalDate startDate,LocalDate endDate) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("pageNum",pageNum);
        data.put("keyword",keyword);
        data.put("type",type);
        data.put("star",star);
        data.put("startDate",startDate);
        data.put("endDate",endDate);

        System.out.println(pageNum);
        System.out.println(keyword);
        System.out.println(type);
        System.out.println(star);
        System.out.println(startDate);
        System.out.println(endDate);

        List<DormitoryDTO> list = mapper.getDormitoryList(data);
        if(list == null) System.out.println("null");
        else System.out.println("not null");
        System.out.println(list);
        //System.out.println("디비 접속 = " + list.get(0).getD_name());

        return mapper.getDormitoryList(data);
    }

    //리뷰 높은 순  추천
    @Override
    public List<DormitoryDTO> getDormitoryStar(String keyword) {
        return mapper.getDormitoryStar(keyword);
    }
}
