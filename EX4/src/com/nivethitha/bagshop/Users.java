package com.nivethitha.bagshop;

public class Users {
	
		private String u_name,pwd;
		private String shop_name;
		private String branch;
		private String jewel_type;
		private int quantity;
		private String name;
		private String id;

		public Users()
		{
			
		}

		public Users(String u_name, String pwd) {
			super();
			this.u_name = u_name;
			this.pwd = pwd;
		}
		public String getU_name() {
			return u_name;
		}

		public void setU_name(String u_name) {
			this.u_name = u_name;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getShop_name() {
			return getShop_name();
		}
		public void setShop_name(String shop_name) {
			this.shop_name = shop_name;
		}
		public String getBranch() {
			return getBranch();
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getJewel_type() {
			return getJewel_type();
		}
		public void setJewel_type(String jewel_type) {
			this.jewel_type = jewel_type;
		}
		public int getQuantity() {
			return getQuantity();
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public String getName() {
			return getName();
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			String id = null;
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}


		@Override
		public String toString() {
			return "Bag [name=" + name + ", shop_name=" + shop_name + ", branch=" + branch + ", bag_type="
					+ jewel_type + ", quantity=" + quantity + ", id=" + id + "]";
		}
}
