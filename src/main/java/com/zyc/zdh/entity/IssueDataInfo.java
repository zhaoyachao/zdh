package com.zyc.zdh.entity;


import com.alibaba.fastjson.JSONArray;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.sql.Timestamp;
import java.util.List;

@Table
public class IssueDataInfo {

    @Id
    @Column
    private String id;
    @Column
    private String issue_context;

    //输入数据源id
    private String data_sources_choose_input;
    //输入数据源类型
    private String data_source_type_input;
    //输入数据源表名
    private String data_sources_table_name_input;
    //输入数据源文件名
    private String data_sources_file_name_input;
    //输入数据源文件中字段名
    private String data_sources_file_columns;
    //输入数据源表字段名
    private String data_sources_table_columns;

    //输入-输出 字段映射关系json
    private String column_datas;

    //输入-输出 字段映射关系class
    @Transient
    private List<column_data> column_data_list;

    private String owner;

    private Timestamp create_time;

    private String company;

    private String section;

    private String service;

    private String update_context;


    public String getIssue_context() {
        return issue_context;
    }

    public void setIssue_context(String issue_context) {
        this.issue_context = issue_context;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String getData_sources_choose_input() {
        return data_sources_choose_input;
    }

    public void setData_sources_choose_input(String data_sources_choose_input) {
        this.data_sources_choose_input = data_sources_choose_input;
    }

    public String getData_source_type_input() {
        return data_source_type_input;
    }

    public void setData_source_type_input(String data_source_type_input) {
        this.data_source_type_input = data_source_type_input;
    }

    public String getData_sources_table_name_input() {
        return data_sources_table_name_input;
    }

    public void setData_sources_table_name_input(String data_sources_table_name_input) {
        this.data_sources_table_name_input = data_sources_table_name_input;
    }

    public String getData_sources_file_name_input() {
        return data_sources_file_name_input;
    }

    public void setData_sources_file_name_input(String data_sources_file_name_input) {
        this.data_sources_file_name_input = data_sources_file_name_input;
    }

    public String getData_sources_file_columns() {
        return data_sources_file_columns;
    }

    public void setData_sources_file_columns(String data_sources_file_columns) {
        this.data_sources_file_columns = data_sources_file_columns;
    }

    public String getData_sources_table_columns() {
        return data_sources_table_columns;
    }

    public void setData_sources_table_columns(String data_sources_table_columns) {
        this.data_sources_table_columns = data_sources_table_columns;
    }



    public String getColumn_datas() {
        return column_datas;
    }

    public void setColumn_datas(String column_datas) {
        this.column_datas = column_datas;
    }

    public List<column_data> getColumn_data_list() {
        if (getColumn_datas() != null && !getColumn_datas().equals(""))
            return JSONArray.parseArray(getColumn_datas(), column_data.class);
        else
            return null;
    }

    public void setColumn_data_list(List<column_data> column_data_list) {
        this.column_data_list = JSONArray.parseArray(getColumn_datas(), column_data.class);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUpdate_context() {
        return update_context;
    }

    public void setUpdate_context(String update_context) {
        this.update_context = update_context;
    }

}

