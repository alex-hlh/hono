package com.hu.hono.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author hlh
 * @version v1.0
 * @title ForcesEntity
 * @projectName hono
 * @description
 * @date 2023/2/24 9:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "t_forces")
public class ForcesEntity {
    @Id
    private Long id;//主键
    @Indexed
    private String monarch;//君主
    private String adviser;//军师
    private String peerage;//爵位
    @Indexed
    private String nation;//国号
    private String forcesColor;//势力颜色
    private String forcePolicy;//势力方针
    private String forcesTarget;//势力目标
    private String PalyerForcesNo;//玩家势力序号
    private String aimForces;//首要目标势力
    private String duration;//存在时间
    private String Reinforcements;//请求援军
    private String researchSkills;//研究技巧
    private String researchTime;//已用研究时间
    private String skillPoints;//研究点数
    private String lpA0_0;//研究点数
}
