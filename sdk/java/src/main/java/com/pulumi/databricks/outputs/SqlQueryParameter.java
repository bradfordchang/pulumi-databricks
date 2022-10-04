// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlQueryParameterDate;
import com.pulumi.databricks.outputs.SqlQueryParameterDateRange;
import com.pulumi.databricks.outputs.SqlQueryParameterDatetime;
import com.pulumi.databricks.outputs.SqlQueryParameterDatetimeRange;
import com.pulumi.databricks.outputs.SqlQueryParameterDatetimesec;
import com.pulumi.databricks.outputs.SqlQueryParameterDatetimesecRange;
import com.pulumi.databricks.outputs.SqlQueryParameterEnum;
import com.pulumi.databricks.outputs.SqlQueryParameterNumber;
import com.pulumi.databricks.outputs.SqlQueryParameterQuery;
import com.pulumi.databricks.outputs.SqlQueryParameterText;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryParameter {
    private @Nullable SqlQueryParameterDate date;
    private @Nullable SqlQueryParameterDateRange dateRange;
    private @Nullable SqlQueryParameterDatetime datetime;
    private @Nullable SqlQueryParameterDatetimeRange datetimeRange;
    private @Nullable SqlQueryParameterDatetimesec datetimesec;
    private @Nullable SqlQueryParameterDatetimesecRange datetimesecRange;
    private @Nullable SqlQueryParameterEnum enum_;
    private String name;
    private @Nullable SqlQueryParameterNumber number;
    private @Nullable SqlQueryParameterQuery query;
    private @Nullable SqlQueryParameterText text;
    private @Nullable String title;

    private SqlQueryParameter() {}
    public Optional<SqlQueryParameterDate> date() {
        return Optional.ofNullable(this.date);
    }
    public Optional<SqlQueryParameterDateRange> dateRange() {
        return Optional.ofNullable(this.dateRange);
    }
    public Optional<SqlQueryParameterDatetime> datetime() {
        return Optional.ofNullable(this.datetime);
    }
    public Optional<SqlQueryParameterDatetimeRange> datetimeRange() {
        return Optional.ofNullable(this.datetimeRange);
    }
    public Optional<SqlQueryParameterDatetimesec> datetimesec() {
        return Optional.ofNullable(this.datetimesec);
    }
    public Optional<SqlQueryParameterDatetimesecRange> datetimesecRange() {
        return Optional.ofNullable(this.datetimesecRange);
    }
    public Optional<SqlQueryParameterEnum> enum_() {
        return Optional.ofNullable(this.enum_);
    }
    public String name() {
        return this.name;
    }
    public Optional<SqlQueryParameterNumber> number() {
        return Optional.ofNullable(this.number);
    }
    public Optional<SqlQueryParameterQuery> query() {
        return Optional.ofNullable(this.query);
    }
    public Optional<SqlQueryParameterText> text() {
        return Optional.ofNullable(this.text);
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SqlQueryParameterDate date;
        private @Nullable SqlQueryParameterDateRange dateRange;
        private @Nullable SqlQueryParameterDatetime datetime;
        private @Nullable SqlQueryParameterDatetimeRange datetimeRange;
        private @Nullable SqlQueryParameterDatetimesec datetimesec;
        private @Nullable SqlQueryParameterDatetimesecRange datetimesecRange;
        private @Nullable SqlQueryParameterEnum enum_;
        private String name;
        private @Nullable SqlQueryParameterNumber number;
        private @Nullable SqlQueryParameterQuery query;
        private @Nullable SqlQueryParameterText text;
        private @Nullable String title;
        public Builder() {}
        public Builder(SqlQueryParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.dateRange = defaults.dateRange;
    	      this.datetime = defaults.datetime;
    	      this.datetimeRange = defaults.datetimeRange;
    	      this.datetimesec = defaults.datetimesec;
    	      this.datetimesecRange = defaults.datetimesecRange;
    	      this.enum_ = defaults.enum_;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.query = defaults.query;
    	      this.text = defaults.text;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder date(@Nullable SqlQueryParameterDate date) {
            this.date = date;
            return this;
        }
        @CustomType.Setter
        public Builder dateRange(@Nullable SqlQueryParameterDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        @CustomType.Setter
        public Builder datetime(@Nullable SqlQueryParameterDatetime datetime) {
            this.datetime = datetime;
            return this;
        }
        @CustomType.Setter
        public Builder datetimeRange(@Nullable SqlQueryParameterDatetimeRange datetimeRange) {
            this.datetimeRange = datetimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder datetimesec(@Nullable SqlQueryParameterDatetimesec datetimesec) {
            this.datetimesec = datetimesec;
            return this;
        }
        @CustomType.Setter
        public Builder datetimesecRange(@Nullable SqlQueryParameterDatetimesecRange datetimesecRange) {
            this.datetimesecRange = datetimesecRange;
            return this;
        }
        @CustomType.Setter("enum")
        public Builder enum_(@Nullable SqlQueryParameterEnum enum_) {
            this.enum_ = enum_;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable SqlQueryParameterNumber number) {
            this.number = number;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable SqlQueryParameterQuery query) {
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder text(@Nullable SqlQueryParameterText text) {
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public SqlQueryParameter build() {
            final var o = new SqlQueryParameter();
            o.date = date;
            o.dateRange = dateRange;
            o.datetime = datetime;
            o.datetimeRange = datetimeRange;
            o.datetimesec = datetimesec;
            o.datetimesecRange = datetimesecRange;
            o.enum_ = enum_;
            o.name = name;
            o.number = number;
            o.query = query;
            o.text = text;
            o.title = title;
            return o;
        }
    }
}