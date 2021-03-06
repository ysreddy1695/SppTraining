package com.tech.sar.session

import org.apache.spark.sql.SparkSession

object DemoSparkSession {

  def spark: SparkSession = {
    val session = SparkSession.builder().appName("DemoTraining").master("local").getOrCreate()
    session
  }
}