package powerdesigner;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;


public class XmlPrase {

	/**
	 * 解析xml文档，将解析到得数据封装到Table对象当中
	 */
	
	public List<Table> getXmlTable(String xmlPath){
		
		List <Table> tableList = new ArrayList<Table>();
		
		//根据xml文件，将文件已对象的形式表现出来
		File file = new File(xmlPath);
		//构建解析方式
		SAXReader reader = new SAXReader();
		//得到文档对象
		Document doc = null;
		try {
			doc = reader.read(file);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			System.out.println("文档读取失败！");
			return null;
		}
		//根据xpath方式得到所要得到xml文档的具体对象,根据分析解析xml文档可知，xml文档中含有前缀名
		Map<String,String> map = new HashMap<String, String>();
		map.put("c","collection");
		//根据xml文档，//c:Table 即为得到的文档对象
		XPath path = doc.createXPath("//c:Tables");
		path.setNamespaceURIs(map);
		List<Element> list = path.selectNodes(doc);
		//得到tables对象，该对象是该pdm文件中所有表的集合
		for(Element element : list){
			for(Iterator<Element> iter = element.elementIterator("Table");iter.hasNext();){
				Element table_s = iter.next();
				Table table = new Table();
				table.setTableName(table_s.elementText("Code"));
				//通过一个table对象，得到columns对象
				Element columns = table_s.element("Columns");
				List <Column> columnList = new ArrayList<Column>();
				for(Iterator<Element> cols = columns.elementIterator("Column");cols.hasNext();){
					Element column = cols.next();
					Column column2 = new Column();
					column2.setColumn(column.elementText("Code"));
					column2.setColumnName(column.elementText("Name"));
					column2.setColumnType(column.elementText("DataType"));
					columnList.add(column2);
				}
				table.setColumnList(columnList);
				
				tableList.add(table);
			}
		}
		
		return tableList;
	}
	
	
	public static void main(String [] args){
		XmlPrase xp = new XmlPrase();
		xp.getXmlTable("G:/a.xml");
		
	}
}

