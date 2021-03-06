package cn.cqucc.library.service.notify.dao;

import cn.cqucc.library.model.notify.Notify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JianfeiChen
 * @date 2020/5/9 21:31
 * @Description cn.cqucc.library.service.notify.dao
 */
@Mapper
public interface ICKNotifyDAO {
    void addNotify(Notify notify);

    Notify hasDubiousNotify(String account);

    void updateNotifyStatus(String account);

    void updateNotify(Notify notify);

    List<Notify> findAllNotify();

    void lookNotify(Notify notify);

    Notify findNotify(String id);
}
