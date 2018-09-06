package com.goodsogood.ows.mapper

import com.goodsogood.ows.model.vo.UserEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Repository
@Mapper
interface UserMapper : MyMapper<UserEntity>

@Repository
@Mapper
interface OtherUserMapper : MyMapper<UserEntity>