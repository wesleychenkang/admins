package com.miaoqu.service;

import com.miaoqu.entity.Game;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/11/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GameServiceTest {
    @Autowired
    GameService gameService;

    @Test
    public void getAllGame() throws Exception {
        List<Game> list = gameService.getAllGame();
        for (Game game : list) {
            System.out.println("gmae===" + game);
        }
    }

    @Test
    public void updateGame() throws Exception {
        Game game = new Game();
        game.setTid(1);
        game.setGameId("10001");
        game.setCreateTime(new Date());
        game.setUpdateTime(new Date());
        game.setParentID(2);
        game.setGameName("test update");
        gameService.updateGame(game);
    }

    @Test
    public void deleteGame() throws Exception {
        gameService.deleteGame(1);
    }

    @Test
    public void addGame() throws Exception {
        Game game = new Game();
        game.setGameId("10002");
        game.setCreateTime(new Date());
        game.setUpdateTime(new Date());
        game.setParentID(1);
        game.setGameName("add game3");
        gameService.addGame(game);
    }

}