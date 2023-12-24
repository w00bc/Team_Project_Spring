package com.dormitory.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomDTO {
    private String d_code;
    private String r_code;
    private String r_name;
    private String r_description;
    private int r_num;
    private int r_max_num;
    private String r_url;
    private int r_price;
}
