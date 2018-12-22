package com.miaoqu.service;

import com.miaoqu.dao.GameDao;
import com.miaoqu.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wesley on 2018/11/14.
 */
@Service
public class GameService {
    @Autowired
    private GameDao gameDao;

    public List<Game> getAllGame() {

        return gameDao.getAllGame();
    }

    public void updateGame(Game game) {

        gameDao.updateGame(game);
    }


    public void deleteGame(Integer tid) {

        gameDao.deleteGame(tid);
    }

    public void addGame(Game game) {
        gameDao.addGame(game);
    }

}
