package com.myhbase.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
public class HBaseDemo {
	
	public static void main(String[] args) throws Exception {
		 //首先得到HBase的配置对象
		Configuration conf = HBaseConfiguration.create();
		//配置Client连向谁，我们的Client连向的是zookeeper，因此我们配置的是zookeeper的信息，这些信息存在hbase-site.xml当中。
		  //我们会觉得不可思议，建HBase表，竟然Client连的既不是HMaster也不是HRegionServer，而是zookeeper，其实Client连zookeeper
		  //zookeeper只是负责协调，真正执行建表语句的还是HMaster，只不过zookeeper帮我们去找到HMaster并告诉它应该做什么了而已。
		conf.set("hbase.zookeeper.quorum", "192.168.72.102,192.168.72.103,192.168.72.104");
		conf.set("hbase.zookeeper.property.clientPort", "2181");
	    conf.set("hbase.master", "192.168.72.101:16010");
		Connection conn = ConnectionFactory.createConnection(conf);
		//要创建HBase表，我们需要HBaseAdmin对象
		Admin admin = conn.getAdmin();
		//admin的create方法接收的参数是一个HTableDescriptor对象,因此我们需要先获取HTableDescriptor,
		//我们给表起名为peoples（人类）
		HTableDescriptor htd = new HTableDescriptor(TableName.valueOf("peoples"));
		//我们还需要给表描述对象添加一些属性，我们在建表的时候会创建列族，
		//首先我们创建一个名叫"info"的列族。
		HColumnDescriptor hcd_info =new HColumnDescriptor("info");
		//每个列族可以指定最大的版本存储数量，这里我们给列族"info"设置版本最大存储数量是3
		hcd_info.setMaxVersions(3);
		//接着我们再创建第二个列族
		HColumnDescriptor hcd_data = new HColumnDescriptor("data");
		
		 //创建完两个列族，我们需要把列族添加到表的描述对象当中
		htd.addFamily(hcd_info);
		htd.addFamily(hcd_data);
		
		 //这时我们开始创建表，前面已经设置了一些属性值，因此生成的表便会带一些属性的。
		admin.createTable(htd);
		
		  //用完admin对象要记得关闭
		admin.close();
	}
}
