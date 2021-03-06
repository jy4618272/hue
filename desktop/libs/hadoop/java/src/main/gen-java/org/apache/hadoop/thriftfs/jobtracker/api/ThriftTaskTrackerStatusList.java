/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Container structure for TaskTrackerStatus objects
 */
public class ThriftTaskTrackerStatusList implements org.apache.thrift.TBase<ThriftTaskTrackerStatusList, ThriftTaskTrackerStatusList._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftTaskTrackerStatusList");

  private static final org.apache.thrift.protocol.TField TRACKERS_FIELD_DESC = new org.apache.thrift.protocol.TField("trackers", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftTaskTrackerStatusListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftTaskTrackerStatusListTupleSchemeFactory());
  }

  public List<ThriftTaskTrackerStatus> trackers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRACKERS((short)1, "trackers");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TRACKERS
          return TRACKERS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRACKERS, new org.apache.thrift.meta_data.FieldMetaData("trackers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftTaskTrackerStatus.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftTaskTrackerStatusList.class, metaDataMap);
  }

  public ThriftTaskTrackerStatusList() {
  }

  public ThriftTaskTrackerStatusList(
    List<ThriftTaskTrackerStatus> trackers)
  {
    this();
    this.trackers = trackers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftTaskTrackerStatusList(ThriftTaskTrackerStatusList other) {
    if (other.isSetTrackers()) {
      List<ThriftTaskTrackerStatus> __this__trackers = new ArrayList<ThriftTaskTrackerStatus>();
      for (ThriftTaskTrackerStatus other_element : other.trackers) {
        __this__trackers.add(new ThriftTaskTrackerStatus(other_element));
      }
      this.trackers = __this__trackers;
    }
  }

  public ThriftTaskTrackerStatusList deepCopy() {
    return new ThriftTaskTrackerStatusList(this);
  }

  @Override
  public void clear() {
    this.trackers = null;
  }

  public int getTrackersSize() {
    return (this.trackers == null) ? 0 : this.trackers.size();
  }

  public java.util.Iterator<ThriftTaskTrackerStatus> getTrackersIterator() {
    return (this.trackers == null) ? null : this.trackers.iterator();
  }

  public void addToTrackers(ThriftTaskTrackerStatus elem) {
    if (this.trackers == null) {
      this.trackers = new ArrayList<ThriftTaskTrackerStatus>();
    }
    this.trackers.add(elem);
  }

  public List<ThriftTaskTrackerStatus> getTrackers() {
    return this.trackers;
  }

  public ThriftTaskTrackerStatusList setTrackers(List<ThriftTaskTrackerStatus> trackers) {
    this.trackers = trackers;
    return this;
  }

  public void unsetTrackers() {
    this.trackers = null;
  }

  /** Returns true if field trackers is set (has been assigned a value) and false otherwise */
  public boolean isSetTrackers() {
    return this.trackers != null;
  }

  public void setTrackersIsSet(boolean value) {
    if (!value) {
      this.trackers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRACKERS:
      if (value == null) {
        unsetTrackers();
      } else {
        setTrackers((List<ThriftTaskTrackerStatus>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRACKERS:
      return getTrackers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRACKERS:
      return isSetTrackers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftTaskTrackerStatusList)
      return this.equals((ThriftTaskTrackerStatusList)that);
    return false;
  }

  public boolean equals(ThriftTaskTrackerStatusList that) {
    if (that == null)
      return false;

    boolean this_present_trackers = true && this.isSetTrackers();
    boolean that_present_trackers = true && that.isSetTrackers();
    if (this_present_trackers || that_present_trackers) {
      if (!(this_present_trackers && that_present_trackers))
        return false;
      if (!this.trackers.equals(that.trackers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThriftTaskTrackerStatusList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftTaskTrackerStatusList typedOther = (ThriftTaskTrackerStatusList)other;

    lastComparison = Boolean.valueOf(isSetTrackers()).compareTo(typedOther.isSetTrackers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrackers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trackers, typedOther.trackers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftTaskTrackerStatusList(");
    boolean first = true;

    sb.append("trackers:");
    if (this.trackers == null) {
      sb.append("null");
    } else {
      sb.append(this.trackers);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftTaskTrackerStatusListStandardSchemeFactory implements SchemeFactory {
    public ThriftTaskTrackerStatusListStandardScheme getScheme() {
      return new ThriftTaskTrackerStatusListStandardScheme();
    }
  }

  private static class ThriftTaskTrackerStatusListStandardScheme extends StandardScheme<ThriftTaskTrackerStatusList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftTaskTrackerStatusList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRACKERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list78 = iprot.readListBegin();
                struct.trackers = new ArrayList<ThriftTaskTrackerStatus>(_list78.size);
                for (int _i79 = 0; _i79 < _list78.size; ++_i79)
                {
                  ThriftTaskTrackerStatus _elem80; // required
                  _elem80 = new ThriftTaskTrackerStatus();
                  _elem80.read(iprot);
                  struct.trackers.add(_elem80);
                }
                iprot.readListEnd();
              }
              struct.setTrackersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftTaskTrackerStatusList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.trackers != null) {
        oprot.writeFieldBegin(TRACKERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.trackers.size()));
          for (ThriftTaskTrackerStatus _iter81 : struct.trackers)
          {
            _iter81.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftTaskTrackerStatusListTupleSchemeFactory implements SchemeFactory {
    public ThriftTaskTrackerStatusListTupleScheme getScheme() {
      return new ThriftTaskTrackerStatusListTupleScheme();
    }
  }

  private static class ThriftTaskTrackerStatusListTupleScheme extends TupleScheme<ThriftTaskTrackerStatusList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftTaskTrackerStatusList struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTrackers()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTrackers()) {
        {
          oprot.writeI32(struct.trackers.size());
          for (ThriftTaskTrackerStatus _iter82 : struct.trackers)
          {
            _iter82.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftTaskTrackerStatusList struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list83 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.trackers = new ArrayList<ThriftTaskTrackerStatus>(_list83.size);
          for (int _i84 = 0; _i84 < _list83.size; ++_i84)
          {
            ThriftTaskTrackerStatus _elem85; // required
            _elem85 = new ThriftTaskTrackerStatus();
            _elem85.read(iprot);
            struct.trackers.add(_elem85);
          }
        }
        struct.setTrackersIsSet(true);
      }
    }
  }

}

