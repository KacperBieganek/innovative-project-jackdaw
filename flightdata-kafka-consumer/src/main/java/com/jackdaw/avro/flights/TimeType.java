/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.jackdaw.avro.flights;
@SuppressWarnings("all")
/** Type of time */
@org.apache.avro.specific.AvroGenerated
public enum TimeType {
  departureEstimate, departureReal, arrivalEstimate, arrivalReal  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"TimeType\",\"namespace\":\"com.jackdaw.avro.flights\",\"doc\":\"Type of time\",\"symbols\":[\"departureEstimate\",\"departureReal\",\"arrivalEstimate\",\"arrivalReal\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}