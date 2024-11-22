package com.busanit501.helloword2.food.dao;

import com.busanit501.helloword2.food.dto.FoodVO;
import com.busanit501.helloword2.food.service.FoodConnectionUtil;
import com.busanit501.helloword2.jdbc.dao.ConnectionUtil;
import com.busanit501.helloword2.jdbc.dto.TodoVO;
import lombok.Cleanup;

import java.sql.*;

public class FoodDAO {

    public void insert(FoodVO vo) throws SQLException {
        String sql = "insert into food(menu, price) values(?,?)";

        @Cleanup Connection con = FoodConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pr = con.prepareStatement(sql);

        pr.setString(1, vo.getMenu());
        pr.setString(2, vo.getPrice());

        pr.executeUpdate();
    }


    }

