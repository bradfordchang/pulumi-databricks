// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SqlQueryParameterDatetimeRangeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterDatetimeRangeRangeArgs Empty = new SqlQueryParameterDatetimeRangeRangeArgs();

    @Import(name="end", required=true)
    private Output<String> end;

    public Output<String> end() {
        return this.end;
    }

    @Import(name="start", required=true)
    private Output<String> start;

    public Output<String> start() {
        return this.start;
    }

    private SqlQueryParameterDatetimeRangeRangeArgs() {}

    private SqlQueryParameterDatetimeRangeRangeArgs(SqlQueryParameterDatetimeRangeRangeArgs $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterDatetimeRangeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterDatetimeRangeRangeArgs $;

        public Builder() {
            $ = new SqlQueryParameterDatetimeRangeRangeArgs();
        }

        public Builder(SqlQueryParameterDatetimeRangeRangeArgs defaults) {
            $ = new SqlQueryParameterDatetimeRangeRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder end(Output<String> end) {
            $.end = end;
            return this;
        }

        public Builder end(String end) {
            return end(Output.of(end));
        }

        public Builder start(Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public SqlQueryParameterDatetimeRangeRangeArgs build() {
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
