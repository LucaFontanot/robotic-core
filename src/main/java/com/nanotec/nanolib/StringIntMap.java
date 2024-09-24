/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class StringIntMap extends java.util.AbstractMap<String, Integer> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringIntMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringIntMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(StringIntMap obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NanolibJNI.delete_StringIntMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  public int size() {
    return sizeImpl();
  }

  public boolean containsKey(java.lang.Object key) {
    if (!(key instanceof String)) {
      return false;
    }

    return containsImpl((String)key);
  }

  public Integer get(java.lang.Object key) {
    if (!(key instanceof String)) {
      return null;
    }

    Iterator itr = find((String) key);
    if (itr.isNot(end())) {
      return itr.getValue();
    }

    return null;
  }

  public Integer put(String key, Integer value) {
    Iterator itr = find((String) key);
    if (itr.isNot(end())) {
      Integer oldValue = itr.getValue();
      itr.setValue(value);
      return oldValue;
    } else {
      putUnchecked(key, value);
      return null;
    }
  }

  public Integer remove(java.lang.Object key) {
    if (!(key instanceof String)) {
      return null;
    }

    Iterator itr = find((String) key);
    if (itr.isNot(end())) {
      Integer oldValue = itr.getValue();
      removeUnchecked(itr);
      return oldValue;
    } else {
      return null;
    }
  }

  public java.util.Set<Entry<String, Integer>> entrySet() {
    java.util.Set<Entry<String, Integer>> setToReturn =
        new java.util.HashSet<Entry<String, Integer>>();

    Iterator itr = begin();
    final Iterator end = end();
    while (itr.isNot(end)) {
      setToReturn.add(new Entry<String, Integer>() {
        private Iterator iterator;

        private Entry<String, Integer> init(Iterator iterator) {
          this.iterator = iterator;
          return this;
        }

        public String getKey() {
          return iterator.getKey();
        }

        public Integer getValue() {
          return iterator.getValue();
        }

        public Integer setValue(Integer newValue) {
          Integer oldValue = iterator.getValue();
          iterator.setValue(newValue);
          return oldValue;
        }
      }.init(itr));
      itr = itr.getNextUnchecked();
    }

    return setToReturn;
  }

  public StringIntMap() {
    this(NanolibJNI.new_StringIntMap__SWIG_0(), true);
  }

  public StringIntMap(StringIntMap other) {
    this(NanolibJNI.new_StringIntMap__SWIG_1(StringIntMap.getCPtr(other), other), true);
  }

  static protected class Iterator {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Iterator(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Iterator obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected static long swigRelease(Iterator obj) {
      long ptr = 0;
      if (obj != null) {
        if (!obj.swigCMemOwn)
          throw new RuntimeException("Cannot release ownership as memory is not owned");
        ptr = obj.swigCPtr;
        obj.swigCMemOwn = false;
        obj.delete();
      }
      return ptr;
    }
  
    @SuppressWarnings("deprecation")
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          NanolibJNI.delete_StringIntMap_Iterator(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    private StringIntMap.Iterator getNextUnchecked() {
      return new StringIntMap.Iterator(NanolibJNI.StringIntMap_Iterator_getNextUnchecked(swigCPtr, this), true);
    }
  
    private boolean isNot(StringIntMap.Iterator other) {
      return NanolibJNI.StringIntMap_Iterator_isNot(swigCPtr, this, StringIntMap.Iterator.getCPtr(other), other);
    }
  
    private String getKey() {
      return NanolibJNI.StringIntMap_Iterator_getKey(swigCPtr, this);
    }
  
    private int getValue() {
      return NanolibJNI.StringIntMap_Iterator_getValue(swigCPtr, this);
    }
  
    private void setValue(int newValue) {
      NanolibJNI.StringIntMap_Iterator_setValue(swigCPtr, this, newValue);
    }
  
  }

  public boolean isEmpty() {
    return NanolibJNI.StringIntMap_isEmpty(swigCPtr, this);
  }

  public void clear() {
    NanolibJNI.StringIntMap_clear(swigCPtr, this);
  }

  private StringIntMap.Iterator find(String key) {
    return new StringIntMap.Iterator(NanolibJNI.StringIntMap_find(swigCPtr, this, key), true);
  }

  private StringIntMap.Iterator begin() {
    return new StringIntMap.Iterator(NanolibJNI.StringIntMap_begin(swigCPtr, this), true);
  }

  private StringIntMap.Iterator end() {
    return new StringIntMap.Iterator(NanolibJNI.StringIntMap_end(swigCPtr, this), true);
  }

  private int sizeImpl() {
    return NanolibJNI.StringIntMap_sizeImpl(swigCPtr, this);
  }

  private boolean containsImpl(String key) {
    return NanolibJNI.StringIntMap_containsImpl(swigCPtr, this, key);
  }

  private void putUnchecked(String key, int value) {
    NanolibJNI.StringIntMap_putUnchecked(swigCPtr, this, key, value);
  }

  private void removeUnchecked(StringIntMap.Iterator itr) {
    NanolibJNI.StringIntMap_removeUnchecked(swigCPtr, this, StringIntMap.Iterator.getCPtr(itr), itr);
  }

}
