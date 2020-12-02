package cn.com.newteam.productdao.mapper;

import cn.com.newteam.productdao.eo.MemberPrizeEo;
import java.util.List;

public interface MemberPrizeEoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberPrizeEo record);

    MemberPrizeEo selectByPrimaryKey(Long id);

    List<MemberPrizeEo> selectAll();

    int updateByPrimaryKey(MemberPrizeEo record);
}