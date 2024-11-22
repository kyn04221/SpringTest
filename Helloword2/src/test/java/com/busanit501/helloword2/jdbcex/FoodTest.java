package com.busanit501.helloword2.jdbcex;

import com.busanit501.helloword2.food.dao.FoodDAO;
import com.busanit501.helloword2.food.dto.FoodVO;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.time.LocalDate;

public class FoodTest {
    private FoodDAO dao = new FoodDAO();

    @Test
    public void insert() throws SQLException {
        FoodVO foodVo = FoodVO.builder()
                .menu("푸라푸치노")
                .price("5000원")
                .build();

        dao.insert(foodVo);

    }
}
