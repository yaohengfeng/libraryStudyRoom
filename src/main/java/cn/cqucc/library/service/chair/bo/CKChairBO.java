package cn.cqucc.library.service.chair.bo;

import cn.cqucc.library.model.chair.Chair;
import cn.cqucc.library.model.chair.req.CKSelectedChair;
import cn.cqucc.library.service.chair.api.ICKChairAPI;
import cn.cqucc.library.service.chair.dao.ICKChairDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author JianfeiChen
 * @date 2020/4/21 16:23
 * @Description
 */
@Service
public class CKChairBO implements ICKChairAPI {

    @Autowired
    ICKChairDAO chairDAO;

    @Override
    public List<Chair> occupyChairs(Chair chair) {
        return chairDAO.occupyChairs(chair);
    }

    @Override
    public int selectChair(List<Chair> chairs) {
        // 被选中的座位数
        int selectedChairCount = chairs.size();
        // 已经选中的座位数
        int chairCount = chairDAO.selectChairAmount(chairs.get(0).getUserId());
        if ((selectedChairCount + chairCount) > 4) {
            return 502;
        }
        for (Chair chair : chairs) {
            chair.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            chairDAO.selectChair(chair);
        }
        return 200;
    }
}
