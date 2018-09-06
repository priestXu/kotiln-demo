package com.goodsogood.ows.mapper

import com.goodsogood.ows.model.UserEntity
import org.springframework.stereotype.Repository

@Repository
@org.apache.ibatis.annotations.Mapper
interface UserMapper : MyMapper<UserEntity>
