package com.myhbase.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

/*
 * 源码来自 https://www.cnblogs.com/junrong624/p/7323483.html
 * 我拿来用于自己的集群上 
 * hbase-site.xml 和 hdfs-site.xml 需要放到package com.myhbase.hbase:打开该包的本地目录 复制两个文件 refresh工程
 * 2018/12/28
 */
public class HBaseDemo2 {
    public static Configuration conf;
    public static Connection conn;
    public static Admin admin;
    
 // 初始化链接
    public static void init() throws Exception {
    	conf = HBaseConfiguration.create();
    	conf.set("hbase.zookeeper.property.clientPort", "2181");
    	conf.set("hbase.zookeeper.quorum", "ubuntu02,ubuntu03,ubuntu04");
    	conn = ConnectionFactory.createConnection(conf);
    	admin = conn.getAdmin();
    }
//    关闭连接
    public static void close() throws IOException {
    	if(null != admin) {
    		admin.close();
    	}
    	if(null != conn) {
    		conn.close();
    	}
    }
    
//    建表
    public static void createTable(String tableName, String[] cols) throws Exception {
    	init();
    	TableName tn = TableName.valueOf(tableName);
    	if(admin.tableExists(tn)) {
    		
    		System.out.println("table is exists");
    	}else {
    		HTableDescriptor htd = new HTableDescriptor(tn);
    		for (String col : cols) {
				HColumnDescriptor hcd = new HColumnDescriptor(col);
				htd.addFamily(hcd);
			}
    		admin.createTable(htd);
    	}
    	close();
    }
//    删表
    public static void deleteTable(String tableName) throws Exception {
    	init();
    	TableName tn = TableName.valueOf(tableName);
    	if(admin.tableExists(tn)) {
    		admin.disableTable(tn);
    		admin.disableTable(tn);
    	}
    	close();
	}
//    查看已有的表
    public static void listTables() throws Exception {
		init();
		HTableDescriptor[] htds = admin.listTables();
		for (HTableDescriptor htd : htds) {
			System.out.println(htd.getNameAsString());
		}
		close();
	} 
//    插入数据
    public static void insertRow(String tableName, String rowKey, String colFamily, String col, String val) throws Exception {
		// TODO Auto-generated method stub
    	init();
    	Table table = conn.getTable(TableName.valueOf(tableName));
    	Put put = new Put(Bytes.toBytes(rowKey));
    	put.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col), Bytes.toBytes(val));
    	table.put(put);
    	// 批量插入
        /*
         * List<Put> putList = new ArrayList<Put>(); puts.add(put);
         * table.put(putList);
         */
    	table.close();
    	close();
	}
 // 删除数据
    public static void deleRow(String tableName, String rowkey, String colFamily, String col) throws Exception {
        init();
        Table table = conn.getTable(TableName.valueOf(tableName));
        Delete delete = new Delete(Bytes.toBytes(rowkey));
        // 删除指定列族
        // delete.addFamily(Bytes.toBytes(colFamily));
        // 删除指定列
        // delete.addColumn(Bytes.toBytes(colFamily),Bytes.toBytes(col));
        table.delete(delete);
        // 批量删除
        /*
         * List<Delete> deleteList = new ArrayList<Delete>();
         * deleteList.add(delete); table.delete(deleteList);
         */
        table.close();
        close();
    }
 // 根据rowkey查找数据
    public static void getData(String tableName, String rowkey, String colFamily, String col) throws Exception {
        init();
        Table table = conn.getTable(TableName.valueOf(tableName));
        Get get = new Get(Bytes.toBytes(rowkey));
        // 获取指定列族数据
//         get.addFamily(Bytes.toBytes(colFamily));
        // 获取指定列数据
//         get.addColumn(Bytes.toBytes(colFamily),Bytes.toBytes(col));
        Result result = table.get(get);

        showCell(result);
        table.close();
        close();
    }
    // 格式化输出
    public static void showCell(Result result) {
        Cell[] cells = result.rawCells();
        for (Cell cell : cells) {
            System.out.println("RowName:" + new String(CellUtil.cloneRow(cell)) + " ");
            System.out.println("Timetamp:" + cell.getTimestamp() + " ");
            System.out.println("column Family:" + new String(CellUtil.cloneFamily(cell)) + " ");
            System.out.println("row Name:" + new String(CellUtil.cloneQualifier(cell)) + " ");
            System.out.println("value:" + new String(CellUtil.cloneValue(cell)) + " ");
        }
    }
 // 批量查找数据
    public static void scanData(String tableName, String startRow, String stopRow) throws Exception {
        init();
        Table table = conn.getTable(TableName.valueOf(tableName));
        Scan scan = new Scan();
        // scan.setStartRow(Bytes.toBytes(startRow));
        // scan.setStopRow(Bytes.toBytes(stopRow));
        ResultScanner resultScanner = table.getScanner(scan);
        for (Result result : resultScanner) {
            showCell(result);
        }
        table.close();
        close();
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		createTable("work",new String[]{"salary","place","houres-day"});
//		listTables();
//		String tableName, String rowKey, String colFamily, String col, String val
//		insertRow("peoples", "1", "info", "name", "yangshanqing");
//		insertRow("peoples", "2", "info", "name", "杨善清");
//		insertRow("peoples", "3", "info", "name", "tsing");
//		insertRow("work","1","salary","month-salary","12000");
		scanData("work","1","10");
//		scanData("peoples","1","10");
		
//		getData("peoples","1","info","name");
		
	}

}
