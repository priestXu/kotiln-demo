package com.goodsogood.ows.service

import com.goodsogood.ows.mapper.UserMapper
import com.goodsogood.ows.model.UserEntity
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(
        @Autowired val userMapper: UserMapper
) {
    val logger: Logger = LogManager.getLogger(UserService::class.java)
    /**
     * 通过user_id查询一个user对象
     * @param id user_id
     */
    fun findOne(id: Long): UserEntity? {
        return userMapper.selectByPrimaryKey(id)
    }

    /**
     * 添加user对象
     */
    fun addOne(userEntity: UserEntity): Long? {
        userMapper.insert(userEntity)
        logger.debug(userEntity::userId)

        return when (userEntity.userId!! > 0) {
            true -> userEntity.userId
            false -> -1
        }
    }
}