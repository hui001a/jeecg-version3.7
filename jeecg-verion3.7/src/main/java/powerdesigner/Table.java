package powerdesigner;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private String tableName;//表名
	
	private List<Column>columnList = new ArrayList<Column>();//字段对象

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Column> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}
	
	
}
