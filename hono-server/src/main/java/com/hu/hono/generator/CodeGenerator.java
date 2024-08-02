package com.hu.hono.generator;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.query.SQLQuery;
import java.sql.Types;
import java.util.Collections;

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {
	public static void main(String[] args) {
		FastAutoGenerator.create("jdbc:mysql://192.168.1.102:3306/hono", "root", "123456")
			.globalConfig(builder -> {
				builder.author("hono") // 设置作者
					.enableSwagger() // 开启 swagger 模式
					.outputDir("D://"); // 指定输出目录
			})
			.dataSourceConfig(builder ->
				builder.schema("public").databaseQueryClass(SQLQuery.class).typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
					int typeCode = metaInfo.getJdbcType().TYPE_CODE;
					if (typeCode == Types.SMALLINT) {
						// 自定义类型转换
						return DbColumnType.INTEGER;
					}
					return typeRegistry.getColumnType(metaInfo);
				})
			)
			.packageConfig(builder ->
				builder.parent("com.hu") // 设置父包名
					.moduleName("hono") // 设置父包模块名
					.pathInfo(Collections.singletonMap(OutputFile.xml, "D://")) // 设置mapperXml生成路径
			)
			.strategyConfig(builder ->
				builder.addInclude("hik_user_info")
					.addInclude("ot_count_service")
					.addInclude("ot_depart_permission")
					.addInclude("ot_exceltemp_classify")
					.addInclude("ot_template")
					.addInclude("ot_template_class_file")
					.addInclude("ot_template_datebase")
					.addInclude("ot_template_field")
					.addInclude("ot_template_history")
					.addInclude("ot_template_upload")
					.addInclude("qrtz_blob_triggers")
					.addInclude("qrtz_calendars")
					.addInclude("qrtz_cron_triggers")
					.addInclude("qrtz_fired_triggers")
					.addInclude("qrtz_job_details")
					.addInclude("qrtz_locks")
					.addInclude("qrtz_paused_trigger_grps")
					.addInclude("qrtz_scheduler_state")
					.addInclude("qrtz_simple_triggers")
					.addInclude("qrtz_simprop_triggers")
					.addInclude("qrtz_triggers")
					.addInclude("quick_calc_template")
					.addInclude("sys_announcement")
					.addInclude("sys_announcement_send")
					.addInclude("sys_app_info")
					.addInclude("sys_app_msg_auth")
					.addInclude("sys_app_msg_info")
					.addInclude("sys_app_msg_send_info")
					.addInclude("sys_app_msg_send_mode")
					.addInclude("sys_app_service_rel")
					.addInclude("sys_category")
					.addInclude("sys_check_rule")
					.addInclude("sys_data_log")
					.addInclude("sys_data_source")
					.addInclude("sys_depart")
					.addInclude("sys_depart_permission")
					.addInclude("sys_depart_role")
					.addInclude("sys_depart_role_permission")
					.addInclude("sys_depart_role_user")
					.addInclude("sys_dict")
					.addInclude("sys_dict_item")
					.addInclude("sys_log")
					.addInclude("sys_log_content")
					.addInclude("sys_open_service")
					.addInclude("sys_permission")
					.addInclude("sys_permission_data_rule")
					.addInclude("sys_portal_server")
					.addInclude("sys_position")
					.addInclude("sys_quartz_job")
					.addInclude("sys_role")
					.addInclude("sys_role_permission")
					.addInclude("sys_server_application_config")
					.addInclude("sys_server_config")
					.addInclude("sys_service_param")
					.addInclude("sys_service_response_code")
					.addInclude("sys_sms")
					.addInclude("sys_sms_template")
					.addInclude("sys_tenant")
					.addInclude("sys_third_account")
					.addInclude("sys_user")
					.addInclude("sys_user_agent")
					.addInclude("sys_user_depart")
					.addInclude("sys_user_role")
			)
			.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
			.execute();
	}
}
