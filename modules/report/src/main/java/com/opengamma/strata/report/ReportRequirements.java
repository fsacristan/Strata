/**
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.strata.report;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;
import com.opengamma.strata.calc.Column;

/**
 * Describes the requirements for a report to be run in terms of trade-level measures that
 * can be separately obtained by the calculation engine.
 */
@BeanDefinition(builderScope = "private")
public final class ReportRequirements implements ImmutableBean {

  /**
   * The trade-level measure requirements.
   */
  @PropertyDefinition(validate = "notNull")
  private final ImmutableList<Column> tradeMeasureRequirements;

  //-------------------------------------------------------------------------
  /**
   * Obtains an instance from the columns.
   *
   * @param columns  the columns to calculate
   * @return the requirements
   */
  public static ReportRequirements of(Column... columns) {
    return new ReportRequirements(ImmutableList.copyOf(columns));
  }

  /**
   * Obtains an instance from the columns.
   *
   * @param columns  the columns to calculate
   * @return the requirements
   */
  public static ReportRequirements of(List<Column> columns) {
    return new ReportRequirements(columns);
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code ReportRequirements}.
   * @return the meta-bean, not null
   */
  public static ReportRequirements.Meta meta() {
    return ReportRequirements.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(ReportRequirements.Meta.INSTANCE);
  }

  private ReportRequirements(
      List<Column> tradeMeasureRequirements) {
    JodaBeanUtils.notNull(tradeMeasureRequirements, "tradeMeasureRequirements");
    this.tradeMeasureRequirements = ImmutableList.copyOf(tradeMeasureRequirements);
  }

  @Override
  public ReportRequirements.Meta metaBean() {
    return ReportRequirements.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the trade-level measure requirements.
   * @return the value of the property, not null
   */
  public ImmutableList<Column> getTradeMeasureRequirements() {
    return tradeMeasureRequirements;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      ReportRequirements other = (ReportRequirements) obj;
      return JodaBeanUtils.equal(tradeMeasureRequirements, other.tradeMeasureRequirements);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(tradeMeasureRequirements);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(64);
    buf.append("ReportRequirements{");
    buf.append("tradeMeasureRequirements").append('=').append(JodaBeanUtils.toString(tradeMeasureRequirements));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ReportRequirements}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code tradeMeasureRequirements} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<ImmutableList<Column>> tradeMeasureRequirements = DirectMetaProperty.ofImmutable(
        this, "tradeMeasureRequirements", ReportRequirements.class, (Class) ImmutableList.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "tradeMeasureRequirements");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 968654090:  // tradeMeasureRequirements
          return tradeMeasureRequirements;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends ReportRequirements> builder() {
      return new ReportRequirements.Builder();
    }

    @Override
    public Class<? extends ReportRequirements> beanType() {
      return ReportRequirements.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code tradeMeasureRequirements} property.
     * @return the meta-property, not null
     */
    public MetaProperty<ImmutableList<Column>> tradeMeasureRequirements() {
      return tradeMeasureRequirements;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 968654090:  // tradeMeasureRequirements
          return ((ReportRequirements) bean).getTradeMeasureRequirements();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code ReportRequirements}.
   */
  private static final class Builder extends DirectFieldsBeanBuilder<ReportRequirements> {

    private List<Column> tradeMeasureRequirements = ImmutableList.of();

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 968654090:  // tradeMeasureRequirements
          return tradeMeasureRequirements;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 968654090:  // tradeMeasureRequirements
          this.tradeMeasureRequirements = (List<Column>) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public ReportRequirements build() {
      return new ReportRequirements(
          tradeMeasureRequirements);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(64);
      buf.append("ReportRequirements.Builder{");
      buf.append("tradeMeasureRequirements").append('=').append(JodaBeanUtils.toString(tradeMeasureRequirements));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
