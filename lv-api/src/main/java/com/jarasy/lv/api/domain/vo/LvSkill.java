package com.jarasy.lv.api.domain.vo;

/**
 * Created by wjh on 2018/12/14 0014.
 */
public class LvSkill {
    private Integer id;
    private String name;
    private Integer usehp;
    private Integer usemp;
    private Integer rank;
    private Integer parameter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUsehp() {
        return usehp;
    }

    public void setUsehp(Integer usehp) {
        this.usehp = usehp;
    }

    public Integer getUsemp() {
        return usemp;
    }

    public void setUsemp(Integer usemp) {
        this.usemp = usemp;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getParameter() {
        return parameter;
    }

    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }
}
