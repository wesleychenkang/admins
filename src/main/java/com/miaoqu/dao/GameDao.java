package com.miaoqu.dao;

import com.miaoqu.entity.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wesley on 2018/11/12.
 */
@Mapper
public interface GameDao {

    List<Game> getAllGame();

    void addGame(Game game);

    void updateGame(Game game);

    void deleteGame(Integer gameId);


}
