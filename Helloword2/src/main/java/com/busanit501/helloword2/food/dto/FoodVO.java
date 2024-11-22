package com.busanit501.helloword2.food.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class FoodVO {
    private Long tno;
    private String menu;
    private String price;
//    private LocalDate dueDate;
//    private boolean finished;
}
