package com.dsumtsov.bookinventoryservice.dto;

import lombok.Data;

@Data
public class InfoDTO {
    private String seed;
    private float results;
    private float page;
    private String version;
}
