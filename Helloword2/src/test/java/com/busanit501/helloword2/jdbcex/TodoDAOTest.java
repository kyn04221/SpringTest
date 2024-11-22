package com.busanit501.helloword2.jdbcex;

import com.busanit501.helloword2.jdbc.dao.TodoDAO;
import com.busanit501.helloword2.jdbc.dto.TodoVO;
import lombok.Builder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.time.LocalDate;


public class TodoDAOTest {
    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }

    @Test
    public void gettime(){
        System.out.println("sql전달 후 시간 조회"+todoDAO.getTim());
    }

    @Test
    public void getTime2() throws SQLException, SQLException {
        System.out.println("sql 전달 후, " +
                "시간 조회 확인용: 자동 반납 @Cleanup 확인 "+todoDAO.getTime2());
    }


    @Test
    public void insert() throws SQLException{

//        TodoVO todoVo = new TodoVO();
//
//        todoVo.setTitle("점심");
//        todoVo.setDueDate(LocalDate.of("2024,12,31"));


        TodoVO todoVo = TodoVO.builder()
                .title("디비연결 테스트")
                .dueDate(LocalDate.of(2024,12,31))
                .build();

        todoDAO.insert(todoVo);

    }
}
