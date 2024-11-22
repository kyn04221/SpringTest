package com.busanit501.helloword2.jdbc.dao;

import com.busanit501.helloword2.jdbc.dto.TodoVO;
import lombok.Cleanup;

import java.sql.*;

public class TodoDAO {

    public void insert(TodoVO vo) throws SQLException {
        String sql = "insert into tbl_todo(title, dueDate, finished) values(?,?,?)";

        @Cleanup Connection con = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pr = con.prepareStatement(sql);

        pr.setString(1, vo.getTitle());
        pr.setDate(2, Date.valueOf(vo.getDueDate()));
        pr.setBoolean(3, vo.isFinished());

        pr.executeUpdate();
    }

    public String getTim(){
        String now = null;

        try (Connection con = ConnectionUtil.INSTANCE.getConnection();
             PreparedStatement pr = con.prepareStatement("select now()");
             ResultSet resultSet = pr.executeQuery();
        ) {
            resultSet.next();
            now = resultSet.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        } //catch
        return now;
    } //getTime

    public String getTime2() throws SQLException, SQLException {
        String now = null;
        // 자동으로 디비의 connection 반납하는 방법2
        // @Cleanup
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select now()");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        now = resultSet.getString(1);
        return now;
    }
    }

