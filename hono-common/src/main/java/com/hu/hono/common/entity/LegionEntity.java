package com.hu.hono.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author hlh
 * @version v1.0
 * @title LegionEntity
 * @projectName hono
 * @description
 * @date 2023/2/24 12:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "t_legion")
public class LegionEntity {
    @Id
    private Long id;//主键
    private String legionName;//军团名称
    private String forces;

}
