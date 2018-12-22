package com.miaoqu.dao;

import com.miaoqu.entity.Admin;
import com.miaoqu.entity.Channle;
import com.miaoqu.entity.ChannleMaster;
import com.miaoqu.entity.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wesley on 2018/11/12.
 */
@Mapper
public interface AdminDao {

    List<Admin> getAllAdmin();

    void addAdmin(Admin admin);

    int deleteAdmin(Integer adminId);

    int updateAdmin(Admin admin);

    Admin getAdmin(@Param("name") String name, @Param("passWord") String passWord);

    List<Game> getAdminGames(@Param("adminId") Integer adminId);

    List<ChannleMaster> getAdminChannleMaster(@Param("adminId") Integer adminId);

    List<Channle> getAdminChannle(@Param("adminId") Integer adminId);

    void addAdminGames(@Param("adminId") Integer adminId, @Param("gameId") Integer gameId);

    void addAdminChannles(@Param("adminId") Integer adminId, @Param("channleId") Integer channleId);

    void addAdminChannleMasters(@Param("adminId") Integer adminId, @Param("channleMasterId") Integer channleMasterId);

    void deleteAdminGame(@Param("adminId") Integer adminId, @Param("gameId") Integer gameId);

    void deleteAdminChannle(@Param("adminId") Integer adminId, @Param("channleId") Integer gameId);

    void deleteAdminChannleMaster(@Param("adminId") Integer adminId, @Param("channleMasterId") Integer gameId);

}
