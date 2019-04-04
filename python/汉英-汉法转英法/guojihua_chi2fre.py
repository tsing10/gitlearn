# -*- coding: utf-8 -*-
import numpy as np
import pandas as pd
if __name__ == '__main__':
    df_chi = pd.read_excel("Chinese-English.xls",header=None)   #header=None 没有标题 否则会将第一列作为标题
    df_fre = pd.read_excel("Chinese-French.xls",header=None)

    df_chi = df_chi.drop_duplicates(0) #保留0列中的唯一值的行，默认保留第一行
    df_fre = df_fre.drop_duplicates(0)

    df_chi = df_chi.dropna(how="all")    # 一行中全部为NaN的，才丢弃该行
    df_fre = df_fre.dropna(how="all")
    print(df_fre)
    print("-------------------------------")
    print(df_chi)
    print("--------------------------------")
    # df_fre = df_fre.sort_values(by=0)   #按列值排序的方法。by指定列。
    # df_chi = df_chi.sort_values(by=0)

    df = pd.merge(df_chi,df_fre,how='left',on=0)   #右连接方式合并两个dataframe 类似sql的右连接

    df = df.drop(0,axis=1)
    df = df.rename(columns={'1_x':'french','1_y':'english'})
    print(df)
    df.to_excel("French-English.xls")