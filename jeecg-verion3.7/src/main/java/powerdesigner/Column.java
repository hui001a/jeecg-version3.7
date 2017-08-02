package powerdesigner;

import java.math.BigDecimal;

public class Column {

	/**
	 * 数据的列
	 */
	
	
	private String columnType;//类型
	
	private String column;//字段
	
	private String columnName;//说明

	public String getColumnType() {
		if(columnType.toLowerCase().contains("varchar")||columnType.contains("char")){
			return "String";
		}
		else if(columnType.toLowerCase().contains("numeric")){
			return "BigDecimal";
		}
		else if(columnType.toLowerCase().contains("bigint")){
			return "Long";
		}
		else if(columnType.toLowerCase().contains("date")){
			return "Date";
		}
		else if(columnType.toLowerCase().contains("int")){
			return "int";
		}
		else{
			return columnType;
		}
		
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}	
}
