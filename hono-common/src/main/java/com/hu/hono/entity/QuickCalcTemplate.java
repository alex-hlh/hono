package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hono
 * @since 2024-08-01
 */
@TableName("quick_calc_template")
@ApiModel(value = "QuickCalcTemplate对象", description = "")
public class QuickCalcTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "UUID", type = IdType.AUTO)
    private Long uuid;

    private String templateName;

    private Double rentalPlantArea;

    private Double rentalHouseArea;

    private Double industrialWater;

    private Double urbaniteWater;

    private Double industrialElec;

    private Double urbaniteElec;

    private Double industrialNaturalGas;

    private Double urbaniteNaturalGas;

    private Double minWageStandard;

    private Double partTimeMinSal;

    private Integer empCount;

    private Double empAvgSal;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createBy;

    private String updateBy;

    private Integer sortNo;

    private Integer isDel;

    private Double officeWater;

    private Double officeElec;

    private Double officeLand;

    private Double officeNaturalGas;

    private Double industrialLand;

    private Double dcElec;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Double getRentalPlantArea() {
        return rentalPlantArea;
    }

    public void setRentalPlantArea(Double rentalPlantArea) {
        this.rentalPlantArea = rentalPlantArea;
    }

    public Double getRentalHouseArea() {
        return rentalHouseArea;
    }

    public void setRentalHouseArea(Double rentalHouseArea) {
        this.rentalHouseArea = rentalHouseArea;
    }

    public Double getIndustrialWater() {
        return industrialWater;
    }

    public void setIndustrialWater(Double industrialWater) {
        this.industrialWater = industrialWater;
    }

    public Double getUrbaniteWater() {
        return urbaniteWater;
    }

    public void setUrbaniteWater(Double urbaniteWater) {
        this.urbaniteWater = urbaniteWater;
    }

    public Double getIndustrialElec() {
        return industrialElec;
    }

    public void setIndustrialElec(Double industrialElec) {
        this.industrialElec = industrialElec;
    }

    public Double getUrbaniteElec() {
        return urbaniteElec;
    }

    public void setUrbaniteElec(Double urbaniteElec) {
        this.urbaniteElec = urbaniteElec;
    }

    public Double getIndustrialNaturalGas() {
        return industrialNaturalGas;
    }

    public void setIndustrialNaturalGas(Double industrialNaturalGas) {
        this.industrialNaturalGas = industrialNaturalGas;
    }

    public Double getUrbaniteNaturalGas() {
        return urbaniteNaturalGas;
    }

    public void setUrbaniteNaturalGas(Double urbaniteNaturalGas) {
        this.urbaniteNaturalGas = urbaniteNaturalGas;
    }

    public Double getMinWageStandard() {
        return minWageStandard;
    }

    public void setMinWageStandard(Double minWageStandard) {
        this.minWageStandard = minWageStandard;
    }

    public Double getPartTimeMinSal() {
        return partTimeMinSal;
    }

    public void setPartTimeMinSal(Double partTimeMinSal) {
        this.partTimeMinSal = partTimeMinSal;
    }

    public Integer getEmpCount() {
        return empCount;
    }

    public void setEmpCount(Integer empCount) {
        this.empCount = empCount;
    }

    public Double getEmpAvgSal() {
        return empAvgSal;
    }

    public void setEmpAvgSal(Double empAvgSal) {
        this.empAvgSal = empAvgSal;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Double getOfficeWater() {
        return officeWater;
    }

    public void setOfficeWater(Double officeWater) {
        this.officeWater = officeWater;
    }

    public Double getOfficeElec() {
        return officeElec;
    }

    public void setOfficeElec(Double officeElec) {
        this.officeElec = officeElec;
    }

    public Double getOfficeLand() {
        return officeLand;
    }

    public void setOfficeLand(Double officeLand) {
        this.officeLand = officeLand;
    }

    public Double getOfficeNaturalGas() {
        return officeNaturalGas;
    }

    public void setOfficeNaturalGas(Double officeNaturalGas) {
        this.officeNaturalGas = officeNaturalGas;
    }

    public Double getIndustrialLand() {
        return industrialLand;
    }

    public void setIndustrialLand(Double industrialLand) {
        this.industrialLand = industrialLand;
    }

    public Double getDcElec() {
        return dcElec;
    }

    public void setDcElec(Double dcElec) {
        this.dcElec = dcElec;
    }

    @Override
    public String toString() {
        return "QuickCalcTemplate{" +
            "uuid = " + uuid +
            ", templateName = " + templateName +
            ", rentalPlantArea = " + rentalPlantArea +
            ", rentalHouseArea = " + rentalHouseArea +
            ", industrialWater = " + industrialWater +
            ", urbaniteWater = " + urbaniteWater +
            ", industrialElec = " + industrialElec +
            ", urbaniteElec = " + urbaniteElec +
            ", industrialNaturalGas = " + industrialNaturalGas +
            ", urbaniteNaturalGas = " + urbaniteNaturalGas +
            ", minWageStandard = " + minWageStandard +
            ", partTimeMinSal = " + partTimeMinSal +
            ", empCount = " + empCount +
            ", empAvgSal = " + empAvgSal +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", createBy = " + createBy +
            ", updateBy = " + updateBy +
            ", sortNo = " + sortNo +
            ", isDel = " + isDel +
            ", officeWater = " + officeWater +
            ", officeElec = " + officeElec +
            ", officeLand = " + officeLand +
            ", officeNaturalGas = " + officeNaturalGas +
            ", industrialLand = " + industrialLand +
            ", dcElec = " + dcElec +
        "}";
    }
}
