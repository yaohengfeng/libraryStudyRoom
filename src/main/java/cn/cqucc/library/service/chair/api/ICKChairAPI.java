package cn.cqucc.library.service.chair.api;

import cn.cqucc.library.model.chair.Chair;

import java.util.List;

/**
 * @author JianfeiChen
 * @date 2020/4/21 16:22
 * @Description 城科图书馆座位操作API
 */
public interface ICKChairAPI {
    List<Chair> occupyChairs(Chair chair);

    int selectChair(List<Chair> chairs);

    void cancelChairs(List<Chair> chairs);

    List<Chair> getUserInfoOfSelectedChair(String account);
}
