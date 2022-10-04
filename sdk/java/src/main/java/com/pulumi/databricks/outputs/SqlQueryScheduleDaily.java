// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryScheduleDaily {
    private Integer intervalDays;
    private String timeOfDay;
    private @Nullable String untilDate;

    private SqlQueryScheduleDaily() {}
    public Integer intervalDays() {
        return this.intervalDays;
    }
    public String timeOfDay() {
        return this.timeOfDay;
    }
    public Optional<String> untilDate() {
        return Optional.ofNullable(this.untilDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryScheduleDaily defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer intervalDays;
        private String timeOfDay;
        private @Nullable String untilDate;
        public Builder() {}
        public Builder(SqlQueryScheduleDaily defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDays = defaults.intervalDays;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.untilDate = defaults.untilDate;
        }

        @CustomType.Setter
        public Builder intervalDays(Integer intervalDays) {
            this.intervalDays = Objects.requireNonNull(intervalDays);
            return this;
        }
        @CustomType.Setter
        public Builder timeOfDay(String timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }
        @CustomType.Setter
        public Builder untilDate(@Nullable String untilDate) {
            this.untilDate = untilDate;
            return this;
        }
        public SqlQueryScheduleDaily build() {
            final var o = new SqlQueryScheduleDaily();
            o.intervalDays = intervalDays;
            o.timeOfDay = timeOfDay;
            o.untilDate = untilDate;
            return o;
        }
    }
}