package entity;

import java.util.Date;

public class ConsumeRecords {
    private Integer id;

    private Integer cardId;

    private Date createTime;

    private Double monetary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getMonetary() {
        return monetary;
    }

    public void setMonetary(Double monetary) {
        this.monetary = monetary;
    }
}