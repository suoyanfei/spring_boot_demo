package com.syf.model;

public class Goods {
	
	private String id;
	
	private String sellerId;
	
	private String goodsName;
	
	private Integer defaultItemId;
	
	private String auditStatus;//状态
	
	private String isMarketable;//是否上架
	
	private Integer brandId;
	
	private String caption;
	
	private Integer category1Id;
	
	private Integer category2Id;
	
	private Integer category3Id;
	
	private String smallPic;
	
	private double price;
	
	private Integer typeTemplateId;
	
	private String isEnableSpec;
    
	private String isDelete;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getDefaultItemId() {
		return defaultItemId;
	}

	public void setDefaultItemId(Integer defaultItemId) {
		this.defaultItemId = defaultItemId;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getIsMarketable() {
		return isMarketable;
	}

	public void setIsMarketable(String isMarketable) {
		this.isMarketable = isMarketable;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Integer getCategory1Id() {
		return category1Id;
	}

	public void setCategory1Id(Integer category1Id) {
		this.category1Id = category1Id;
	}

	public Integer getCategory2Id() {
		return category2Id;
	}

	public void setCategory2Id(Integer category2Id) {
		this.category2Id = category2Id;
	}

	public Integer getCategory3Id() {
		return category3Id;
	}

	public void setCategory3Id(Integer category3Id) {
		this.category3Id = category3Id;
	}

	public String getSmallPic() {
		return smallPic;
	}

	public void setSmallPic(String smallPic) {
		this.smallPic = smallPic;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getTypeTemplateId() {
		return typeTemplateId;
	}

	public void setTypeTemplateId(Integer typeTemplateId) {
		this.typeTemplateId = typeTemplateId;
	}

	public String getIsEnableSpec() {
		return isEnableSpec;
	}

	public void setIsEnableSpec(String isEnableSpec) {
		this.isEnableSpec = isEnableSpec;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", sellerId=" + sellerId + ", goodsName=" + goodsName + ", defaultItemId="
				+ defaultItemId + ", auditStatus=" + auditStatus + ", isMarketable=" + isMarketable + ", brandId="
				+ brandId + ", caption=" + caption + ", category1Id=" + category1Id + ", category2Id=" + category2Id
				+ ", category3Id=" + category3Id + ", smallPic=" + smallPic + ", price=" + price + ", typeTemplateId="
				+ typeTemplateId + ", isEnableSpec=" + isEnableSpec + ", isDelete=" + isDelete + "]";
	}
	
	

}
